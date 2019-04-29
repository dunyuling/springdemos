package com.rc.transaction.manual.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @ClassName AccountDaoImpl
 * @Description AccountDaoImpl 实现类
 * @Author liux
 * @Date 19-4-28 下午4:16
 * @Version 1.0
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void outMoney(String out, double money) {
        String sql = "update account set money = money - ? where name = ?";
        assert this.getJdbcTemplate() != null;
        this.getJdbcTemplate().update(sql, money, out);
    }

    @Override
    public void inMoney(String in, double money) {
        String sql = "update account set money = money + ? where name = ?";
        assert this.getJdbcTemplate() != null;
        this.getJdbcTemplate().update(sql, money, in);
    }
}
