package com.rc.ioc.official.xml.inherit;

/**
 * @ClassName Class3
 * @Description TODO
 * @Author liux
 * @Date 19-3-30 下午12:49
 * @Version 1.0
 */
public class Class3 {

    private String attr1;
    private String attr2;
    private String attr3;
    private String attr8;

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    public String getAttr8() {
        return attr8;
    }

    public void setAttr8(String attr8) {
        this.attr8 = attr8;
    }

    @Override
    public String toString() {
        return "Class3{" +
                "attr1='" + attr1 + '\'' +
                ", attr2='" + attr2 + '\'' +
                ", attr3='" + attr3 + '\'' +
                ", attr8='" + attr8 + '\'' +
                '}';
    }
}
