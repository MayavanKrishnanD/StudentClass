package io.springboot.myclass.controller;
import io.springboot.myclass.model.Student;
import io.springboot.myclass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/studentReg")
public class StudentController {
    private static final Logger logger = Logger.getLogger("StudentController");

    @Autowired
    private  StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/AddStudent")
    public  Student  addStudent(@RequestBody Student student) {
        logger.info(" addStudent method start");
        return studentService.saveStudent(student);

    }
    @GetMapping("/GetStudent")
    public List<Student> findAllStudent(){
        logger.info(" findAllStudent  method start");
        return studentService.getStudents();
    }
}
