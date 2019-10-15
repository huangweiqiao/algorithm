package com.hwq.algorithm.datastructure;

/**
 * 二叉树
 * Created by hwq on 2019/10/14.
 */
public class Tree {
    //根节点
    public TreeNode root;

    /**
     * 插入节点
     * 从根节点开始查找一个相应的节点，这个节点将成为新插入节点的父节点，
     * 当父节点找到后，通过判断新节点的值比父节点的值的大小来决定是连接到左子节点还是右子节点，
     * 比父节点的值小就放到左边，否则就放到右边
     * @param value
     */
    public void insert(long value,String sData){
        //封装节点
        TreeNode newNode = new TreeNode(value,sData);
        //引用当前节点
        TreeNode current = root;
        //引用父节点
        TreeNode parent;
        //如果root为null,也就是第一次插入的时候
        if (root==null){
            root = newNode;
            return;
        }else {
            while (true){
                //父节点指向当前节点
                parent = current;
                //如果当前指向的节点数据比插入的要大，则向左走
                if (current.data>value){
                    current = current.leftChild;
                    if (current==null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if (current==null){
                        parent.rightChild = newNode;
                        return ;
                    }
                }
            }

        }


    }

    /**
     * 查找节点
     * 从根节点开始查找，如果查找的节点值比当前节点的值小，则继续查找其左子树，
     * 否则查找其右子树
     * @param value
     */
    public TreeNode find(long value){
        //引用当前节点，从根节点开始
        TreeNode current = root;
        //循环，只要查找的值不等于当前节点的数据项
        while (current.data != value){
            //进行比较，比较查找值和当前节点的大小
            if(current.data > value){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }
            //如果找不到
            if (current==null){
                return  null;
            }
        }
        return current;
    }

    /**
     * 删除节点
     * @param value
     */
    public void delete (long value){

    }
}
