package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * Created by Yuwei on 2018/2/11.
 * 存放公共接口
 */
public interface ServiceDome {

    String sayHello(String name);

    List<String> getPermissions(Long id);
}
