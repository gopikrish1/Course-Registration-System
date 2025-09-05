package com.example.Course.Registration.System.Controller;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;


    @GetMapping("/courses")
    public List<Course> availableCourses() {
        return courseService.availableCourses();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledStudents() {
        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String registerCourse(@RequestParam("name") String name,
                                 @RequestParam("courseName") String courseName,
                                 @RequestParam("emailId") String email) {
        courseService.registerCourse(new CourseRegistry(name,email,courseName));
        return "Congratulations! "+name+", your enrollment has been successfully registered for the course "+courseName;
    }
}
