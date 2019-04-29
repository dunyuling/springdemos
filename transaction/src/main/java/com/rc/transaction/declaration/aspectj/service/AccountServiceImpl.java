package com.rc.transaction.declaration.aspectj.service;

import com.rc.transaction.declaration.RollBackException;
import com.rc.transaction.declaration.aspectj.dao.AccountDao;
import com.rc.transaction.declaration.Account;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Description 转账 实现类
 * @Author liux
 * @Date 19-4-28 下午4:12
 * @Version 1.0
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    private DataSourceTransactionManager dataSourceTransactionManager;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setDataSourceTransactionManager(DataSourceTransactionManager dataSourceTransactionManager) {
        this.dataSourceTransactionManager = dataSourceTransactionManager;
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
    @Override
    public void transferInTransactionByDeclaration(String out, String in, double money) {
        accountDao.outMoney("aaa", 200);
        assert 1 == 2;
        accountDao.inMoney("bbb", 200);
    }

    @Override
    public Account getById(int id) {
        Account account = accountDao.findById(id);
        System.out.println(account);
        System.out.println("---------------");

        //添加断点, 同时运行  modifyAccountById(int id, double money),测试不可重复读
        account = accountDao.findById(id);

        System.out.println(account);
        System.out.println("-------------");

        account = accountDao.findById(id);
        return account;
    }

    @Override
    public List<Account> getAll() {
        List<Account> accounts = accountDao.findAll();
        accounts.forEach(System.out::println);
        System.out.println("----------------");

        //添加断点,同时运行 addAccounts() ,测试幻读
        accounts = accountDao.findAll();
        accounts.forEach(System.out::println);
        return accounts;
    }

    @Override
    public void modifyAccountById(int id, double money) throws RollBackException {
        accountDao.updateAccount(id, money);

        //TODO 未能测试成功,需要"改写,但还未提交,而上述更改已经提交了",现在尚不知道如何进行测试
        /*try {
            if (new Random().nextInt(6) % 2 == 0) {
                throw new RollBackException("测试脏读");
            }
        } finally {
            System.out.println("----");
        }*/
    }

    @Override
    public void addAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account(4, "ddd", 1000),
                new Account(5, "eee", 1000)
        );
        accountDao.insertAccounts(accounts);
    }


}
