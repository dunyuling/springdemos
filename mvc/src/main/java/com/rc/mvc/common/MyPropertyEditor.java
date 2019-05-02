package com.rc.mvc.common;

import com.rc.mvc.model.User;

import java.beans.PropertyEditorSupport;

/**
 * @ClassName MyPropertyEditor
 * @Description TODO
 * @Author liux
 * @Date 19-4-30 下午12:38
 * @Version 1.0
 */
public class MyPropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        User user = new User();
        String[] arr = text.split(",");
        user.setName(arr[0]);
        user.setAge(Integer.valueOf(arr[1]));
        setValue(user);
    }

    public static void main(String[] args) {
        MyPropertyEditor myPropertyEditor = new MyPropertyEditor();
        myPropertyEditor.setAsText("a,2");
        System.out.println(myPropertyEditor.getValue());
    }
}
