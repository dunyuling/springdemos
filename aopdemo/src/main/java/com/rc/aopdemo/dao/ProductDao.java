package com.rc.aopdemo.dao;

import com.rc.aopdemo.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductDao extends JpaRepository<Product,Long> {

    @Override
    Optional<Product> findById(Long aLong);
}
