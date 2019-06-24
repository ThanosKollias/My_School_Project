/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschoolproject;

import java.util.ArrayList;

/**
 *
 * @author Mr.Celosia
 */
public class Assignment {
    
    //PROPERTIES   
    private String title;
    private String description;
    private String submitDate;
    private String oralMark;
    private String totalMark;
    private ArrayList<Course> course = new ArrayList<>();
    private ArrayList<Student> student = new ArrayList<>();

    //EMPTY CONSTRUCTOR
    public Assignment() {
    }

    //SIMPLE CONSTRUCTOR
    public Assignment(String title, String description, String submitDate, String oralMark, String totalMark) {
        this.title = title;
        this.description = description;
        this.submitDate = submitDate;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    //FULL CONSTRUCTOR WITH ALL PROPERTIES + STUDENT + COURSE
    public Assignment(String title, String description, String submitDate, String oralMark, String totalMark, ArrayList<Course> course, ArrayList<Student> student) {
        this.title = title;
        this.description = description;
        this.submitDate = submitDate;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
        this.course = course;
        this.student = student;
    }
    
   

    // GETTERS AND SETTERS 
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }

    public String getOralMark() {
        return oralMark;
    }

    public void setOralMark(String oralMark) {
        this.oralMark = oralMark;
    }

    public String getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(String totalMark) {
        this.totalMark = totalMark;
    }

    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    

    

 
    
    
}