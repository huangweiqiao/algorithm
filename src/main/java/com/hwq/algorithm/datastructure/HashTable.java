package com.hwq.algorithm.datastructure;

import java.math.BigInteger;

/**
 * Created by hwq on 2019/10/19.
 */
public class HashTable {
    private Info [] arr;

    public HashTable(){
        arr = new Info[100];
    }

    public HashTable(int maxSize){
        arr = new Info[maxSize];
    }

    public void insert(Info info){
        arr[hashCode(info.getKey())] = info;
    }

    public Info find(String key){
        return arr[hashCode(key)];
    }

    public int hashCode(String key){
       BigInteger hashValue = new BigInteger("0");
        /* for (int i=key.length()-1;i>=0;i--){
            int letter = key.charAt(i)-96;
            hashValue+=letter;
        }*/
        BigInteger pow27 = new BigInteger("1");;
        for (int i=key.length()-1;i>=0;i--){
            int letter = key.charAt(i) - 96;
            BigInteger letterB = new BigInteger(letter+"");
            hashValue = hashValue.add(letterB.multiply(pow27));
            pow27 = pow27.multiply(new BigInteger(27+""));
        }
        return hashValue.mod(new BigInteger(arr.length+"")).intValue();
    }
}
