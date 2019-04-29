package com.rc.transaction.manual.dao;

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
}
