package com.rc.ioc.official.xml.inherit;

/**
 * @ClassName Class4
 * @Description TODO
 * @Author liux
 * @Date 19-3-30 下午12:50
 * @Version 1.0
 */
public class Class4 {

    private String attr1;
    private String attr2;
    private String attr3;
    private String attr9;

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

    public String getAttr9() {
        return attr9;
    }

    public void setAttr9(String attr9) {
        this.attr9 = attr9;
    }

    @Override
    public String toString() {
        return "Class4{" +
                "attr1='" + attr1 + '\'' +
                ", attr2='" + attr2 + '\'' +
                ", attr3='" + attr3 + '\'' +
                ", attr9='" + attr9 + '\'' +
                '}';
    }
}
