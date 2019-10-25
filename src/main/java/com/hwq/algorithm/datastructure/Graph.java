package com.hwq.algorithm.datastructure;

/**
 * Created by hwq on 2019/10/23.
 * 图
 */
public class Graph {
    //顶点数组
    private Vertex [] vertexList;
    //邻接矩阵
    private int [][] adjMat;
    //顶点的最大数目
    private int maxSize=20;
    //当前顶点
    private int nvertex;
    //栈
    private MyStack stack;

    public Graph(){
        vertexList = new Vertex[maxSize];
        adjMat = new int [maxSize][maxSize];
        for (int i=0;i<maxSize;i++){
            for (int j=0;j<maxSize;j++){
                adjMat[i][j]=0;
            }
        }
        nvertex = 0;
        stack = new MyStack();
    }

    /**
     * 添加顶点的方法
     */
    public void addVertex(char label){
        vertexList[nvertex++] = new Vertex(label);
    }

    /**
     * 添加边
     * @param start
     * @param end
     */
    public void addEdge(int start,int end){
        //A顶点到B顶点是连接的，因此B顶点到A顶点也是连接的
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    /**
     * 获取邻接且未访问过的节点
     */
    public int getadjUnvisitedVertex(int v){
        for (int i = 0;i<nvertex;i++){
            if (adjMat[v][i]==1 && vertexList[i].wasVisited==false){
                //说明i这个节点是 v这个节点的 邻节点且未访问过
                return i;
            }
        }
        return -1;//没有邻接的且未访问过的节点
    }

    /**
     * 深度优先搜索
     1、如果可能，访问一个邻接的未访问过的顶点，标记它为已访问，并把它放入栈中
     （继续访问该顶点的未访问过的邻接，以此类推直到最深的那个邻接点）。
     2、当不能执行规则1时，如果栈不为空，就从栈中弹出一个顶点
     （对弹出来的顶点继续执行规则1，如果不满足规则1则继续从栈中弹出一个顶点）。
     3、当不能执行规则1和规则2，就完成了整个搜索过程。
     */
    public void dfs(){
        //首先访问0号顶点
        vertexList[0].wasVisited=true;
        //显示顶点信息
        displayVertex(0);
        //压如栈中
        stack.push(0);
        while (!stack.isEmpty()){
            //获得一个未访问过的邻节点
            int v = getadjUnvisitedVertex((int)stack.peek());
            if (v==-1){
                //说明找不到邻接且未访问过的节点，因此弹出该顶点
                stack.pop();
            }else {
                //标记为已访问
                vertexList[v].wasVisited=true;
                //显示下顶点信息
                displayVertex(v);
                //压如栈中
                stack.push(v);
            }
        }
        //搜索完成以后，要将访问信息修改
        for (int i=0;i<nvertex;i++){
            vertexList[i].wasVisited=false;
        }
    }

    /**
     * 最小生成树
     */
    public void mst(){
        //首先访问0号顶点
        vertexList[0].wasVisited=true;
        //压如栈中
        stack.push(0);
        while (!stack.isEmpty()){
            //当前顶点
            int currentVertex = (int)stack.peek();
            //获得一个未访问过的邻节点
            int v = getadjUnvisitedVertex(currentVertex);
            if (v==-1){
                //说明找不到邻接且未访问过的节点，因此弹出该顶点
                stack.pop();
            }else {
                //标记为已访问
                vertexList[v].wasVisited=true;
                //压如栈中
                stack.push(v);
                //显示下顶点信息
                displayVertex(currentVertex);
                System.out.print("-");
                displayVertex(v);
                System.out.print(" ");
            }
        }
        //搜索完成以后，要将访问信息修改
        for (int i=0;i<nvertex;i++){
            vertexList[i].wasVisited=false;
        }
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

}
