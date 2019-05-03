package data.jpa.repository;

import com.rc.data.jpa.model.Employee;
import com.rc.data.jpa.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName TestEmployeeRepository
 * @Description EmployeeRepository 测试类
 * @Author liux
 * @Date 19-5-3 下午4:39
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring_data_jpa.xml"})
@RunWith(SpringJUnit4ClassRunner.class)

//@Transactional(transactionManager = "transactionManager")
public class TestEmployeeRepository {

    @Resource
    EmployeeRepository employeeRepository;

    @Test
    public void testSave() {
        Employee employee = new Employee("aa", 10);
//        employeeRepository.save(employee);
    }

    //    @Transactional
    @Test
    public void testFindByName() {
        System.out.println(employeeRepository);
        Employee employee = employeeRepository.name("aa");
        System.out.println(employee);

        /*Employee employee1 = null;
        Employee employee3 = null;

        Optional<Employee> optionalEmployee1 = employeeRepository.findById(1);
        Optional<Employee> optionalEmployee3 = employeeRepository.findById(3);

        if (optionalEmployee1.isPresent()) {
            employee1 = optionalEmployee1.get();
        }

        if (optionalEmployee3.isPresent()) {
            employee3 = optionalEmployee3.get();
        }


        assert employee1 != null;
        employee1.setAge(employee1.getAge() - 1);
        employeeRepository.save(employee1);

        assert employee3 == null;
        employee3.setAge(employee3.getAge() + 1);
        employeeRepository.save(employee3);
*/
    }

    @Test
    public void testFindByNameStartingWithAndAgeLessThan() {
        employeeRepository.findByNameStartingWithAndAgeLessThan("test", 22)
                .forEach(System.out::println);
    }

    @Test
    public void testFindByNameEndingWithAndAgeLessThan() {
        employeeRepository.findByNameEndingWithAndAgeLessThan("6", 23)
                .forEach(System.out::println);
    }

    @Test
    public void testFindByNameInOrAgeLessThan() {
        List<String> names = Arrays.asList("test1","test2","test3");
        employeeRepository.findByNameInOrAgeLessThan(names, 22)
                .forEach(System.out::println);
    }

    @Test
    public void testFindByNameInAndAgeLessThan() {
        List<String> names = Arrays.asList("test1","test2","test3");
        employeeRepository.findByNameInAndAgeLessThan(names, 22)
                .forEach(System.out::println);
    }

    @Test
    public void testGetEmployeeByMaxId() {
        Employee employee = employeeRepository.getEmployeeByMaxId();
        System.out.println(employee);
    }

    @Test
    public void testQueryByParams1() {
        employeeRepository.queryByParams1("test1", 20)
                .forEach(System.out::println);
    }

    @Test
    public void testQueryByParams2() {
        employeeRepository.queryByParams2("test1", 20)
                .forEach(System.out::println);
    }

    @Test
    public void testQueryByNameLike1() {
        employeeRepository.queryByNameLike1("test")
                .forEach(System.out::println);
    }

    @Test
    public void testQueryByNameLike2() {
        employeeRepository.queryByNameLike2("test1")
                .forEach(System.out::println);
    }

    @Test
    public void testGetCount() {
        System.out.println("count: " + employeeRepository.getCount());
    }

    @Test
    public void testUpdateAgeById() {
        employeeRepository.updateAgeById(80,1);
        System.out.println(employeeRepository.findById(1));
    }

}
