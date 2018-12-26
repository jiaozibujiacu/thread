package com.jiaozi.thread.extendThread; 
/** 
* @author xiam 
* @version 创建时间：2018年11月13日 下午2:09:31 
*  1.4 isAlive方法
*/
public class ThreadTest03 {

    public static void main(String[] args) {
        MyThread03 myThread03 = new MyThread03();
        System.out.println("begin-------"+myThread03.isAlive());
        myThread03.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("end---------"+myThread03.isAlive());
    }
}

class MyThread03 extends Thread{
    @Override
    public void run() {
        System.out.println("run--------"+this.isAlive());
    }
}

