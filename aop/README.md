##from:https://www.imooc.com/learn/869

##概览
    + 走向面向切面编程
        + 编程范式
            * 面向过程范式
            * 面向对象范式
            * 面向函数范式
            * 事件驱动范式
            * 面向切面范式
        + 面向切面范式(AOP)
            * 是一种编程范式，不是一种编程语言
            * 解决特定问题，不能解决所有问题
            * 是oop的补充，不是替代
        + AOP的初衷
            * DRY: Don't Repeat Yourself
            + SoC: Separation of Concerns
                * 水平分离：展示层-->服务层-->持久层
                * 垂直分离：模块划分(订单，库存等)
                * 切面分离：分离功能性需求与非功能性需求
        + AOP的好处
            * 集中处理某一关注点/横切面逻辑                        
            * 可以很方面的添加/删除关注点                        
            * 侵入性少，增强代码可读性以及可维护性
        + AOP应用场景
            * 权限控制
            * 缓存控制
            * 事务控制
            * 审计日志
            * 性能监控
            * 分布式追踪
            * 异常处理
        + 支持AOP的编程语言
            java,.net,c/c++,ruby,python...    
    + Spring中AOP的使用(对应package:com.rc.aop.mock)
        + 案例背景
            * 产品管理的服务
            * 产品添加/删除的操作只能管理员才能进行
            * 普通实现 vs AOP实现
            * 见com.rc.aop.mock.ProductTest
    + 小结
        * 为什么引入AOP的编程范式
        * AOP的好处以及适用场景
        + 两大核心要点
            * 切面
            * 织入                                       

##AOP使用
    + AspectJ主要注解
        * @Aspect
        * @PointCut
        * @Advice
    + Pointcut expression
        + com.rc.aop.designators
            + 匹配方法(对应package：com.rc.aop.com.rc.aop.designators.execution)
                + execution()
                    * 表达式解释
                        标注问号代表可以省略
                        execution(
                                modifier-pattern?
                                ret-type-pattern
                                declaring-type-pattern? 包名
                                name-pattern(param-pattern)
                                throws pattern?
                        )
                    * @Pointcut("execution(public * com.rc.aop.com.rc.aop.designators.execution.ExecutionService.m1(..))")
            + 匹配注解(对应package：com.rc.aop.com.rc.aop.designators.annotation)
                + @target()
                    * 匹配标注有 @NeedSecured 的类底下的方法，要求的annotation的RetentionPolicy级别为RUNTIME
                    * @Pointcut("@target(com.rc.aop.com.rc.aop.designators.annotation.NeedSecured)")                
                + @args()
                    * 匹配传入的参数标注有 @NeedSecured注解的类 的方法
                    * @Pointcut("@args(com.rc.aop.com.rc.aop.designators.annotation.NeedSecured)")               
                + @within()
                    * TODO 非 spring 环境 匹配标注有 @NeedSecured 的类底下的方法，要求的annotation的RetentionPolicy级别为CLASS
                    * TODO spring 环境 匹配标注有 @NeedSecured 的类底下的方法，要求的annotation的RetentionPolicy级别为CLASS或者RUNTIME
                    * @Pointcut("@within(com.rc.aop.com.rc.aop.designators.annotation.NeedSecured)")               
                + @annotation()
                    * 匹配方法标有 @AnnotationDemo 的注解的方法
                    * @Pointcut("@annotation(AnnotationDemo)")                
            + 匹配包/类型(对应package：com.rc.aop.com.rc.aop.designators.pkg)
                + within()  
                    * 匹配PkgService里的所有方法
                        @Pointcut("within(com.rc.aop.com.rc.aop.designators.com.rc.aop.designators.pkg.PkgService)")
                    * 匹配com.rc.aop.com.rc.aop.designators.pkg包及其子包下的所有方法
                        @Pointcut("within(com.rc.aop.com.rc.aop.designators..*)")            
            + 匹配对象(对应package：com.rc.aop.com.rc.aop.designators.obj)
                + this()
                    * 匹配AOP对象的目标对象为指定类型的方法，即 ObjService 的aop代理对象的方法
                    * @Pointcut("this(com.rc.aop.com.rc.aop.designators.obj.ObjService)")              
                + target()                
                    * 匹配实现 IObjService 接口的目标对象(而不是aop代理后的对象)的方法，这里即 OjbService2 的方法
                    * @Pointcut("target(com.rc.aop.com.rc.aop.designators.obj.IObjService)")
                + bean()                
                    * 匹配所有以Service结尾的bean里头的方法
                    * @Pointcut("bean(objService)")   
                + this()与target()的区别
                    * introduction(本课程不涉及)                    
            + 匹配参数(对应package：com.rc.aop.com.rc.aop.designators.args) 
                * 匹配任何以find开头且只有Long参数的方法
                    @Pointcut("execution(* *..find*(Long))")
                * 匹配只有一个Long参数的方法
                    @Pointcut("args(Long)")
                * 匹配任何以find开头且第一个参数为Long型的方法
                    @Pointcut("execution(* *..find*(Long,..))")
                * 匹配第一个参数为Long型的方法
                    @Pointcut("args(Long,..)")           
        + wildcards
            * *号(匹配任意数量字符)
            * +号(匹配指定类及其子类)
            * ..号(匹配任意数的子包或者参数)
        + operators
            * &&
            * ||
            * !
    + 5中Advice(对应package：com.rc.aop.com.rc.aop.advice)
        * @Before,前置通知    
        * @After(finally),后置通知    
        * @AfterReturning,返回通知，成功执行之后    
        * @AfterThrowing,异常通知，异常抛出之后   
        * @Around,环绕通知    

##AOP原理
    + 概述
        + 织入的时机
            * 编译器(AspectJ)
            * 类加载时(AspectJ 5+)
            * 运行时(Spring aop)
        + 运行时织入如何实现
            + 代理对象
                + 静态代理
                    +　缺点
                        * 代理方法越多，重复代码越多    
                + 动态代理
                    + 基于接口
                        * JDK代理
                    + 基于继承
                        * Cglib代理
                    
        + 代理模式(对应package：com.rc.aop.pattern.proxy)
            * 本应用属于静态代理          
    + 设计
        * 代理模式
        + 责任链模式(对应package：com.rc.aop.pattern.chain)
            * 分为基础版和加强版
            * 基础版自己管理链式关系
            * 加强版由Chain类统一管理
    + 实现
        + JDK实现(对应package：com.rc.aop.pattern.jkdproxy)
            + 要点
                * 类:java.lang.reflect.Proxy
                * 接口:InvocationHandler 
                * 只能基于接口进行代理
        + Cglib实现(对应package：com.rc.aop.pattern.Cglib)
        + JDK代理与Cglib代理对比
            * jdk只能针对有接口的类的接口方法进行动态代理
            * Cglib基于继承来实现代理，无法对static，final类进行代理
            * Cglib基于继承来实现代理，无法对private，static方法进行代理
        + Spring如何创建bean  
            * 如果目标对象实现了接口，则默认采用JDK动态代理  
            * 如果目标对象没有实现接口，则默认采用Cglib动态代理  
            * 如果目标对象实现了接口，且强制使用Cglib代理，则采用Cglib动态代理  
                @EnableAspectJAutoProxy(proxyTargetClass = true)

##AOP开源运用
    * @Transactional(事务)--详见项目 aoptransaction 项目
    * @PreAuthorize(安全)--详见项目 aopsecurity 项目
    * @Cacheable(缓存)--详见项目 aopcache 项目
    
##实战

##总结