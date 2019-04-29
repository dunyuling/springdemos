package com.rc.transaction.declaration.aspectj.service;

import com.rc.transaction.declaration.RollBackException;
import com.rc.transaction.declaration.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @ClassName TestAccountService
 * @Description 转账业务测试类---声明式事务管理--基于aspectj的XML方式配置
 * @Author liux
 * @Date 19-4-28 下午4:42
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:applicationContext_declaration_transaction_aspectj.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAccountService {

    @Resource(name="accountService")
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
    public void testModifyAccountById() throws RollBackException {
        accountService.modifyAccountById(1,800);
    }

    @Test
    public void testAddAccounts() {
        accountService.addAccounts();
    }


    @Test
    public void test() {
        for (int i1 = 0; i1 < 10; i1++) {
            int i = new Random().nextInt(6);
            if (i % 2 == 0) {
                System.out.println(i + "\t ---");
            } else {
                System.out.println(i + "\t +++");
            }
        }

    }

}
