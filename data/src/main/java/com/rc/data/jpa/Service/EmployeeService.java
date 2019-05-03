package com.rc.data.jpa.Service;

import com.rc.data.jpa.model.Employee;
import com.rc.data.jpa.repository.EmployeeRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName EmployeeService
 * @Description EmployeeService
 * @Author liux
 * @Date 19-5-3 下午8:34
 * @Version 1.0
 */
@Service
public class EmployeeService {

    @Resource
    EmployeeRepository employeeRepository;

    @Transactional
    public void updateAge(Integer id, Integer age) {
        employeeRepository.updateAgeById(id, age);
    }

    @Transactional
    public void save(List<Employee> employeeList) {
        employeeRepository.saveAll(employeeList);

        //插入可以不用事务,但是失败了就不能保证ACID了
        /*employeeList.forEach(employee -> {
            if (employee.getName().equals("ee")) {
                assert employee == null;
            }
            employeeRepository.save(employee);
        });*/
    }

    @Transactional
    public void delete(List<Employee> employees) {
        employeeRepository.deleteAll(employees);

        //删除可以不用事务,但是失败了就不能保证ACID了
//        employees.forEach(employee -> {
//            if (employee.getName().equals("ff")) {
//                assert employee == null;
//            }
//            employeeRepository.delete(employee);
//        });
    }


    @Transactional
    public Page<Employee> page(int page, int size) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        sort.and(new Sort(Sort.Direction.ASC, "age"));
        Pageable pageable = PageRequest.of(page, size, sort);
        return employeeRepository.findAll(pageable);
    }
}