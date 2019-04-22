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