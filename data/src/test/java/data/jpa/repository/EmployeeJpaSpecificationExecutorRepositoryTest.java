package data.jpa.repository;

import com.rc.data.jpa.model.Employee;
import com.rc.data.jpa.repository.EmployeeJpaSpecificationExecutorRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.persistence.criteria.*;

/**
 * @ClassName EmployeeJpaSpecificationExecutorRepositoryTest
 * @Description EmployeeJpaSpecificationExecutorRepository---JPA Criteria Query--测试类
 * @Author liux
 * @Date 19-5-3 下午11:32
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring_data_jpa.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeJpaSpecificationExecutorRepositoryTest {

    @Resource
    EmployeeJpaSpecificationExecutorRepository employeeJpaSpecificationExecutorRepository;

    /*
     * @Author liux
     * @Description page,sort,criteria
     * @Date 19-5-3 下午11:33
     * @param
     * @return void
     **/
    @Test
    public void query() {
        int page = 1;
        int size = 5;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);

        Specification<Employee> specification = (Specification<Employee>) (root, query, criteriaBuilder) -> {
            Path<Integer> path = root.get("age");
            return criteriaBuilder.gt(path, 21);
        };

        employeeJpaSpecificationExecutorRepository.findAll(specification, pageable)
                .stream().forEach(System.out::println);
    }
}
