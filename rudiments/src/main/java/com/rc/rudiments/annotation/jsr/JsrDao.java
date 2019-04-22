package com.rc.rudiments.annotation.jsr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.inject.Named;

/**
 * @ClassName JsrDao
 * @Description JsrDao类
 * @Author liux
 * @Date 19-4-22 下午6:35
 * @Version 1.0
 */
@Repository("jsrDAO")
//@Named("jsrDAO")
public class JsrDao {

    public void save() {
        System.out.println("JsrDAO invoked.");
    }
}
