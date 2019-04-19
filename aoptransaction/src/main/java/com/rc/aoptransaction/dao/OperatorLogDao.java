package com.rc.aoptransaction.dao;

import com.rc.aoptransaction.domain.OperatorLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName OperatorLogDao
 * @Description 操作日志持久化类
 * @Author liux
 * @Date 19-4-18 上午9:46
 * @Version 1.0
 */
public interface OperatorLogDao extends JpaRepository<OperatorLog, Long> {
}