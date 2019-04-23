package com.rc.rudiments.xml.aop.schema.advice.biz;

/**
 * @ClassName AspectBiz
 * @Description 被切面处理的业务逻辑类
 * @Author liux
 * @Date 19-4-23 下午12:01
 * @Version 1.0
 */
public class AspectBiz {

    public String biz() {
        System.out.println("AspectBiz biz()");
        return "String biz()";
    }

    public void init(String bizName, int times) throws Exception {
        System.out.println("AspectBiz init(String bizName, int times) " + bizName + "\t" + times);
//        throw new Exception("afterThrowing");
    }
}
