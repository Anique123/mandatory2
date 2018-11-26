package kea.datamatiker.mandatory2.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String nameInDanish;
    private String nameInEnglish;
    private String studyProgramme;
    private String courseType;
    private Integer ects;
    private String courseLanguage;
    private String minNoOfStudenst;
    private String expectedNoOfStudents;
    private String maxNoOfStudents;
    private String prereuisitues;
    private String learningOutcome;
    private String content;
    private String learningActivities;
    private String examForm;
    private String[] teachers;
    private String signUpToCourse;

    public Course(Long id,String nameInDanish, String nameInEnglish, String studyProgramme, String courseType, Integer ects, String courseLanguage, String minNoOfStudenst, String expectedNoOfStudents, String maxNoOfStudents, String prereuisitues, String learningOutcome, String content, String learningActivities, String examForm, String[] teachers) {
        this.id=id;
        this.nameInDanish = nameInDanish;
        this.nameInEnglish = nameInEnglish;
        this.studyProgramme = studyProgramme;
        this.courseType = courseType;
        this.ects = ects;
        this.courseLanguage = courseLanguage;
        this.minNoOfStudenst = minNoOfStudenst;
        this.expectedNoOfStudents = expectedNoOfStudents;
        this.maxNoOfStudents = maxNoOfStudents;
        this.prereuisitues = prereuisitues;
        this.learningOutcome = learningOutcome;
        this.content = content;
        this.learningActivities = learningActivities;
        this.examForm = examForm;
        this.teachers = teachers;
    }

    public Course(){

    }

    public Course(String nameInDanish, String nameInEnglish){

    }
    public String getNameInDanish() {
        return nameInDanish;
    }

    public void setNameInDanish(String nameInDanish) {
        this.nameInDanish = nameInDanish;
    }

    public String getNameInEnglish() {
        return nameInEnglish;
    }

    public void setNameInEnglish(String nameInEnglish) {
        this.nameInEnglish = nameInEnglish;
    }

    public String getStudyProgramme() {
        return studyProgramme;
    }

    public void setStudyProgramme(String studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public String getMinNoOfStudenst() {
        return minNoOfStudenst;
    }

    public void setMinNoOfStudenst(String minNoOfStudenst) {
        this.minNoOfStudenst = minNoOfStudenst;
    }

    public String getExpectedNoOfStudents() {
        return expectedNoOfStudents;
    }

    public void setExpectedNoOfStudents(String expectedNoOfStudents) {
        this.expectedNoOfStudents = expectedNoOfStudents;
    }

    public String getMaxNoOfStudents() {
        return maxNoOfStudents;
    }

    public void setMaxNoOfStudents(String maxNoOfStudents) {
        this.maxNoOfStudents = maxNoOfStudents;
    }

    public String getPrereuisitues() {
        return prereuisitues;
    }

    public void setPrereuisitues(String prereuisitues) {
        this.prereuisitues = prereuisitues;
    }

    public String getLearningOutcome() {
        return learningOutcome;
    }

    public void setLearningOutcome(String learningOutcome) {
        this.learningOutcome = learningOutcome;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLearningActivities() {
        return learningActivities;
    }

    public void setLearningActivities(String learningActivities) {
        this.learningActivities = learningActivities;
    }

    public String getExamForm() {
        return examForm;
    }

    public void setExamForm(String examForm) {
        this.examForm = examForm;
    }

    public String[] getTeachers() {
        return teachers;
    }

    public void setTeachers(String[] teachers) {
        this.teachers = teachers;
    }
}
