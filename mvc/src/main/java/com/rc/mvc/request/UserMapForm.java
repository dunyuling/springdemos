package com.rc.mvc.request;

import com.rc.mvc.model.User;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName UserMapForm
 * @Description User的Map封装
 * @Author liux
 * @Date 19-4-30 上午10:17
 * @Version 1.0
 */
public class UserMapForm {

    private Map<String,User> users = new LinkedHashMap<>();

    private UserMapForm() {
        users.put("X",new User());
        users.put("Y",new User());
    }


    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserMapForm{" +
                "users=" + users +
                '}';
    }
}
