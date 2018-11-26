package kea.datamatiker.mandatory2.Model;

import javax.persistence.*;

@Entity
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long applicationId;
    private String name;

    @OneToOne
    private Course course;


    public Signup(){

    }

    public Signup(Long applicationId, String name){
        this.name = name;

    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
