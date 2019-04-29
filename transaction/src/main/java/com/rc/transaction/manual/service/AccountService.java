package com.rc.transaction.manual.service;

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
     * @Description 转账方法--非事务
     * @Date 19-4-28 下午4:11
     * @param out 转出账号
     * @param in 转入账号
     * @param money 转账金额
     * @return void
     **/
    void transfer(String out, String in, double money);

    /*
     * @Author liux
     * @Description 转账方法--手动管理的事务
     * @Date 19-4-28 下午5:33
     * @param out 转出账号
     * @param in 转入账号
     * @param money 转账金额
     * @return void
     **/
    void transferInTransactionByManual(String out, String in, double money);

}
