package com.example.mydemotest;

import com.example.mydemotest.demo1.Bean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class test {
    @Autowired
    @Qualifier("beanOne")
    private Bean beanOne;

    @Test
    public void test1(){
        beanOne.test();
    }
}
