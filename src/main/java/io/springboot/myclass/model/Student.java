package io.springboot.myclass.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "student_db")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "Student_id ")


    private Long id;
    @Column(name = "Student_name  ")
    private String name;

}
