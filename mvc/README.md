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