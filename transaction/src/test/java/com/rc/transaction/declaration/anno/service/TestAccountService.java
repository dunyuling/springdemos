package com.rc.transaction.declaration.anno.service;

import com.rc.transaction.declaration.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @ClassName TestAccountService
 * @Description 转账业务测试类---声明式事务管理--基于 annotation 方式配置
 * @Author liux
 * @Date 19-4-28 下午4:42
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:applicationContext_declaration_transaction_anno.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAccountService {

    @Resource(name="accountService")
    private AccountService accountService;

    @Test
    public void testTransferInTransactionByDeclaration() {
        accountService.transferInTransactionByDeclaration("aaa","bbb",200.0);
    }
}
