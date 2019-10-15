package com.hwq.algorithm.datastructure.test;

import com.hwq.algorithm.datastructure.Tree;
import com.hwq.algorithm.datastructure.TreeNode;

/**
 * Created by hwq on 2019/10/14.
 */
public class TestTree {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10,"James");
        tree.insert(20,"Yao");
        tree.insert(15,"Kobi");
        tree.insert(3,"Mac");

        System.out.println(tree.root.data);
        System.out.println(tree.root.leftChild.data);
        System.out.println(tree.root.rightChild.data);
        System.out.println(tree.root.rightChild.leftChild.data);
        System.out.println("===================");
        TreeNode node = tree.find(20);
        System.out.println(node.data+","+node.sData);
    }
}
