package com.alibaba.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Yuwei on 2018/2/11.
 */
public class Provider {

    public static void main(String[] args) throws Exception{
        System.setProperty("java.net.preferIPv4Stack", "true"); //相当于一个静态变量，存在内存中
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-provider.xml"});
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read(); // press any key to exit
    }
}
