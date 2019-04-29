package com.rc.transaction.declaration;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName AccountMapper
 * @Description TODO
 * @Author liux
 * @Date 19-4-29 下午1:37
 * @Version 1.0
 */
public class AccountMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setId(rs.getInt("id"));
        account.setName(rs.getString("name"));
        account.setMoney(rs.getDouble("money"));
        return account;
    }
}
