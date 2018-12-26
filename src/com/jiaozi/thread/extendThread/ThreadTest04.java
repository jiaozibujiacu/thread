package com.jiaozi.thread.extendThread; 
/** 
* @author xiam 
* @version 创建时间：2018年12月24日 下午5:15:05 
*  1.5 sleep 方法的使用
*/
public class ThreadTest04 {

    public static void main(String[] args) {
        MyThread04 myThread= new MyThread04();
        System.out.println("begin##"+System.currentTimeMillis());
        myThread.start();
        //myThread.run();
        System.out.println("end##"+System.currentTimeMillis());
    }
}

class MyThread04 extends Thread{
    @Override
    public void run() {        
        try {
            System.out.println("hreadName："+this.currentThread().getName()+"##begin"+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("threadName: "+this.currentThread().getName()+"##end"+System.currentTimeMillis());
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }               
    }
}