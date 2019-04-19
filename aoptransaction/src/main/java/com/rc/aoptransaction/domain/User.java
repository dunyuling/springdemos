package com.rc.aoptransaction.domain;

import javax.persistence.*;

/**
 * @ClassName User
 * @Description 用户实体类
 * @Author liux
 * @Date 19-4-18 上午9:33
 * @Version 1.0
 */
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
