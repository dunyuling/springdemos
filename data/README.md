##from:https://www.imooc.com/learn/821

##Spring Data 概览
    + 什么是Spring Data
        * 主旨:Provider a familiar and consitent, Spring-based programming model for data access
    + 应用场景
        * Spring Data JPA
        * Spring Data Mongo DB
        * Spring Data Redis
        * Spring Data Solr
        ... 
    + 课程安排
        + 传统方式访问数据库
            + JDBC
                * Connection
                * Statement
                * ResultSet
            * Spring JdbcTemplate
            + 弊端分析
                * DAO 代码量太大,且 可能重复
                * 需要手动开发其他功能,例如:分页
        * Spring Data 快速起步            
        + Spring Data JPA 进阶
            + Repository
                * Spring Data 核心接口, 未提供任何方法
                * @RepositoryDefinition 注解的使用  
                
                + 子接口
                    * CrudRepository                           
                    * PagingAndSortingRepository                           
                    * JpaRepository   
                + 查询规则定义和使用
                    + 弊端
                        * 方法名比较长: 约定大于配置
                        * 难于实现复杂查询
                + @Query
                    * 在 Repository 方法中使用注解,不需要遵循查询方法名规则
                    * 支持命名参数及索引参数
                    * 支持本地查询   
                + 事务
                    * @Modifying
                    * @Modifying 结合 @Query 执行更新操作
                    + @Transactional
                        * service层
        + Spring Data JPA 高级            
            * CrudRepository
            * PagingAndSortingRepository                 
            * JpaRepository     
            + JpaSpecificationExecutor
                * 封装了 JPA Criteria 查询条件            
