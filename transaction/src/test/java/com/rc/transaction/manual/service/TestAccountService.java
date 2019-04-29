package com.rc.transaction.manual.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ClassName TestAccountService
 * @Description 转账业务测试类---编程式(手动)事务管理
 * @Author liux
 * @Date 19-4-28 下午4:42
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:applicationContext_manual_transaction.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAccountService {

    @Resource(name="accountService")
    private AccountService accountService;

    @Test
    public void testTransfer() {
        accountService.transfer("aaa","bbb",200.0);
    }

    @Test
    public void testTransferInTransactionByManual() {
        accountService.transferInTransactionByManual("aaa","bbb",200.0);
    }
}
