package com.hwq.algorithm.datastructure;

/**
 * Created by hwq on 2019/10/22.
 */
public class HashTableLink {
    private HashTableNode first;
    public HashTableLink(){
        first = null;
    }

    public  void insertFirst(Info info){
        HashTableNode node = new HashTableNode(info);
        node.next = first;
        first = node;
    }

    public HashTableNode deleteFirst(){
        HashTableNode tmp = first;
        first = tmp.next;
        return tmp;
    }

    public HashTableNode find(String key){
        HashTableNode current = first;
        while (!key.equals(current.info.getKey())){
            if (current.next==null){
                return null;
            }
            current = current.next;
        }
        return current;
    }

    public HashTableNode delete(String key){
        HashTableNode current = first;
        HashTableNode previous = first;
        while (!key.equals(current.info.getKey())){
            if (current.next==null){
                return null;
            }
            previous = current;
            current = current.next;
        }
        if (current==first){
            first = first.next;
        }else{
            previous.next = current.next;
        }
        return current;
    }
}
