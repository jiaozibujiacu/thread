package com.jiaozi.thread.extendThread; 
/** 
* @author xiam 
* @version 创建时间：2018年11月13日 下午1:54:44 
*  1.3 currentThread 的方法
*      判断当前是被那个线程调用
*/
public class ThreadTest02 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread myThread01 = new MyThread01();
        //myThread01.start(); Thread-0
        //myThread01.run(); main
    }
    
}

class MyThread01 extends Thread{
    MyThread01(){
        System.out.println(Thread.currentThread().getName());
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
