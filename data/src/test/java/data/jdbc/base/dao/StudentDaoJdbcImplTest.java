package data.jdbc.base.dao;

import com.rc.data.jdbc.base.dao.StudentDaoJdbcImpl;
import com.rc.data.jdbc.dao.StudentDao;
import com.rc.data.jdbc.model.Student;
import org.junit.Test;

/**
 * @ClassName StudentDaoJdbcImplTest
 * @Description StudentDao 测试类 -- jdbc 实现方式
 * @Author liux
 * @Date 19-5-2 下午6:46
 * @Version 1.0
 */
public class StudentDaoJdbcImplTest {

    @Test
    public void testQueryAll() {
        StudentDao studentDao = new StudentDaoJdbcImpl();
        studentDao.queryAll().forEach(System.out::println);
    }

    @Test
    public void testSave() {
        StudentDao studentDao = new StudentDaoJdbcImpl();
        Student student = new Student("dd",40);
        studentDao.save(student);
    }
}