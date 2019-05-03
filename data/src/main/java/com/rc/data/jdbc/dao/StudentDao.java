package com.rc.data.jdbc.dao;


import com.rc.data.jdbc.model.Student;

import java.util.List;

/**
 * @ClassName StudentDao
 * @Description StudentDao 接口
 * @Author liux
 * @Date 19-5-2 下午6:32
 * @Version 1.0
 */
public interface StudentDao {

    /*
     * @Author liux
     * @Description 查询所有学生
     * @Date 19-5-2 下午6:32
     * @param 
     * @return java.util.List<data.jdbc.model.Student>
     **/
    List<Student> queryAll();

    /*
     * @Author liux
     * @Description 添加一个学生
     * @Date 19-5-2 下午6:52
     * @param student
     * @return void
     **/
    void save(Student student);

}
