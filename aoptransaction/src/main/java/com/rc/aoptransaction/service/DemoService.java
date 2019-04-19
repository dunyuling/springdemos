package com.rc.aoptransaction.service;

import com.rc.aoptransaction.dao.OperatorLogDao;
import com.rc.aoptransaction.dao.UserDao;
import com.rc.aoptransaction.domain.OperatorLog;
import com.rc.aoptransaction.domain.User;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName DemoService
 * @Description 业务演示类
 * @Author liux
 * @Date 19-4-18 上午9:48
 * @Version 1.0
 */
@Service
public class DemoService {

    @Autowired
    UserDao userDao;

    @Autowired
    OperatorLogDao operatorLogDao;

    @Transactional
    public void addUser(String name) {
        OperatorLog operatorLog = new OperatorLog();
        operatorLog.setContent("create user: " + name);
        operatorLogDao.save(operatorLog);

        User user = new User();
        user.setName(name);
        userDao.save(user);
    }
}
