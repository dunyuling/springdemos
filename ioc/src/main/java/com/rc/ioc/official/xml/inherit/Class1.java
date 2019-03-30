package com.rc.ioc.official.xml.inherit;

/**
 * @ClassName ParentClass
 * @Description TODO
 * @Author liux
 * @Date 19-3-30 下午12:46
 * @Version 1.0
 */
public class Class1 extends ParentClass {

    private String attr4;
    private String attr5;

    public String getAttr4() {
        return attr4;
    }

    public void setAttr4(String attr4) {
        this.attr4 = attr4;
    }

    public String getAttr5() {
        return attr5;
    }

    public void setAttr5(String attr5) {
        this.attr5 = attr5;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "attr4='" + attr4 + '\'' +
                ", attr5='" + attr5 + '\'' +
                "} " + super.toString();
    }
}
