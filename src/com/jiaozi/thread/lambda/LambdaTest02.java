package com.jiaozi.thread.lambda; 
/** 
* @author xiam 
* @version 创建时间：2018年11月12日 下午3:18:11 
*  lambda表达式匿名内部类的使用
*/
public class LambdaTest02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("hello!world!");
            }            
        });
        thread.start();
        new Thread(()->System.out.println("我是你爹")).start(); 
    }

}
