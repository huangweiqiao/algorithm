package com.hwq.algorithm.datastructure;

import java.math.BigInteger;

/**
 * Created by hwq on 2019/10/19.
 * 当冲突发生时，通过查找数组的一个空位，并将数据填入，
 * 而不再用哈希函数得到的数组下标，这个方法叫做开放地址法。

 */
public class HashTableOpenAddress {
    private Info [] arr;

    public HashTableOpenAddress(){
        arr = new Info[100];
    }

    public HashTableOpenAddress(int maxSize){
        arr = new Info[maxSize];
    }

    public void insert(Info info){
        //获取关键字
        String key = info.getKey();
        //关键字所自定的哈希数
        int hashVal = hashCode(key);
        //如果这个索引已经被占用，而且里面是一个未被删除的数据
        while (arr[hashVal]!=null &&  arr[hashVal].getName() !=null ){
            //进行递加
            ++hashVal;
            //始终不能超过数组的长度
            hashVal %= arr.length;
        }
        arr[hashVal] = info;
    }

    public Info find(String key){
        int hashVal = hashCode(key);
        while (arr[hashVal] !=null){
            if (arr[hashVal].getKey().equals(key)){
                return arr[hashVal];
            }
            ++hashVal;
            hashVal %= arr.length;
        }
        return null;
    }

    public Info delete(String key){
        int hashVal = hashCode(key);
        while (arr[hashVal] != null){
            if (arr[hashVal].getKey().equals(key)){
                Info tmp = arr[hashVal];
                tmp.setName(null);
                return tmp;
            }
            ++hashVal;
            hashVal%=arr.length;
        }
        return null;
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
