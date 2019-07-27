package com.rc.aopcache.service;

import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@ContextConfiguration(locations = {"classpath:spring-cache.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class OutterServiceTest {

    @Autowired
    OutterService outterService;

    @Test
    public void cacheWorkFromOutClass() {
        System.out.println("first time  get from db");
        outterService.cacheWorkFromOutClass();
        System.out.println();
        System.out.println("second time get from cache");
        outterService.cacheWorkFromOutClass();

    }
}