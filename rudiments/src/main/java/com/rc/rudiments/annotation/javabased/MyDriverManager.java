package com.rc.rudiments.annotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyDriverManager
 * @Description 驱动管理类
 * @Author liux
 * @Date 19-4-22 下午5:54
 * @Version 1.0
 */
@Component
//@ImportResource("classpath:config.xml")
@PropertySource("classpath:jdbc.properties")
public class MyDriverManager {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Override
    public String toString() {
        return "MyDriverManager{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
