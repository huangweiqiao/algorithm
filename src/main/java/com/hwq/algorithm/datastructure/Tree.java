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
     * 在删除之前首先要查找要删除的节点，找到节点后，
     * 这个要删除的节点可能会有三种情况需要考虑
     * 1、该节点是叶子结点，没有子节点
     * 要删除叶子节点，在要改变该节点的父节点的引用值，将指向该节点的引用设置为null就可以了。
     *
     * 2、该节点有一个字节点
     * 改变父亲节点的引用，将其指向要删除节点的子节点
     *
     * 3、该节点有两个节点
     * 要删除有两个子节点的节点，就需要使用它的中序后继来替代该节点
     * 中序后继：节点的右节点（包括子树下的子树，为什么是右节点而不是左节点呢，
     * 因为删除当前节点需要一个大于当前节点但又是所有大于当前节点里面最小的节点来替换）,沿着最左边线找到最小的子节点。
     * 也就是说如果要删除一个有两个子节点的节点，那么就将这个要被删除的节点的父节点指向这个最小子节点
     * @param value
     */
    public boolean delete (long value){
        //引用当前节点，从根节点开始
        TreeNode current = root;
        //应用当前节点的父节点
        TreeNode parent = root;
        //是否为左节点
        boolean isLeftChild = true;
        while (current.data!=value){
            parent = current;
            if (current.data > value){
                current = current.leftChild;
                isLeftChild = true;
            }else{
                current = current.rightChild;
                isLeftChild = false;
            }
            //如果找不到
            if (current==null){
                return false;
            }
        }
        //删除叶子节点，也就是该节点没有子节点
        if (current.leftChild==null && current.rightChild==null){
            if (current==root){
                root = null;
            }
            //如果它是父节点的左子节点
            if (isLeftChild){
                parent.leftChild=null;
            }else {
                parent.rightChild = null;
            }
        }else if (current.rightChild==null){ //当前节点只有左子节点
            if (current==root){
                root = current.leftChild;
            }
            if (isLeftChild){
                parent.leftChild=current.leftChild;
            }else {
                parent.rightChild = current.leftChild;
            }
        }else if (current.leftChild==null){ //当前节点只有右子节点
            if (current==root){
                root = current.rightChild;
            }
            if (isLeftChild){
                parent.leftChild=current.rightChild;
            }else {
                parent.rightChild = current.rightChild;
            }
        }else { //当前节点有两个子节点
            TreeNode successor = getSuccessor(current);
            if (current == root){
                root = successor;
            }else if (isLeftChild){
                parent.leftChild = successor;
            }else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    /**
     * 根据要删除的节点，找到 中序后继节点
     * @param delNode
     * @return
     */
    private TreeNode getSuccessor(TreeNode delNode){
        TreeNode successor = delNode;
        TreeNode succcessorParent = delNode;
        TreeNode current = delNode.rightChild;
        while (current!=null){
            succcessorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor!=delNode.rightChild){
            succcessorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return  successor;
    }

    /**
     * 前序遍历
     * @param localNode
     */
    public void frontOrder(TreeNode localNode){
        if (localNode !=null){
            //访问根节点
            System.out.println(localNode.data+","+localNode.sData);
            //前序遍历左子树
            frontOrder(localNode.leftChild);
            //前序遍历右子树
            frontOrder(localNode.rightChild);
        }
    }

    /**
     * 中序遍历
     */
    public void inOrder(TreeNode localNode){
        if (localNode!=null){
            //中序遍历左子树
            inOrder(localNode.leftChild);
            //访问根节点
            System.out.println(localNode.data+","+localNode.sData);
            //中序遍历右子树
            inOrder(localNode.rightChild);
        }
    }

    /**
     * 后序遍历
     */
    public void afterOrder(TreeNode localNode){
        if (localNode!=null){
            //后序遍历左子树
            afterOrder(localNode.leftChild);
            //后序遍历右子树
            afterOrder(localNode.rightChild);
            //访问根节点
            System.out.println(localNode.data+","+localNode.sData);
        }
    }
}
