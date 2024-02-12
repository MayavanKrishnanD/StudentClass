package io.springboot.myclass.service;

import io.springboot.myclass.model.Student;
import io.springboot.myclass.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

@Service
public class StudentService {
    private static final Logger logger=Logger.getLogger("studentService");

    @Autowired
    private  StudentRepository repository ;

    @Autowired
    private Environment env;


    public  Student saveStudent(Student student) {
        logger.info(" student method start");

        Properties properties = new Properties();
        try  {
            // Read a specific property
            String propertyValue = properties.getProperty("server.port");
            logger.info("Value of server.port: " + propertyValue);
        } catch (Exception e) {
            logger.info("Error reading properties file: " + env);
        }
        return	repository.save(student);
    }
    public List<Student> getStudent(){
        logger.info(" allstudent method start");
        Properties properties = new Properties();
        try  {
            // Read a specific property
            String propertyValue = properties.getProperty("spring.datasource.username");
            logger.info("Value of spring.datasource.username: " + propertyValue);
        } catch (Exception e) {
            logger.info("Error reading properties file: " + env);
        }
        return  repository.findAll();
    }
}