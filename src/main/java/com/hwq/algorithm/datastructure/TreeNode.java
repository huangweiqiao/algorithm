package com.hwq.algorithm.datastructure;

/**
 * 二叉树节点
 * Created by hwq on 2019/10/14.
 */
public class TreeNode {
    //数据项
    public long data;
    //数据项
    public String sData;
    //左子节点
    public TreeNode leftChild;
    //右子节点
    public TreeNode rightChild;

    public TreeNode(long data,String sData){

        this.data = data;
        this.sData = sData;
    }
}
