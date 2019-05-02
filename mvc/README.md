####from:https://www.imooc.com/learn/47

##MVC 简介
    + front controller
    + 本质
        * MVC的核心思想是业务数据抽取同业务数据呈现相分离
    + 基本概念
        + DispatcherServlet
            * front controller
        + controller
            * generate model
        + HandlerAdapter
            * DispatcherServlet---use-->HandlerAdapter 
            * HandlerAdapter---knows---Controller       
            * controller 表现形式
        * HandlerInterceptor
        + HandlerMapping 
            * Help DispatcherServlet to get the right controller
            * Wrap controller with HandlerInterceptor
        + HandlerExecutionChain
            * preHandle--->controller method--->postHandle--->afterComplete
        + ModelAndView   
        + ViewResolver
            * Help DispatcherServlet to Resolve the right view to render page.
        + View
            * Responsible for page rendering 
    + Work with Json
        * Json(Javascript Object Notation) is a lightweight data-interchagne format
        * Restful Web Service
        * ContentNegotiatingViewResolver     
        + simple page application
            * course_json.jsp   
            
            
##from:https://www.imooc.com/learn/558
##MVC 数据绑定
    + 程序示例见： com.rc.mvc.controller.DataBindController
        * set 形式支持不好
        * map 形式,未能实现,还不知道具体原因
        * json　形式分为两种　form 和　raw, 都已经通过 jquery 方式实现,见 index.jsp
        * xml 形式,见index.jsp
        + 自定义格式化工具和类型转换器
            + PropertyEditor
                * 内置的可扩展
                * 局部使用,配合 webdatabinder 
            + Formatter
                * 内置的可扩展 
                * 全局/局部
                * Source=String
            + Converter
                * 内置的不可扩展
                * 全局/局部     
                * Source=自定义
        + restful(Resource Representational State Transfer)
            + resource
                * uri    
            + representational
                + 表现
                    + 文本
                        * txt
                        * html
                        * 二进制
                    + 图片
                        * jpg
                        * png
                * http协议content-type,accept        
            + state transfer
                * get 幂等
                * post 非幂等
                * put 幂等
                * delete 非幂等
                * patch  需要再学习
                * options 需要再学习
                                         