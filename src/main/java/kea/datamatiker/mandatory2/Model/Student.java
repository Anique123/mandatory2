package kea.datamatiker.mandatory2.Model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String name;
    private String surName;
    private String[] courses;

    @OneToOne
    private Login login;


    public Student(String name, String surName, Login login) {
        this.name = name;
        this.surName = surName;
        this.login = login;
    }

}
