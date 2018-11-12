package com.jiaozi.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/** 
* @author xiam 
* @version 创建时间：2018年11月12日 下午2:19:10 
*  callable实现线程返回值
*/
public class ThreadTest {

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        //用futureTask来接收值
        //FutureTask implement runnableFuture extends runnable,future
        FutureTask<Integer> result = new FutureTask<>(threadDemo);        
        new Thread(result).start();       
        try {
            Integer sum = result.get();
            System.out.println(sum+"");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}

class ThreadDemo implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 0;i < 7;i++) {
            sum = sum+i;
        }
        return sum;
    }
    
}
