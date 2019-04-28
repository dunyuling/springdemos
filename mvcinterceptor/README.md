##from:https://www.imooc.com/learn/498

## mvc interceptor
    + 拦截器
        * 拦截器是指通过拦截从浏览器发往服务器的请求来完成功能的增强
    + 原理及使用
        + 原理
            *  mvc可以通过过滤器来实现字符编码的过滤
            *  拦截器原理与过滤器原理非常相似
        + 使用(基于实现HandlerInterceptor接口,基于WebRequestInterceptor接口的未做介绍)
            + 流程
                * 编写拦截器类实现 HandlerInterceptor 接口
                * 注册到 spring mvc 配置
                * 编写拦截规则
            + 方法介绍
                + preHandle
                    + 返回值:是否需要将当前的请求拦截下来
                        * false,请求将被终止
                        * true,请求会继续执行
                + postHandle
                    + modelAndView
                        * 改变返回属性
                        * 改变返回目的地
                * afterCompletion
            + 多个拦截起(interceptor1 ,interceptor2)
                + interceptor1 preHandle return true  & 
                    interceptor2 preHandle return true
                    * interceptor1 preHandle 
                    * interceptor2 preHandle
                    * 实际处理方法 
                    * interceptor2 postHandle 
                    * interceptor1 postHandle 
                    * interceptor2 afterCompletion 
                    * interceptor1 afterCompletion
                +  interceptor1 preHandle return false 
                    * interceptor1 preHandle 
                +  interceptor1 preHandle return true  & 
                        interceptor2 preHandle return true
                    * interceptor1 preHandle 
                    * interceptor2 preHandle
                    * interceptor1 afterCompletion                        
                        
    + 使用场景
        + 原则
            * 处理所有请求中的共性问题
        + 场景    
            * 乱码问题
            * 权限验证
    + 对比和总结
        * 过滤器 filter 依赖于 Servlet 容器,基于回调函数,过滤范围大(包含资源)
        * 拦截器 Interceptor 依赖于框架容器,基于反射机制,只过滤请求