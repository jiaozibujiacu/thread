package com.jiaozi.thread.extendThread; 
/** 
* @author xiam 
* @version 创建时间：2018年11月12日 上午11:30:58 
*  线程实现测试类
*/
public class ThreadTest {

    public static void main(String[] args) {
        Thread thread01 = new Thread01();
        Thread thread02 = new Thread02();
        thread01.start();
        thread02.start();
        
    }
           
}

class Thread01 extends Thread{
    @Override
    public void run() {
        System.out.println(this.getId());
    }
}

class Thread02 extends Thread{
    @Override
    public void run() {
        System.out.println(this.getId());
    }
}


