package com.rc.mvc.model;

/**
 * @ClassName ContactInfo
 * @Description ContactInfo 类--配合演示数据绑定
 * @Author liux
 * @Date 19-4-29 下午4:19
 * @Version 1.0
 */
public class ContactInfo {

    private String phone;

    private String address;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
