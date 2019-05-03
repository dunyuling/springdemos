package data.jpa.service;

import com.rc.data.jpa.Service.EmployeeService;
import com.rc.data.jpa.model.Employee;
import com.rc.data.jpa.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName EmployeeServiceTest
 * @Description EmployeeService 测试类
 * @Author liux
 * @Date 19-5-3 下午8:38
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring_data_jpa.xml")
public class EmployeeServiceTest {

    @Resource
    EmployeeService employeeService;

    @Resource
    EmployeeRepository employeeRepository;

    @Test
    public void testUpdateAge() {
        employeeService.updateAge(1, 70);
        System.out.println(employeeRepository.findById(1));
    }

    @Test
    public void testSave() {
        List<Employee> employeeList = Arrays.asList(
                new Employee("dd", 11),
                new Employee("ee", 22),
                new Employee("ff", 33)
        );
        employeeService.save(employeeList);
    }

    @Test
    public void testDelete() {
        int beginId = 32;
        List<Employee> employees = (List<Employee>) employeeRepository.
                findAllById(Arrays.asList(beginId + 1, beginId + 2));
        employeeService.delete(employees);
    }

    @Test
    public void testPage() {
//        employeeService.page(0, 5).stream().forEach(System.out::println);
        System.out.println(employeeService.page(0,5).getContent());
    }
}