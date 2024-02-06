package io.springboot.myclass.service;

import io.springboot.myclass.model.Student;
import io.springboot.myclass.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class StudentService {
    private static final Logger logger=Logger.getLogger("studentService");

    @Autowired
    private  StudentRepository repository ;

    public  Student saveStudent(Student student) {
        logger.info(" student method start");
        return	repository.save(student);
    }
    public List<Student> getStudent(){
        logger.info(" allstudent method start");
        return  repository.findAll();
    }
}
