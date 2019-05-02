package com.rc.mvc.request;

import com.rc.mvc.model.User;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName UserSetForm
 * @Description User的Set封装
 * @Author liux
 * @Date 19-4-29 下午11:32
 * @Version 1.0
 */
public class UserSetForm {

    private Set<User> users;

    //TODO need init
    private UserSetForm() {
        users = new LinkedHashSet<>();
        users.add(new User());
        users.add(new User());
    }


    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserSetForm{" +
                "users=" + users +
                '}';
    }
}
