package com.jiaozi.thread.extendThread; 
/** 
* @author xiam 
* @version 创建时间：2018年11月13日 下午1:39:39 
*  1.2.3实例变量和线程安全
*/
public class ThreadTest01 {

    public static void main(String[] args) {
//        变量不共享
         Thread myThread = new MyThread("a");
         Thread myThread01 = new MyThread("b");
         myThread.start();
         myThread01.start();
        
        
//        变量共享
//        Thread myThread01 = new MyThread();
//        Thread test01 = new Thread(myThread01,"aa");
//        Thread test02 = new Thread(myThread01,"bb");
//        Thread test03 = new Thread(myThread01,"cc");
//        Thread test04 = new Thread(myThread01,"dd");
//        
//        test01.start();
//        test02.start();
//        test03.start();
//        test04.start();
        
    }
    
    
}

class MyThread extends Thread{
    private int count = 5;
    //构造函数赋值给线程名字
    MyThread(){
        
    }
    MyThread(String threadName){
        this.setName(threadName);
    }
    @Override
    public void run() {
        count--;
        System.out.println(this.currentThread().getName()+"-------------"+count);
    }
}
