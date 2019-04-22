package com.rc.rudiments.xml.autowiring;

/**
 * @ClassName AutowiringService
 * @Description 自动装配--AutowiringService 类
 * @Author liux
 * @Date 19-4-21 下午10:50
 * @Version 1.0
 */
public class AutowiringService {

    private AutowiringDao autowiringDao;

    public AutowiringService() {

    }

    public AutowiringService(AutowiringDao autowiringDao) {
        System.out.println("AutowiringService constructor");
        this.autowiringDao = autowiringDao;
    }


    public void setAutowiringDao(AutowiringDao autowiringDao) {
        System.out.println("setAutoWiringDAO");
        this.autowiringDao = autowiringDao;
    }

    void say(String word) {
        this.autowiringDao.say(word);
    }
}
