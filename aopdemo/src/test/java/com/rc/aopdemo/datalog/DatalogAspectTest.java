package com.rc.aopdemo.datalog;

import com.rc.aopdemo.dao.ProductDao;
import com.rc.aopdemo.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatalogAspectTest {

    @Autowired
    ProductDao productDao;

    @Test
    public void test() {
    }


    @Test
    public void save() {
        Product product = new Product();
        product.setName("dell computer");
        product.setOnlineTime(new Date());
        product.setBuyPrice(new BigDecimal("29.5"));
        product.setCategory("computer");
        product.setDetail("this is a dell notebook");
        product.setUpdateTime(new Date());
        productDao.save(product);
        System.out.println("new product id:" + product.getId());
    }

    @Test
    public void update() {
        Optional<Product> optionalProduct = productDao.findById(9L);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName("test-update");
            product.setBuyPrice(new BigDecimal("23.5"));
            product.setOnlineTime(new Date());
            productDao.save(product);
        }
    }

    @Test
    public void delete() {
        productDao.deleteById(8L);

    }

}