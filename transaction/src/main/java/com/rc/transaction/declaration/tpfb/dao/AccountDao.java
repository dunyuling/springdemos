package com.rc.transaction.declaration.tpfb.dao;

import com.rc.transaction.declaration.tpfb.model.Account;

import java.util.List;

/**
 * @ClassName AccountDao
 * @Description  AccountDao 接口
 * @Author liux
 * @Date 19-4-28 下午4:14
 * @Version 1.0
 */
public interface AccountDao {

    /*
     * @Author liux
     * @Description 转账方法
     * @Date 19-4-28 下午4:45
     * @param out 转出账号
     * @param money 转账金额
     * @return void
     **/
    void outMoney(String out, double money);


    /*
     * @Author liux
     * @Description 转账方法
     * @Date 19-4-28 下午4:45
     * @param in 转入账号
     * @param money 转账金额
     * @return void
     **/
    void inMoney(String in, double money);


    /*
     * @Author liux
     * @Description 根据id 查询 Account
     * @Date 19-4-28 下午11:26
     * @param id
     * @return void
     **/
    Account findById(int id);

    /*
     * @Author liux
     * @Description 查询所有的Account
     * @Date 19-4-28 下午11:28
     * @param 
     * @return java.util.List<com.rc.transaction.declaration.model.Account>
     **/
    List<Account> findAll();

    /*
     * @Author liux
     * @Description 更新账户金额
     * @Date 19-4-29 上午12:29
     * @param id
     * @param money
     * @return void
     **/
    void updateAccount(int id, double money);


    /*
     * @Author liux
     * @Description 批量添加账户
     * @Date 19-4-29 上午12:30
     * @param list
     * @return void
     **/
    void insertAccounts(List<Account> list);
}
