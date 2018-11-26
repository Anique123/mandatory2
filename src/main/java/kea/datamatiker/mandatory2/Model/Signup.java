package kea.datamatiker.mandatory2.Model;

import javax.persistence.*;

@Entity
public class Signup extends Course {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String name;

    @OneToOne
    private Course course;

    public Signup(){

    }

    public Signup(Long id, String name){
        this.id = id;
        this.name = name;

    }

    public Signup(Long id, String name, Course course){
        this.id = id;
        this.name = name;
        this.course = course;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
