package com.rc.transaction.manual.service;

import com.rc.transaction.manual.dao.AccountDao;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @ClassName AccountServiceImpl
 * @Description 转账 实现类
 * @Author liux
 * @Date 19-4-28 下午4:12
 * @Version 1.0
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    private TransactionTemplate transactionTemplate;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    /*
     * @Author liux
     * @Description 转账方法--非事务
     * @Date 19-4-28 下午4:45
     * @param out 转出账号
     * @param in 转入账号
     * @param money 转账金额
     * @return void
     **/
    @Override
    public void transfer(String out, String in, double money) {
        accountDao.outMoney(out, money);
        accountDao.inMoney(in, money);
    }

    /*
     * @Author liux
     * @Description 转账方法--手动管理的事务
     * @Date 19-4-28 下午5:33
     * @param out 转出账号
     * @param in 转入账号
     * @param money 转账金额
     * @return void
     **/
    @Override
    public void transferInTransactionByManual(final String out, final String in, final double money) {
        /*transactionTemplate.execute(status -> {
            accountDao.outMoney(out, money);
            accountDao.inMoney(in, money);
            return null;
        });*/

        transactionTemplate.execute(status -> {
            accountDao.outMoney(out, money);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            accountDao.inMoney(in, money);
            return null;
        });
    }

}
