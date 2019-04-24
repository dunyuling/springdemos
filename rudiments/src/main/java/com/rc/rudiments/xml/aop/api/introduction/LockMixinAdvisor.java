package com.rc.rudiments.xml.aop.api.introduction;

import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**
 * @ClassName LockMixinAdvisor
 * @Description LockMixin advisor类
 * @Author liux
 * @Date 19-4-23 下午7:21
 * @Version 1.0
 */
public class LockMixinAdvisor extends DefaultIntroductionAdvisor {

    public LockMixinAdvisor() {
        super(new LockMixin(), Lockable.class);
    }
}
