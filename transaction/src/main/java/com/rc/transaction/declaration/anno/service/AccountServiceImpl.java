package com.rc.transaction.declaration.anno.service;

import com.rc.transaction.declaration.anno.dao.AccountDao;
import com.rc.transaction.declaration.anno.model.Account;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Description 转账 实现类
 * @Author liux
 * @Date 19-4-28 下午4:12
 * @Version 1.0
 */
//@Transactional
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /*
     * @Author liux
     * @Description 转账方法---注解事务
     * @Date 19-4-28 下午5:33
     * @param out 转出账号
     * @param in 转入账号
     * @param money 转账金额
     * @return void
     **/
    @Transactional
    @Override
    public void transferInTransactionByDeclaration(String out, String in, double money) {
        accountDao.outMoney("aaa", 200);
        assert  1 == 2;
        accountDao.inMoney("bbb", 200);
    }
}
