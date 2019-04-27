package com.rc.mvc.controller;

import com.rc.mvc.model.Course;
import com.rc.mvc.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName CourseController
 * @Description CourseController class
 * @Author liux
 * @Date 19-4-26 下午5:25
 * @Version 1.0
 */
@Controller
@RequestMapping("courses")
public class CourseController {

    private static Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    public CourseService courseService;

    @Autowired
    ApplicationContext applicationContext;


    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewCourse(@RequestParam("courseId") Integer courseId, Model model) {
        System.out.println("--------------------------");
        logger.debug("In viewCourse,courseId={}", courseId);
//        logger.info("##################### " + applicationContext.hashCode());
        Course course = courseService.getCourseById(courseId);
        model.addAttribute(course);
        return "course_overview";
    }

    @RequestMapping("/view2/{courseId}")
    public String viewCourse2(@PathVariable("courseId") Integer courseId,
                              Map<String, Object> model) {

        logger.debug("In viewCourse2, courseId = {}", courseId);
        Course course = courseService.getCourseById(courseId);
        model.put("course", course);
        return "course_overview";
    }

    @RequestMapping("/view3")
    public String viewCourse3(HttpServletRequest request) {

        Integer courseId = Integer.valueOf(request.getParameter("courseId"));
        logger.debug("In viewCourse3, courseId = {}", courseId);
        Course course = courseService.getCourseById(courseId);
        request.setAttribute("course", course);

        return "course_overview";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET, params = "add")
    public String createCourse() {
        return "course_admin/edit";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String doSave(@ModelAttribute Course course) {
        logger.debug("Info of Course:");
//        logger.debug(ReflectionToStringBuilder.toString(course));
        logger.debug(course.toString());

        //在此进行业务操作，比如数据库持久化
        course.setCourseId(123);
        return "redirect:view2/" + course.getCourseId();
    }

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String showUploadPage(@RequestParam(value = "multi", required = false) Boolean multi) {
        if (multi != null && multi) {
            return "course_admin/multifile";
        }
        return "course_admin/file";
    }

    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
    public String doUploadFile(@RequestParam("file") MultipartFile file) throws IOException {

        if (!file.isEmpty()) {
            logger.debug("Process file: {}", file.getOriginalFilename());
            file.transferTo(new File("/home/liux/test/", System.currentTimeMillis() + file.getOriginalFilename()));
        }

        return "success";
    }

    @RequestMapping(value = "/doUpload2", method = RequestMethod.POST)
    public String doUploadFile2(MultipartHttpServletRequest multiRequest) throws IOException {
        /*for (Iterator<String> it = multiRequest.getFileNames(); it.hasNext(); ) {
            String fileName = it.next();
            MultipartFile file = multiRequest.getFile(fileName);
            if (null != file && !file.isEmpty()) {
                logger.debug("Process file: {}", file.getOriginalFilename());
//                FileUtils.copyInputStreamToFile(file.getInputStream(), new File("c:\\temp\\imooc\\", System.currentTimeMillis() + file.getOriginalFilename()));
                FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(new File("/home/liux/test/", System.currentTimeMillis() + file.getOriginalFilename())));
            }
        }*/

        multiRequest.getFileNames().forEachRemaining(temp -> {
            MultipartFile file = multiRequest.getFile(temp);
            if (null != file && !file.isEmpty()) {
                logger.debug("Process file: {}", file.getOriginalFilename());
                try {
                    file.transferTo(new File("/home/liux/test/", System.currentTimeMillis() + file.getOriginalFilename()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        return "success";
    }

    @RequestMapping(value = "/{courseId}", method = RequestMethod.GET)
    public @ResponseBody
    Course getCourseInJson(@PathVariable Integer courseId) {
        return courseService.getCourseById(courseId);
    }


    @RequestMapping(value = "/jsontype/{courseId}", method = RequestMethod.GET)
    public ResponseEntity<Course> getCourseInJson2(@PathVariable Integer courseId) {
        Course course = courseService.getCourseById(courseId);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }
}