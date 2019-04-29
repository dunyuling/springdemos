##from:https://www.imooc.com/learn/478

## spring transaction
    + 事务回顾
        + 什么是事务
            * 事务指的是逻辑上的一组操作,这组操作要么全成功,要么全失败
        + 特性
            + 原子性
                * 事务是一个不可分割的工作单位,事务中的操作要么都发生,要么都不发生
            + 一致性
                * 事务前后数据的完整性必须保持一致
            + 隔离性
                * 多个用户并发访问数据库时,一个用户的事务不能被其他用户的事务干扰,多个并发
                    事务之间数据要隔离
            + 持久性
                * 一个事务一旦被提交,它对数据库中数据的改变是永久性的,即使数据库发生故障也不
                    应该对其有任何影响    
    + spring管理事务的一组API
        + 接口介绍
            + PlatformTransactionManager(事务管理器)
                + DataSourceTransactionManager
                    * 使用Spring JDBC 或 iBatis 进行持久化数据时使用
                + HibernateTransactionManager
                    * 使用 Hibernate 进行持久化数据时 使用
                + JtaTransactionManager
                    * 使用一个JTA实现来管理事务,在一个事务跨越多个资源时必须使用
                + JpaTransactionManager
                    * 使用 JPA 进行持久化数据时 使用
                + JdoTransactionManager    
                    * 使用 Jdo 进行持久化数据时 使用
            + TransactionDefinition(事务定义信息:隔离,传播,超时,只读)
                + 隔离
                    + 可能的问题
                        + 脏读
                            * 一个事务读取了另一个事务改写但还未提交的数据,如果这些数据回滚,则
                                读到的数据是无效的
                            * rollback    
                        + 不可重复读
                            * 在同一事务中,多次读取同一数据返回的结果不同
                            * update
                        + 幻读    
                            * 一个事务读取了几行记录后,另一个事务插入一些记录,幻读就发生了.
                                再后来的查询中,第一个事务就会发现有些原来没有的记录.
                             * insert 
                    + 隔离级别  
                        + ISOLATION_DEFAULT   
                            * 使用后端数据库的默认隔离级别       
                        + ISOLATION_READ_UNCOMMITTED   
                            * 允许你读取还未提交的改变了的数据.可能导致脏读,幻读,不可重复读       
                        + ISOLATION_READ_COMMITTED          
                            * 允许在并发事务已经提交后读取.可防止脏读,但是幻读和不可重复读仍可发生
                        + ISOLATION_REPEATABLE_READ          
                            * 对相同字段的多次读取是一致的,除非数据被事务本身改变.可防止脏读,不可
                                重复读,但幻读仍可发生
                        + ISOLATION_SERIALIZABLE   
                            * 完全服从ACID的隔离级别,确保不发生脏读,幻读,不可重复读.这在所有的隔离
                                级别中是最慢的,它是典型的通过完全锁定在事务中涉及的数据表来完成的
                + 传播行为
                    * 解决业务层方法之间的相互调用的问题
                    + 使用调用方事务的不同情况
                        + PROPAGATION_REQUIRED(*)
                            * 支持当前事务,如果不存在,就新建一个
                        + PROPAGATION_SUPPORTS
                            * 支持当前事务,如果不存在,就不使用事务
                        + PROPAGATION_MANDATORY
                            * 支持当前事务,如果不存在,则抛出异常
                    + 调用方和被调用方不在同一事务中        
                        + PROPAGATION_REQUIRES_NEW(*)
                            * 如果有事务存在,挂起当前事务,创建一个新的事务
                        + PROPAGATION_NOT_SUPPORTED
                            * 以非事务方式运行,如果有事务存在,挂起当前事务
                        + PROPAGATION_NEVER
                            * 以非事务方式运行,如果有事务存在,抛出异常
                    + 嵌套事务 
                        + savepoint
                            * 被调用方发生异常,可以回滚到保存点,也可以回滚到调用方
                                的初始状态         
                        + PROPAGATION_NESTED(*)
                            * 如果当前事务存在,则嵌套事务执行
            * TransactionStatus(事务具体运行状态)
    + 编程式事务管理
        * 在实际中很少使用
        * 通过TransactionTemplate手动管理事务
    + 声明式事务管理
        * 推荐使用(代码侵入性小)
        * 通过AOP实现
        + XML
            + 基于 TransactionProxyFactoryBean
                * 对应package:com.rc.transaction.declaration.tpfb
                * com.rc.transaction.declaration.tpfb.service.AccountServiceImpl::getById 测试不可重复读,
                    当隔离级别设置为 ISOLATION_REPEATABLE_READ 时,不可重复读得到了控制,与文档描述一致
                * com.rc.transaction.declaration.tpfb.service.AccountServiceImpl::getAll 测试幻读,
                    当隔离级别设置为 ISOLATION_REPEATABLE_READ 时,幻读得到了控制,与文档描述不一致,文档中描述的是
                    在该级别下不能实现控制幻读.不知测试方法哪里出现了问题.                       
            + 基于 AspectJ 的XML方式
                * 对应package:com.rc.transaction.declaration.aspectj
                * 测试结果同 '基于 TransactionProxyFactoryBean'
            + 基于注解
                * 对应package:com.rc.transaction.declaration.anno    
                * 未进行脏读,幻读,不可重复读的测试