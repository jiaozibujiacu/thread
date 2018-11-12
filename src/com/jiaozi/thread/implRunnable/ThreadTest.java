package com.jiaozi.thread.implRunnable; 
/** 
* @author xiam 
* @version 创建时间：2018年11月12日 上午11:39:27 
*  通过实现runnable方法来创建线程
*/
public class ThreadTest {

    public static void main(String[] args) {
        Thread thread01 = new Thread(new Runnable01());
        Thread thread02 = new Thread(new Runnable02());
        thread01.start();
        thread02.start();
    }
        
}

class Runnable01 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i < 7;i++ ) {
            System.out.println("线程01"+i);
        }        
    }    
}

class Runnable02 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i <7 ; i++) {
            System.out.println(i);
        }
        
    }
    
}
