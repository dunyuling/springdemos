package com.rc.mvc.controller;

import com.rc.mvc.model.Admin;
import com.rc.mvc.model.User;
import com.rc.mvc.request.UserListForm;
import com.rc.mvc.request.UserMapForm;
import com.rc.mvc.request.UserSetForm;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DataBindController
 * @Description 数据绑定测试的controller
 * @Author liux
 * @Date 19-4-29 下午3:56
 * @Version 1.0
 */
@Controller
public class DataBindController {

    /*
     * @Author liux
     * @Description age 参数不能缺省,即 http://localhost:8080/mvc/baseType1.do?age=1
     * @Date 19-4-29 下午4:03
     * @param age
     * @return java.lang.String
     **/
    @RequestMapping("baseType1.do")
    @ResponseBody
    public String baseType1(int age) {
        return "age: " + age;
    }

    /*
     * @Author liux
     * @Description xage参数必须有值 即http://localhost:8080/mvc/baseType.do?xage=1
     * @Date 19-4-29 下午4:03
     * @param age
     * @return java.lang.String
     **/
    @RequestMapping("baseType2.do")
    @ResponseBody
    public String baseType2(@RequestParam("xage") int age) {
        return "age: " + age;
    }

    /*
     * @Author liux
     * @Description age参数可以缺省 即http://localhost:8080/mvc/baseType3.do
     * @Date 19-4-29 下午4:04
     * @param age
     * @return java.lang.String
     **/
    @RequestMapping("baseType3.do")
    @ResponseBody
    public String baseType3(Integer age) {
        return "age: " + age;
    }

    /*
     * @Author liux
     * @Description http://localhost:8080/mvc/array.do?name=a&name=b&name=c
     * @Date 19-4-29 下午4:11
     * @param name
     * @return java.lang.String
     **/
    @RequestMapping("array.do")
    @ResponseBody
    public String array(String[] name) {
        StringBuilder builder = new StringBuilder();
        for (String s : name) {
            builder.append("name: ").append(s).append("<br/>");
        }
        return builder.toString();
    }

    /*
     * @Author liux
     * @Description http://localhost:8080/mvc/object.do?name=a&age=2
     *              http://localhost:8080/mvc/object.do?name=a&age=2&contactInfo.phone=3&contactInfo.address=4
     * @Date 19-4-29 下午4:22
     * @param user
     * @return java.lang.String
     **/
    @RequestMapping("object.do")
    @ResponseBody
    public String object(User user) {
        return user.toString();
    }

    /*
     * @Author liux
     * @Description http://localhost:8080/mvc/object2.do?user.name=a&user.age=2&admin.name=b&admin.age=3&contactInfo.phone=5
     * @Date 19-4-29 下午4:23
     * @param null
     * @return
     **/
    @RequestMapping("object2.do")
    @ResponseBody
    public String object2(User user, Admin admin) {
        return user.toString() + "<br/>" + admin.toString();
    }


    @InitBinder("user")
    public void initUser(WebDataBinder binder) {
//        System.out.println("------------");
        binder.setFieldDefaultPrefix("user.");
    }

    @InitBinder("admin")
    public void initAdmin(WebDataBinder binder) {
//        System.out.println("+++++++++++");
        binder.setFieldDefaultPrefix("admin.");
    }


    /*
     * @Author liux
     * @Description 由于tomcat版本问题,执行的RFC标准更为严格,需要对[]进行转义,下面的url
     *          http://localhost:8080/mvc/list.do?users[0].name=a&users[1].name=b
     *          下标必须连续,否则会构建许多空对象
     *          URLEncoder.encode后为:
     *          http://localhost:8080/mvc/list.do?users%5B0%5D.name=a&users%5B1%5D.name=b
     * @Date 19-4-29 下午4:45
     * @param userList
     * @return java.lang.String
     **/
    @RequestMapping("list.do")
    @ResponseBody
    public String list(UserListForm userListForm) {
        return userListForm.toString();
    }

    /*
     * @Author liux
     * @Description 测试同 list.do
     *     1. set 一般用于去重,需重写泛型类的equals和hashCode方法
     *     2. UserSetForm 需要初始化
     *     3. 1,2两步下来产生的结果是只能添加一个泛型类,所以起不到集合的效果
     *     结论:spring对于set支持不佳,一般用list代替
     * @Date 19-4-30 上午12:10
     * @param userSetForm
     * @return java.lang.String
     **/
    @RequestMapping("set.do")
    @ResponseBody
    public String set(UserSetForm userSetForm) {
        return userSetForm.toString();
    }

    /*
     * @Author liux
     * @Description http://localhost:8080/mvc/map.do?users%5B%27X%27%5D.name%3Da%26users%5B%27X%27%5D.age%3D1%26users%5B%27Y%27%5D.name%3Db%26users%5B%27Y%27%5D.age%3D2
     *  TODO  没有测试成功
     * @Date 19-4-30 上午10:50
     * @param userMapForm
     * @return java.lang.String
     **/
    @RequestMapping("map.do")
    @ResponseBody
    public String map(UserMapForm userMapForm) {
        return userMapForm.toString();
    }

    /*
     * @Author liux
     * @Description 详见index.jsp postJsonRaw()方法
     * @Date 19-4-30 上午11:08
     * @param user
     * @return java.lang.String
     **/
    @RequestMapping("json_raw.do")
    @ResponseBody
    public String jsonRaw(@RequestBody User user) {
        return user.toString();
    }

    /*
     * @Author liux
     * @Description 详见index.jsp postJsonForm()方法
     * @Date 19-4-30 上午11:08
     * @param user
     * @return java.lang.String
     **/
    @RequestMapping("json_form.do")
    @ResponseBody
    public String jsonForm(User user) {
        return user.toString();
    }

    /*
     * @Author liux
     * @Description 详见index.jsp postXml()方法
     * @Date 19-4-30 下午12:33
     * @param admin
     * @return java.lang.String
     **/
    @RequestMapping("xml.do")
    @ResponseBody
    public String xml(@RequestBody Admin admin) {
        return admin.toString();
    }

    /*
     * @Author liux
     * @Description localhost:8080/mvc/converter.do?bool=on
     *              (on等值见)org.springframework.core.convert.support.StringToBooleanConverter
     * @Date 19-4-30 下午1:32
     * @param bool
     * @return java.lang.String
     **/
    @RequestMapping(value = "converter.do")
    @ResponseBody
    public String converter(Boolean bool) throws Exception {
        return bool.toString();
    }

    @RequestMapping(value = "date1.do",produces = "text/plain;charset=utf8")
    @ResponseBody
    public String date1(Date date1) {
        return date1 == null ? "您未输入日期" : date1.toString();
    }

    @RequestMapping(value = "date2.do",produces = "text/plain;charset=utf8")
    @ResponseBody
    public String date2(Date date2) {
        return date2 == null ? "您未输入日期" : date2.toString();
    }

    /*@InitBinder("date1")
    public void initDate1(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }*/

    @RequestMapping(value = "subject/{subjectId}",method = RequestMethod.GET)
    @ResponseBody
    public String subjectGet(@PathVariable("subjectId") String subjectId) {
        return "this is get method, subjectId: " + subjectId;
    }

    @RequestMapping(value = "subject/{subjectId}",method = RequestMethod.POST)
    @ResponseBody
    public String subjectPost(@PathVariable("subjectId") String subjectId) {
        return "this is post method, subjectId: " + subjectId;
    }

    @RequestMapping(value = "subject/{subjectId}",method = RequestMethod.PUT)
    @ResponseBody
    public String subjectPut(@PathVariable("subjectId") String subjectId) {
        return "this is put method, subjectId: " + subjectId;
    }

    @RequestMapping(value = "subject/{subjectId}",method = RequestMethod.DELETE)
    @ResponseBody
    public String subjectDelete(@PathVariable("subjectId") String subjectId) {
        return "this is delete method, subjectId: " + subjectId;
    }

    //不能返回数据
    @RequestMapping(value = "subject/{subjectId}",method = RequestMethod.HEAD)
    @ResponseBody
    public String subjectHead(@PathVariable("subjectId") String subjectId) {
        return "this is head method, subjectId: " + subjectId;
    }


    @RequestMapping(value = "subject/{subjectId}",method = RequestMethod.OPTIONS)
    @ResponseBody
    public String subjectOptions(@PathVariable("subjectId") String subjectId) {
        return "this is options method, subjectId: " + subjectId;
    }

    @RequestMapping(value = "subject/{subjectId}",method = RequestMethod.PATCH)
    @ResponseBody
    public String subjectPatch(@PathVariable("subjectId") String subjectId) {
        return "this is patch method, subjectId: " + subjectId;
    }





}