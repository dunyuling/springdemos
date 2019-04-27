package com.rc.mvc.model;

/**
 * @ClassName Chapter
 * @Description 章节类
 * @Author liux
 * @Date 19-4-26 下午5:16
 * @Version 1.0
 */
public class Chapter {

    private Integer id;
    private Integer courseId;
    private Integer order;
    private String title;
    private String descr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
