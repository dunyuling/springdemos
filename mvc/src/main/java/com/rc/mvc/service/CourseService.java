package com.rc.mvc.service;

import com.rc.mvc.model.Course;
import org.springframework.stereotype.Service;

/**
 * @ClassName CourseService
 * @Description CourseService interface
 * @Author liux
 * @Date 19-4-26 下午5:18
 * @Version 1.0
 */
@Service
public interface CourseService {
    Course getCourseById(Integer courseId);
}
