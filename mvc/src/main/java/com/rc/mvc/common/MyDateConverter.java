package com.rc.mvc.common;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName MyDateConverter
 * @Description 自定义类型转换工具类
 * @Author liux
 * @Date 19-4-30 下午3:54
 * @Version 1.0
 */
public class MyDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
