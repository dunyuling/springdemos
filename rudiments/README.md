##from:https://www.imooc.com/learn/196
####本模块为spring入门模块,系统讲解了spring中ioc,aop方面的内容, 以弥补上述模块如(ioc,aop中讲解不全面的地方),需对照学习

##专题一 IoC
    + 接口及面向接口编程
        + 接口
            * 用于沟通的中介物的抽象化
            * 实体把自己提供给外界的一种抽象化说明,用以由内部操作分离出外部沟通方法,使其能被修改内部而不影响外界其他实体与其交互方式
            * 对应java接口即声明,声明了哪些方法是对外公开的
            * 在java8中,接口可以拥有方法体
        + 面向接口编程
            * 结构设计中,分清层次及调用关系,每层只向外(上层)提供一组功能接口,各层间仅依赖接口而非实现类    
            * 接口实现的变动不影响各层间的调用,这一点在公共服务领域尤为重要     
            * "面向接口编程"中的"接口"是用于隐藏具体实现和实现多态性的组件     
            * 例子    
    + 什么是IoC
        * IoC:控制反转,控制权的转移,应用程序本身不负责依赖对象的创建和维护,而是由外部容器负责创建和维护
        * DI(依赖注入)是其一种实现方式
        * 目的:创建对象,并且组装对象之间的关系
        * 扩展理解:获得依赖对象的过程被反转了
    * Spring的Bean配置(见xml)
    + Bean的初始化
        + 基础:两个包
            * org.springframework.beans
            * org.springframework.context
            * BeanFactory提供配置结构和基本功能,加载并初始化Bean
            * ApplicationContext保存了Bean对象并在Spring中被广泛使用
        + 方式,ApplicationContext
            * 本地文件
            * classpath
            + Web应用中依赖Listener  
                <listener>
                    <listener-class> org.springframework.web.context.ContextLoaderListener </listener-class>
                </listener>
    + Spring注入            
        * Spring注入是指在启动Spring容器加载bean配置的时候,完成对变量的赋值行为
        + Spring的常用注入方式
            * 设值注入
            * 构造注入
            
##专题二 Bean          
    + Bean配置项  
        * id
        * class
        * scope
        * construct arguments
        * properties
        * autowiring mode
        * lazy-initialization mode
        * initialization/destruction methodd
    + Bean作用域
        * singleton:单例,一个bean容器只存在一份
        * prototype:每次请求(每次使用)创建新的实例,destroy方式不生效  
        * request:每次http请求创建一个实例且仅在当前request内有效  
        * session:同上,每次http请求创建,当前Session内有效  
        * global Session:基于portlet的web中有效(portlet定义了global session),
            如果是在Web中,同session  
    + Bean生命周期(见模块ioc中的相应内容)  
        * 定义
        + 初始化
            * 实现org.springframework.beans.factory.InitializingBean接口,覆盖afterPropertiesSet方法
            * 配置init-method
        * 使用
        + 销毁
            * 实现org.springframework.beans.factory.DisposableBean接口,覆盖afterPropertiesSet方法
            * 配置destroy-method
    + Aware
        * Spring提供了一些以Aware结尾的接口,实现了Aware接口的bean在被初始化之后,可以获取相应资源
        * 通过Aware接口,可以对Spring相应资源进行操作(一定要慎重)
        * 为对Spring进行简单的扩展提供了方便的入口  
    + Bean自动装配(Autowiring)
        * No(不做任何操作)
        * byName:根据属性名称自动装配.此选项将检查容器并根据名字查找与属性完全一致的bean,并将其与属性自动装配
        * byType:如果容器中存在一个与指定属性类型相同的bean,那么将与该属性自动装配;如果存在多个该类型的bean,
            那么抛出异常,并指出不能使用byType方式进行自动装配;如果没有找出相匹配的bean,则什么事都不发生        
        * construct:与byType方式类似,不同之处在于它应用于构造器参数.如果容器中没有找到与构造器参数类型一致的
            bean,那么抛出异常    
    + Resources&ResourceLoader
        + Resources
            * 针对于资源文件的统一入口
            + 分类
                * UrlResource:URL对应的资源,根据一个URL地址即可构建
                * ClassPathResource:获取类路径下面的资源文件
                * FileSystemResource:获取文件系统的资源文件
                * ServletContextResource:ServletContext封装的资源,用于访问ServletContext环境下的资源
                * InputStreamResource:针对输入流封装的资源
                * ByteArrayResource:针对于字节数组封装的资源
        + ResourceLoader 
            * all application context implements the ResourceLoader interface,and therefore all
                application context may be used to obtain Resource instances

##专题三 AOP
    + 什么是AOP
        * AOP:Aspect Oriented Programmingd.面向切面编程,通过预编译方式和运行期动态代理实现程序功能的
            统一维护的一种技术
        * 主要功能:日志记录,性能统计,安全控制,事务控制,异常处理   
        + 实现方式
            + 预编译
                * AspectJ
            + 运行期动态代理(JDK动态代理,Cglib动态代理)
                * SpringAOP 
                * JbossAOP 
        + 相关概念
            * 切面(Aspect)
                一个关注点的模块化,这个关注点可能会横切多个对象        
            * 连接点(Joinpoint)
                程序执行过程中某个特定的点        
            * 通知(Advice)
                在切面的某个特定的连接点上执行的动作        
            * 切入点(Pointcut)
                匹配连接点的断言,在AOP中通知和一个切入点表达式关联        
            * 引入(Introduction)
                在不修改类代码的前提下,为类添加新的方法和属性        
            * 目标对象(Target Object)
                被一个或者多个切面通知的对象        
            * AOP代理(AOP Proxy) 
                AOP框架创建的对象,用来实现切面契约(aspect contract)
                    (包括通知方法执行等功能)       
            * 织入(Weaving)
                把切面连接到其他程序类型或者对象上,并创建一个被通知的对象,
                    分为:编译时织入,类加载时织入,执行时织入        
    + spring AOP
        * 提供了声明式的企业服务,特别是EJB的替代服务的声明
        * 允许用户定制自己的方面,以完成OOP与AOP的互补使用
        + 实现
            * 纯java实现,无需特殊的编译过程,无需控制类加载器层次
            * 只支持方法执行连接点(通知Spring Bean的方法执行)
            * 不是为了提供最完整的AOP实现(尽管很强大);而是侧重于提供一种AOP实现
                和Spring IoC容器之间的整合,用于帮助解决企业应用的常见问题
            * Spring AOP 不会与AspectJ竞争,从而提供全面的AOP实现方案  
        + 有接口和无接口Spring AOP实现的区别
            * Spring AOP默认使用标准的JavaSErvice动态代理作为AOP代理,这使得
                任何接口(接口集)都可以被代理
            * Spring AOP中也可以使用CGLIB代理(如果一个业务对象并没有实现一个接口)      
    + schema-based AOP(对应package:com.rc.rudiments.xml.aop.schema)
        * Spring所有的切面和通知器都必须放在一个<aop:config>内,(可以配置多个<aop:config>语速),
            每一个<aop:config>可以包含pointcut,advisor和aspect元素
        * <aop:config>风格大量使用了spring的自动代理机制  
        + Introductions
            * 简介允许一个切面声明一个实现指定接口的通知对象,并且提供了一个接口实现类来代表这些对象
            * 由<aop:aspect>中的<aop:declare-parents>元素声明该元素用于声明所匹配的类型拥有一个
                新的Parent(因此得名)   
        * Aspect instantiation models
            scheme-defined aspects只支持singleton model 
        + advisors
            * 一个小的自包含的方面,只有一个advice
            * 切面自身通过一个bean表示,并且必须实现某个advice接口,同时,advisor也可以很好得利用
                AspectJ的切入点表达式                      
            * 由<aop:advisor>元素来使用,大多数情况下它会和transaction advice配合使用
            * 通过order属性来定义advisor的顺序    
    * spring AOP API(对应package:com.rc.rudiments.xml.aop.api)
        * 这是Spring1.2历史用法,现在(V5.1)仍然支持
        * SpringAOP基础
        * 现在用法基于历史用法,只是进行了简化
        + pointcut
            * 实现之一:NameMatchMethodPointcut,根据方法名字进行匹配
            * 成员变量:mappedNames
        + Before advice
            * 一个简单的通知类型
            * 进入方法之前被调用，不需要MethodInvocation对象
            * 前置通知可以在连接点之前自定义行为,但不能改变返回值  
        + Throws advice
            * 如果连接点抛出异常,throws advice在连接点返回后调用
            * 如果throws-advice方法抛出异常,那么它将覆盖原有异常
            + org.springframework.aop.ThrowsAdvice 不包含任何方法,仅仅是一个声明
                实现类需要试下以下方法
                * void afterThrowing([Method, args, target], ThrowableSubclass)
        + after returning advice
            * 必须实现 org.springframework.aop.AfterReturningAdvice 接口
            * 可以访问返回值(但不能进行修改),被调用的方法,方法的参数和目标
            * 如果抛出异常,则会抛出拦截器链,代替返回值     
        + interceptor around advice
            * spring的切入点模型使得切入点可以独立与advice重用,以针对不同的advice可以
                使用相同的切入点   org.springframework.aop.framework
        + Introduction advice
            * spring 把引入通知作为一种特殊的拦截通知
            * 需要 IntroductionAdvisor 和 IntroductionInterceptor
            * 仅适用于类,不能和切入点一起使用   
            + demo
                * from:Spring test suit
                * 如果调用lock()方法,希望所有的setter方法抛出 LockedException(如使
                    物体不可变,AOP典型例子)
                * 需要一个完成繁重任务的 IntroductionInterceptor, 这种情况下,可以使用
                    org.springframework.aop.support.DelegatingIntroductionInterceptor
                * introduction advisor 比较简单,持有独立的 LockMixin 实例
        + Advisor API in Spring
            * Advisor是仅包含一个切入点表达式关联的单个通知的方面
            * 除了 introductions, advisor 可以用于任何通知
            * org.springframework.aop.support.DefaultIntroductionAdvisor 是最常用的 advisor 类,
                可以与 MethodInterceptor,BeforeAdvice等一起使用
            * 可以混合在同一个AOP代理的 advisor 和 advice   
        + ProxyFactoryBean
            * 创建Spring AOP代理的基本方法是使用org.springframework.aop.framework.ProxyFactoryBean 
            * 完全控制切入点和通知以及他们的顺序
            * 使用 ProxyFactoryBean 或这其他IoC相关类来创建AOP代理的最重要的好处是通知和切入点也可以由IoC管理
            * 被代理类没有实现任何接口,由CGLIB代理,否则代理
            * 通过设置proxyTargetClass为true,可强制使用CGLIB
            * 如果目标类实现了一个(或者多个)接口,那么创建代理的类型将依赖ProxyFactoryBean的配置
            * 如果ProxyFactoryBean的proxyInterfaces属性被设置为一个或者多个全限定名接口名,基于JDK的代理被创建
            * 如果ProxyFactoryBean的proxyInterfaces属性没有被设置,但是目标类实现了一个(或者更多)接口,那么ProxyFactoryBean
                将自动检测到这个目标类已经实现了至少一个接口,创建一个JDK的代理 
            + proxying classes
                * 没有实现接口,将会使用CGLIB代理,而不是JDK代理
                * 即使有接口,也可强制使用CGLIB代理
                * CGLIB代理的工作原理为在运行时生成目标类的子类,Spring配置这个生成的子类委托方法调用到原来的目标
                * 子类是用来实现Decorator模式,织入通知
                + CGLIB 代理对用户透明,需要注意:
                    * final 方法不能被通知,因为他们不能被覆盖
                    * CGLIB 已被加入到了 Spring核心jar,可实现开箱即用 
        + ProxyFactory
            * 使用Spring AOP 而不必依赖于Spring IoC
            * 最佳实践是用IoC容器创建AOP代理
            * 虽然可以硬编码方式实现,但是Spring推荐使用配置或注解方式实现                                                              
                                              
    + AspectJ
        * @AspectJ的风格类似纯java注解的普通java类
        * Spring 可以使用AspectJ来做切入点解析
        * AOP的运行时仍旧是纯的Spring AOP,对AspectJ的编译器或者织入无依赖性  
        + aspect
            * @Aspect切面使用@Aspect注解配置,拥有@Aspect的任何bean将被Spring自动识别并应用
            * 用@Aspect 注解的类可以有方法和字段,他们也可能包括pointcut,advice,introduction 声明
            * @Aspect 注解不能通过类路径自动检测发现,所以需要配合使用@Component注解或者在xml中配置bean
            * 一个类中的@Aspect 注解标识它为一个切面,并且将自己从自动代理中排除
        + pointcut(具体介绍见aop module)
            + 定义良好的切入点    
                * AspectJ 是编译期的AOP
                * 检查代码并匹配连接点与切入点的代价是昂贵的
                * 一个好的切入点应该包括以下几点:
                    * 选择特定类型的连接点,如:execution,get,set,call,handler
                    * 确定连接点范围, 如:within,withincode
                    * 匹配上下文信息, 如:this,target,@annotation     
                                