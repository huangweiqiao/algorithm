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
        tree.insert(4,"Zhangsan");
        tree.insert(90,"Lisi");

       /* System.out.println(tree.root.data);
        System.out.println(tree.root.leftChild.data);
        System.out.println(tree.root.rightChild.data);
        System.out.println(tree.root.rightChild.leftChild.data);
        System.out.println("===================");
        TreeNode node = tree.find(20);
        System.out.println(node.data+","+node.sData);*/

/*        System.out.println("=========前序遍历==========");
        tree.frontOrder(tree.root);

        System.out.println("=========中序遍历==========");
        tree.inOrder(tree.root);

        System.out.println("=========后序遍历==========");
        tree.afterOrder(tree.root);

        System.out.println("=========删除叶子节点==========");
        tree.delete(4);*/

        System.out.println("=========删除有一个子节点的节点==========");
        tree.delete(3);

        System.out.println("=========中序遍历==========");
        tree.inOrder(tree.root);
    }
}
