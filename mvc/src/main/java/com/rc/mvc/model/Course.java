package com.rc.mvc.model;

import java.util.List;

/**
 * @ClassName Course
 * @Description 课程类
 * @Author liux
 * @Date 19-4-26 下午5:17
 * @Version 1.0
 */
public class Course {

    // 课程Id
    private Integer courseId;
    // 课程名称
    private String title;
    // 图片路径
    private String imgPath;
    // 学习人数
    private Integer learningNum;
    // 课程时长
    private Long duration;
    // 课程难度
    private Integer level;
    // 课程难度描述
    private String levelDesc;
    // 课程介绍
    private String descr;
    // 课程提纲
    private List<Chapter> chapterList;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Integer getLearningNum() {
        return learningNum;
    }

    public void setLearningNum(Integer learningNum) {
        this.learningNum = learningNum;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelDesc() {
        return levelDesc;
    }

    public void setLevelDesc(String levelDesc) {
        this.levelDesc = levelDesc;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", title='" + title + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", learningNum=" + learningNum +
                ", duration=" + duration +
                ", level=" + level +
                ", levelDesc='" + levelDesc + '\'' +
                ", descr='" + descr + '\'' +
                ", chapterList=" + chapterList +
                '}';
    }
}
