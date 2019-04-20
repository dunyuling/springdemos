package com.rc.aop.demo.dao;

import com.rc.aop.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName ProductDao
 * @Description 产品持久化类
 * @Author liux
 * @Date 19-4-20 下午10:29
 * @Version 1.0
 */
public interface ProductDao extends JpaRepository<Product,Long> {
}
