本项目为aop项目中关于“AOP开源运用 @PreAuthorize”的对应项目
本项目在spring-boot-1.4.2.RELEASE相关包下可以运行成功,其他版本下需要进行调试

##要点
    * MethodSecurityInterceptor
    * PreInvocationAuthorizationAdviceVoter
    * ExpressionBasedPreInvocationAdvice
    
    AbstractSecurityInterceptor---decide()-->
        AffirmativeBased---vote()--->
        PreInvocationAuthorizationAdviceVoter---before()-->
        ExpressionBasedPreInvocationAdvice