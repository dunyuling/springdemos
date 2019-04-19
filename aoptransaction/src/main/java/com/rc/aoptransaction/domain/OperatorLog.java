package com.rc.aoptransaction.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName OperatorLog
 * @Description 日志实体类
 * @Author liux
 * @Date 19-4-18 上午9:40
 * @Version 1.0
 */
@Entity
@Table(name="operator_log")
public class OperatorLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    private Date createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
