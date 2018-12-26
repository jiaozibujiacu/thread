package com.jiaozi.thread.extendThread; 
/** 
* @author xiam 
* @version 创建时间：2018年12月26日 上午11:38:53 
*  1.7.3 能停止的线程:异常法(for(循环break)==》throw new exception()+try catch)
*/
public class ThreadTest06 {
    public static void main(String[] args) {        
        try {
            Thread06 thread06 = new Thread06();
            thread06.start();
            Thread.sleep(2000);
            thread06.interrupt();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }       
    }    
}

class Thread06 extends Thread{
    @Override
    public void run() {
        try {
            for(int i = 0 ; i < 1000000;i++) {
                if(this.interrupted()) {
                    System.out.println("当前线程已经停止");                    
                        throw new InterruptedException();                   
                    //break;                
                }
                System.out.println(i+"");
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("已经进入thread06的try catch了");
            e.printStackTrace();
        }
        //for
    }
}