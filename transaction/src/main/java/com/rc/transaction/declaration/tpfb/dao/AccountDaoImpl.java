package com.rc.transaction.declaration.tpfb.dao;

import com.rc.transaction.declaration.AccountMapper;
import com.rc.transaction.declaration.Account;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

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

    @Override
    public Account findById(int id) {
        String sql = " select * from account where  id = ?";
        assert this.getJdbcTemplate() != null;
        return this.getJdbcTemplate().queryForObject(sql, new Object[]{id}, new AccountMapper());
    }

    @Override
    public List<Account> findAll() {
        String sql = " select * from account";
        assert this.getJdbcTemplate() != null;
        return this.getJdbcTemplate().query(sql, new AccountMapper());
    }

    @Override
    public void updateAccount(int id, double money) {
        String sql = " update account set money = ? where id = ?";
        assert this.getJdbcTemplate() != null;
        this.getJdbcTemplate().update(sql, money, id);
    }

    @Override
    public void insertAccounts(List<Account> list) {
        assert this.getJdbcTemplate() != null;
        String sql = "insert into account(id,name,money) values(?,?,?)";
        this.getJdbcTemplate().batchUpdate(sql, list, list.size(), (ps, account) -> {
            ps.setInt(1, account.getId());
            ps.setString(2, account.getName());
            ps.setDouble(3, account.getMoney());
        });
    }
}