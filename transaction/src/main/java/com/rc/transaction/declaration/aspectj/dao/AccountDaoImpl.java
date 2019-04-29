package com.rc.transaction.declaration.aspectj.dao;

import com.rc.transaction.declaration.aspectj.model.Account;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.ArrayList;
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
        return this.getJdbcTemplate().queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            Account account = new Account();
            account.setId(rs.getInt(1));
            account.setName(rs.getString(2));
            account.setMoney(rs.getDouble(3));
            return account;
        });
    }

    @Override
    public List<Account> findAll() {
        String sql = " select * from account";
        assert this.getJdbcTemplate() != null;
        List<Account> accounts = new ArrayList<>();
        this.getJdbcTemplate().query(sql, (RowMapper<Account>) (rs, rowNum) -> {
            while (!rs.isAfterLast()) {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setName(rs.getString("name"));
                account.setMoney(rs.getDouble("money"));
                accounts.add(account);
                rs.next();
            }
            return null;
        });
        return accounts;
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
        this.getJdbcTemplate().execute(sql, (PreparedStatementCallback<Object>) ps -> {
            for (Account account : list) {
                ps.setInt(1, account.getId());
                ps.setString(2, account.getName());
                ps.setDouble(3, account.getMoney());
                ps.addBatch();
            }
            ps.executeBatch();
            return null;
        });
    }
}