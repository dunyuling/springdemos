package com.rc.data.jdbc.dao;

import com.rc.data.jdbc.JDBCUtils;
import com.rc.data.jdbc.model.Student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentDaoJdbcImpl
 * @Description StudentDao 接口实现类 --- jdbc方式
 * @Author liux
 * @Date 19-5-2 下午6:33
 * @Version 1.0
 */
public class StudentDaoJdbcImpl implements StudentDao {

    @Override
    public List<Student> queryAll() {
        List<Student> studentList = new ArrayList<>();

        String sql = "select id,name,age from student";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
                studentList.add(student);
            }
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(resultSet, preparedStatement, connection);
        }
        return studentList;
    }

    @Override
    public void save(Student student) {
        String sql = "insert into student(name,age) values(?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setInt(2,student.getAge());
            preparedStatement.executeUpdate();
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(null, preparedStatement, connection);
        }
    }
}