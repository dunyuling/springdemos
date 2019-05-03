package com.rc.data.jpa.repository;

import com.rc.data.jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @ClassName EmployeeJpaSpecificationExecutorRepository
 * @Description EmployeeJpaSpecificationExecutorRepository---JPA Criteria Query
 * @Author liux
 * @Date 19-5-3 下午11:30
 * @Version 1.0
 */
public interface EmployeeJpaSpecificationExecutorRepository
        extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor<Employee> {


}
