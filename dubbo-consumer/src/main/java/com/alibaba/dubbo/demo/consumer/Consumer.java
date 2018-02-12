package com.alibaba.dubbo.demo.consumer;

import com.alibaba.dubbo.demo.ServiceDome;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Yuwei on 2018/2/11.
 * 调用远程服务
 */
public class Consumer {

    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-consumer.xml"});
        context.start();
        ServiceDome demoService = (ServiceDome) context.getBean("demoService"); // get remote service proxy

        /*while (true){
            try{
                Thread.sleep(1000);
                String hello = demoService.sayHello("world"); // call remote method
                System.out.println(hello); // get result
            }catch (Throwable throwable){
                throwable.printStackTrace();
            }
        }*/
        System.out.println(demoService.getPermissions(1L));
    }
}
