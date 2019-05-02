package com.rc.mvc.request;

import com.rc.mvc.model.User;

import java.util.List;

/**
 * @ClassName UserListForm
 * @Description User的List封装
 * @Author liux
 * @Date 19-4-29 下午4:46
 * @Version 1.0
 */
public class UserListForm {

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserListForm{" +
                "users=" + users +
                '}';
    }
}
