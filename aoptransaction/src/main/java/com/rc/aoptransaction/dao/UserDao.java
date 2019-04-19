package com.rc.aoptransaction.dao;

import com.rc.aoptransaction.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserDao
 * @Description 用户持久化类
 * @Author liux
 * @Date 19-4-18 上午9:42
 * @Version 1.0
 */
public interface UserDao extends JpaRepository<User,Long> {
}