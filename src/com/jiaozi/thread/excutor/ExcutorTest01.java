package com.jiaozi.thread.excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
* @author xiam 
* @version 创建时间：2018年11月13日 上午10:20:18 
*  线程池测试
*/
public class ExcutorTest01 {

    public static void main(String[] args) {
        Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(1);
        Executors.newFixedThreadPool(2);
        Executors.newSingleThreadExecutor();
        
        
        ExecutorService ExecutorService = Executors.newFixedThreadPool(1);
        ExecutorService.submit(()->System.out.println("hello,world!"));
    }
    
}
