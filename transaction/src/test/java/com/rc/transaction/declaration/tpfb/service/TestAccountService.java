package com.rc.transaction.declaration.tpfb.service;

import com.rc.transaction.declaration.tpfb.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ClassName TestAccountService
 * @Description 转账业务测试类---声明式事务管理--基于 TransactionProxyFactoryBean 的方式
 * @Author liux
 * @Date 19-4-28 下午4:42
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:applicationContext_declaration_transaction_tpfb.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAccountService {

    //注入代理类:因为代理类进行了增强操作
//    @Resource(name="accountService")
    @Resource(name="accountServiceProxy")
    private AccountService accountService;

    @Test
    public void testTransferInTransactionByDeclaration() {
        accountService.transferInTransactionByDeclaration("aaa","bbb",200.0);
    }

    @Test
    public void testFindById() {
        Account account = accountService.getById(1);
        System.out.println(account.toString());
    }

    @Test
    public void testGetAll() {
        accountService.getAll()/*.forEach(account -> System.out.println(account.toString()))*/;
    }

    @Test
    public void testModifyAccountById() {
        accountService.modifyAccountById(1,800);
    }

    @Test
    public void testAddAccounts() {
        accountService.addAccounts();
    }


}
