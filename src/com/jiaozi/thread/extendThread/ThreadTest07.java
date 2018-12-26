package com.jiaozi.thread.extendThread; 
/** 
* @author xiam 
* @version 创建时间：2018年12月26日 下午3:13:55 
*  1.7.4 sleep()方法 在沉睡中停止
*/
public class ThreadTest07 {
    public static void main(String[] args) {
        
        try {
            Thread thread07 = new Thread07();
            thread07.start();  
            Thread.sleep(20);
            thread07.interrupt();           
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }
}

class Thread07 extends Thread{
    @Override
    public void run() {        
            try {
                for(int i = 0; i< 10000; i++) {
                    System.out.println("2222");
                    this.sleep(211);
                    System.out.println("end"+"");
                }                
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    
}
