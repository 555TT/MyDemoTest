package com.example.mydemotest.demo1;

import org.springframework.stereotype.Component;

@Component("beanOne")
public class BeanOne implements Bean{
    public void test(){
        System.out.println("11");
    }
}
