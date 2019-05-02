package com.rc.mvc.common;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @ClassName MyDateFormatter
 * @Description 自定义类型格式化工具类
 * @Author liux
 * @Date 19-4-30 下午3:47
 * @Version 1.0
 */
public class MyDateFormatter implements Formatter<Date> {

    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(text);
    }

    @Override
    public String print(Date object, Locale locale) {
        return null;
    }
}
