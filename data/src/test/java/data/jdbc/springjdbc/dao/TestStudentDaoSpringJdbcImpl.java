package data.jdbc.dao;

import com.rc.data.jdbc.springjdbc.dao.StudentDaoSpringJdbcImpl;
import com.rc.data.jdbc.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName TestStudentDaoSpringJdbcImpl
 * @Description StudentDao 测试类 -- spring jdbc 实现方式
 * @Author liux
 * @Date 19-5-3 下午12:06
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring_jdbc.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestStudentDaoSpringJdbcImpl {

    @Autowired
    StudentDaoSpringJdbcImpl studentDaoSpringJdbc;

    @Test
    public void testQueryAll() {
        studentDaoSpringJdbc.queryAll().forEach(System.out::println);
    }

    @Test
    public void testSave() {
        Student student = new Student("ee", 40);
        studentDaoSpringJdbc.save(student);
    }
}
