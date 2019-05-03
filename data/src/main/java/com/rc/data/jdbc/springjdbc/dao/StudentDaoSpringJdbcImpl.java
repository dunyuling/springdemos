package com.rc.data.jdbc.springjdbc.dao;

import com.rc.data.jdbc.dao.StudentDao;
import com.rc.data.jdbc.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentDaoSpringJdbcImpl
 * @Description  StudentDao 接口实现类 --- spring jdbc方式
 * @Author liux
 * @Date 19-5-3 下午12:03
 * @Version 1.0
 */
public class StudentDaoSpringJdbcImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> queryAll() {
        List<Student> studentList = new ArrayList<>();
        String sql = "select id,name,age from student";

        this.jdbcTemplate.query(sql, resultSet -> {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setAge(resultSet.getInt("age"));
            studentList.add(student);
        });
        return studentList;
    }

    @Override
    public void save(Student student) {
        String sql = "insert into student(name,age) values(?,?)";
        this.jdbcTemplate.update(sql, student.getName(), student.getAge());
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}