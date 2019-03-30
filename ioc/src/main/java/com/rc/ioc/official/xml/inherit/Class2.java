package com.rc.ioc.official.xml.inherit;

/**
 * @ClassName Class2
 * @Description TODO
 * @Author liux
 * @Date 19-3-30 下午12:48
 * @Version 1.0
 */
public class Class2 extends ParentClass {

    private String attr6;
    private String attr7;

    public String getAttr6() {
        return attr6;
    }

    public void setAttr6(String attr6) {
        this.attr6 = attr6;
    }

    public String getAttr7() {
        return attr7;
    }

    public void setAttr7(String attr7) {
        this.attr7 = attr7;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "attr6='" + attr6 + '\'' +
                ", attr7='" + attr7 + '\'' +
                "} " + super.toString();
    }
}
