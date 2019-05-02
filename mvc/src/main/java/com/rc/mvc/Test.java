package com.rc.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName Test
 * @Description Test
 * @Author liux
 * @Date 19-4-26 下午8:03
 * @Version 1.0
 */
public class Test {

    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) throws UnsupportedEncodingException {
//        logger.info("########");
//        String parameters = "users[0].name=a&users[1].name=b";
//        String parameters = "users['X'].name=a&users['X'].age=1&users['Y'].name=b&users['Y'].age=2";
//        String parameters = "users[\"X\"].name=Tom&users[\"X\"].age=10&users[\"Y\"].name=Lucy";
//        try {
//            parameters = URLEncoder.encode(parameters,"utf-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        String url = "http://localhost:8080/mvc/map.do?" + parameters;
//        System.out.println(url);

//        System.out.println(URLEncoder.encode("http://localhost:8080/mvc/list.do?users[0].name=a&users[1].name=b","utf-8"));
    }
}
