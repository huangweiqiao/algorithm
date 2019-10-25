package com.hwq.algorithm.datastructure;

/**
 * Created by hwq on 2019/10/23.
 * 图中的 顶点类
 */
public class Vertex {
    public char label;
    //是否已经被访问
    public boolean wasVisited;
    public Vertex(char label){
        this.label = label;
    }
}
