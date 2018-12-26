package com.jiaozi.thread.extendThread; 
/** 
* @author xiam 
* @version 创建时间：2018年12月26日 上午11:23:44 
*  1.7.1(线程的停止) interrupted 测试当前线程是否已经中断 执行后状态重新标识为false/isInterrupted 判断线程是否中断 
*/
public class ThreadTest05 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        //System.out.println(Thread.interrupted());
        //System.out.println(Thread.interrupted());
        System.out.println("end------");
    }

}

class Thread05 extends Thread {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
    }
}
