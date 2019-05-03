package com.rc.data.jpa.repository;

import com.rc.data.jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @ClassName EmployeeRepository
 * @Description EmployeeRepository
 * @Author liux
 * @Date 19-5-3 下午4:36
 * @Version 1.0
 */
//@RepositoryDefinition(idClass = Integer.class, domainClass = Employee.class)
//public interface EmployeeRepository extends Repository<Employee, Integer> {
//public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
//public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /*
     * @Author liux
     * @Description findByName
     * @Date 19-5-3 下午7:42
     * @param name
     * @return com.rc.data.jpa.model.Employee
     **/
    Employee name(String name);

    /*
     * @Author liux
     * @Description where name like ?% and age <?
     * @Date 19-5-3 下午7:42
     * @param name
     * @param age
     * @return java.util.List<com.rc.data.jpa.model.Employee>
     **/
    List<Employee> findByNameStartingWithAndAgeLessThan(String name, Integer age);

    /*
     * @Author liux
     * @Description where name like %? and age <?
     * @Date 19-5-3 下午7:42
     * @param name
     * @param age
     * @return java.util.List<com.rc.data.jpa.model.Employee>
     **/
    List<Employee> findByNameEndingWithAndAgeLessThan(String name, Integer age);

    /*
     * @Author liux
     * @Description where name in(?,?...) or age <?
     * @Date 19-5-3 下午7:43
     * @param name
     * @param age
     * @return java.util.List<com.rc.data.jpa.model.Employee>
     **/
    List<Employee> findByNameInOrAgeLessThan(List<String> names, Integer age);

    /*
     * @Author liux
     * @Description  where name in(?,?...) and age <?
     * @Date 19-5-3 下午7:47
     * @param names
     * @param age
     * @return java.util.List<com.rc.data.jpa.model.Employee>
     **/
    List<Employee> findByNameInAndAgeLessThan(List<String> names, Integer age);

    /*
     * @Author liux
     * @Description 查询最大 id 员工
     *              Employee 类名
     * @Date 19-5-3 下午8:04
     * @param
     * @return com.rc.data.jpa.model.Employee
     **/
    @Query("select e1 from Employee e1 where e1.id = (select max(id) from Employee)")
    Employee getEmployeeByMaxId();


    @Query("select e1 from Employee e1 where e1.name = ?1 and e1.age = ?2")
    List<Employee> queryByParams1(String name, Integer age);

    @Query("select e1 from Employee e1 where e1.name =: name and e1.age =: age")
    List<Employee> queryByParams2(@Param("name") String name, @Param("age") Integer age);

    @Query("select e1 from Employee e1 where e1.name like %?1%")
    List<Employee> queryByNameLike1(String name);

    @Query("select e1 from Employee e1 where e1.name like %:name%")
    List<Employee> queryByNameLike2(@Param("name") String name);

    @Query(nativeQuery = true, value = "select count(1) from employee")
    Long getCount();

    @Modifying
    @Query("update Employee  e1 set e1.age = :age where e1.id = :id")
    void updateAgeById(@Param("id") Integer id, @Param("age") Integer age);
}