package com.rc.aop.mock.service;

import com.rc.aop.mock.domain.Product;
import com.rc.aop.mock.security.AdminOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ProductService
 * @Description 产品服务类
 * @Author liux
 * @Date 19-4-16 上午11:40
 * @Version 1.0
 */
@Service
public class ProductService  {

    @Autowired
    AuthService authService;

    public void insert(Product product) {
        authService.check();
        System.out.println("insert product");
    }

    @AdminOnly
    public void delete(Product product) {
        System.out.println("delete product");
    }
}
