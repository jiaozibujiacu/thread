package com.jiaozi.thread.lambda;

import java.util.Arrays;
import java.util.List;

/** 
* @author xiam 
* @version 创建时间：2018年11月12日 下午2:48:30 
*  Lambda表达式遍历
*/
public class LambdaTest01 {
    
    public static void main(String[] args) {
        String[] str= {"test01","test02","test03","test04"};
        List<String> strList = Arrays.asList(str);
        strList.forEach((s)->System.out.println(s+"test"));
        System.out.println("hello");
        System.out.println("hello");
        
        strList.forEach(System.out::print);
    }

}
