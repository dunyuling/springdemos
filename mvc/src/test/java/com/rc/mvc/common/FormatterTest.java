package com.rc.mvc.common;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.cglib.core.Local;
import org.springframework.format.number.CurrencyStyleFormatter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.Locale;

/**
 * @ClassName FormatterTest
 * @Description TODO
 * @Author liux
 * @Date 19-4-30 下午12:48
 * @Version 1.0
 */
public class FormatterTest {

    @Test
    public void test1() throws ParseException {
        CurrencyStyleFormatter currencyFormatter = new CurrencyStyleFormatter();
        currencyFormatter.setFractionDigits(2);
        currencyFormatter.setRoundingMode(RoundingMode.CEILING);
        Assert.assertEquals(new BigDecimal("123.13"), currencyFormatter.parse("$123.125", Locale.US));
    }
    @Test
    public void test2(){
        CurrencyStyleFormatter currencyFormatter = new CurrencyStyleFormatter();
        currencyFormatter.setFractionDigits(2);
        currencyFormatter.setRoundingMode(RoundingMode.FLOOR);
        System.out.println(currencyFormatter.print(new BigDecimal("123"), Locale.CHINESE));
        System.out.println(currencyFormatter.print(new BigDecimal("123"), Locale.CHINA));
        Assert.assertEquals("£123.00", currencyFormatter.print(new BigDecimal("123"), Locale.UK));
    }
}
