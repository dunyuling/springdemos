package com.rc.transaction.declaration.tpfb.service;

import com.rc.transaction.declaration.tpfb.model.Account;

import java.util.List;

/**
 * @ClassName AccountService
 * @Description 转账接口
 * @Author liux
 * @Date 19-4-28 下午4:10
 * @Version 1.0
 */
public interface AccountService {

    /*
     * @Author liux
     * @Description 转账方法---注解事务
     * @Date 19-4-28 下午5:33
     * @param out 转出账号
     * @param in 转入账号
     * @param money 转账金额
     * @return void
     **/
    void transferInTransactionByDeclaration(String out, String in, double money);

    /*
     * @Author liux
     * @Description 根据id 获取 Account
     * @Date 19-4-28 下午11:43
     * @param id 账户id
     * @return com.rc.transaction.declaration.model.Account
     **/
    Account getById(int id);

    /*
     * @Author liux
     * @Description 获取所有的Account
     * @Date 19-4-28 下午11:43
     * @param 
     * @return java.util.List<com.rc.transaction.declaration.model.Account>
     **/
    List<Account> getAll();

    /*
     * @Author liux
     * @Description 更新账户的金额
     * @Date 19-4-29 上午12:27
     * @param id
     * @param money
     * @return void
     **/
    void modifyAccountById(int id, double money);


    /*
     * @Author liux
     * @Description 增加用户
     * @Date 19-4-29 上午12:28
     * @param 
     * @return void
     **/
    void addAccounts();
}
