package com.rc.rudiments.annotation.jsr;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @ClassName JsrService
 * @Description JsrService类
 * @Author liux
 * @Date 19-4-22 下午6:36
 * @Version 1.0
 */
//@Service
@Named
public class JsrService {

//    @Resource
//    @Inject
    private JsrDao jsrDao;

    @Resource
//    @Inject
    public void setJsrDao(@Named("jsrDAO") JsrDao jsrDao) {
        this.jsrDao = jsrDao;
    }

    @PostConstruct
    public void init() {
        System.out.println("JsrService init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JsrService destroy.");
    }

    public void save() {
        jsrDao.save();
    }
}
