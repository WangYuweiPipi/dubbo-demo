package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.ServiceDome;
import com.alibaba.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Yuwei on 2018/2/11.
 * 提供远程服务
 */
public class DemoServiceImpl implements ServiceDome{

    public List<String> getPermissions(Long id){
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }

    public String sayHello(String name){
//        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date() + "]Hello")
//                + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

}
