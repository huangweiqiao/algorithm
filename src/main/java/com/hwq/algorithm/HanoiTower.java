package com.hwq.algorithm;

/**
 * 汉诺塔
 * Created by hwq on 2019/9/10.
 */
public class HanoiTower {
    /**
     * 移动盘子
     * topN 移动的盘子数
     * from 起始塔座
     * inter 中间塔座
     * to 目标塔座
     */
    public static void doTower(int topN,char from,char inter,char to ){
        if(topN==1){
            System.out.println("盘子1,从"+from+"塔座到"+to+"塔座");
        }else{
            //拆分成子树，将top-1看成一个整体移到中间塔座，然后将第topN移到目标塔座
            doTower(topN-1,from, to,inter);
            System.out.println("盘子"+topN+"，从"+from +"塔座到"+to+"塔座");
            //现在top-1的子树在中间塔座了，我们要将剩下的top-1个经过开始的塔座移到目标塔座
            doTower(topN-1,inter, from ,to);
        }
    }

    public static void main(String[] args) {
        doTower(3,'A','B','C');
    }
}
