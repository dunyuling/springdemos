##from(https://www.imooc.com/learn/1108)  
##Java Web 发展史
* 第一阶段: JavaBean + Servlet + JSP逐步发展  
* 第二阶段: 面对EJB重量级框架带来的种种麻烦
* 第三阶段: SpringMVC/Struts + Spring + Hibernate/Mybatis  
* 第四阶段: 享受SpringBoot "约定大于配置"的种种乐趣  
* 第五阶段: 以dubbo为代表的SOA微服务架构体系  
* 第六阶段: SpringCloud微服务架构技术生态圈

##课程内容：IoC
+ 介绍IoC并编写一个简单的IoC容器 (对应package: com.rc.ioc.my ) 
    + 什么是IoC
        + 控制什么？
            * 控制对象的创建及销毁(生命周期)
        + 反转什么？
            * 将对象的控制权交给IoC容器
        + 解耦
    + 示例 
        + 约定
            * 所有Bean的生命周期交由IoC容器管理
            * 所有被依赖的Bean通过构造方法执行注入
            * 被依赖的Bean优先创建
        + 回顾
            * 所有的依赖关系被集中统一的管理起来了
            * 每个类只需要关注自己的业务逻辑
            * 修改依赖关系变得容易
                               
+ 介绍如何通过xml的方式完成SpringIoC对Bean的管理(对应package: com.rc.ioc.official.xml)      
    + 通过Spring实例化Bean(对应package: com.rc.ioc.official.xml.instance)(详见spring-instance.xml)
        * 构造方法
        * 静态方法    
        * 实例方法    
        * Bean别名
    + 注入Bean(对应package: com.rc.ioc.official.xml.inject)
        * 构造方法(详见 spring-inject-construct.xml)
        * set方法(详见 spring-inject-set.xml)
        + 集合类Bean的注入(详见 spring-inject-collection.xml)
            * List
            * Set
            * Map
            * Properties
        * null值注入(详见 spring-inject-null.xml)
        * 注入时创建内部Bean(详见 spring-inject-inner-bean.xml)
    + Bean作用域
        * Singleton(只能保证同一个上下文环境的单例)        
        * prototype        
            + Bean1依赖于Bean2,分为以下四种情况(s代表singleton,p代表prototype)
                * Bean1(s),Bean2(s)-->Bean1(s),Bean2(s)  
                + Bean1(s),Bean2(p)-->Bean1(s),Bean2(s) 重点
                    * Bean1(s),Bean2(p)-->Bean1(s),Bean2(p) 的方法见MethodPrototypeBean.java和spring-method-prototype.xml  
                * Bean1(p),Bean2(s)-->Bean1(p),Bean2(s)  
                * Bean1(p),Bean2(p)-->Bean1(p),Bean2(p)    
                
        + Web环境(具体demo见项目ioc-web)
            * request 每个request请求都会创建一个单独的实例
            * session 每个session都会创建一个单独的实例
            * application 每个servletContext都会创建一个单独的实例 
            * websocket 每个websocket连接都会创建一个单独的实例
        + 自定义
            * MyScope
            * SimpleThreadScope(spring提供) 
    + Bean的懒加载 (详见resources/lazy/**.xml) 
        * 只对singleton的作用域有效(只有一个实例才需要控制)
        + 为一个Bean设定懒加载  
            * <bean lazy-init="true"/>  
        + 为所有Bean设定懒加载  
            * <beans default-lazy-init="true">...</beans>  
        + 适用场景
            * 如果某个Bean在程序整个运行周期都可能不会被使用,
                那么可考虑设定该Bean为懒加载
        + 优点
            * 尽可能的节省资源
        + 缺点
            * 可能会导致某个操作响应时间增加 
    + Bean的生命周期(详见resources/lifecycle/**.xml) 
        + Bean的初始化 
            + 如果需要在Bean实例化之后执行一些逻辑，有两种办法
                + 单个Bean
                    * 使用<bean init-Method="××" />配置
                    * 让Bean实现InitializingBean接口
                +多个Bean
                    * 使用<beans default-init-method="××">...</beans>配置 
        + Bean的销毁                            
            + 如果需要在Bean销毁之前执行一些逻辑，有两种办法
                + 单个Bean
                    * 使用<bean destroy-Method="××" />配置
                    * 让Bean实现DisposableBean接口
                +多个Bean
                    * 使用<beans default-destroy-method="××">...</beans>配置 
        + Bean的属性继承    
            * 场景一 (详见resources/inherit/spring-inherit-1.xml)                                                       
            * 场景二 (详见resources/inherit/spring-inherit-2.xml)                                                     
+ 介绍SpringIoC相关注解的使用(对应package：com.rc.ioc.official.annotation.inject)(测试类：com.rc.ioc.official.annotation.inject.TestBean)
    * 注解的基本使用
    + 通过注解注入Bean
        + 通过方法注入
            * 构造方法
            * set方法
        * 通过属性注入
        + 集合类型
            * 直接注入集合实例
            + 将多个泛型的实例注入到集合
                * 将多个泛型实例注入到List
                * 控制泛型实例在List中的顺序
                * 将多个泛型实例注入到Map
        * String,Integer等类型直接赋值
        * SpringIoC容器内置接口实例注入                
    + 通过注解设定Bean的作用域(详细描述见上文对应xml部分)(具体代码结合com.rc.ioc.official.annotation.scope.TestBean查看)
        * Singleton(只能保证同一个上下文环境的单例)        
        * prototype        
        * Web环境(具体demo见项目ioc-web)
        + 自定义
            * MyScope
            * SimpleThreadScope(spring提供) 
    * 通过注解开启Bean的懒加载
    * 通过注解编写Bean初始化与销毁

