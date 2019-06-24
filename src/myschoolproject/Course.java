/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschoolproject;

/**
 *
 * @author Mr.Celosia
 */
public class Course {
    
    //PROPERTIES
    private String title, stream, type, startDate, endDate;
    private Student student;
    

    // EMPTY CONSTRUCTOR
    public Course() {
    }

    //SIMPLE PARAMETER CONSTRUCTOR
    public Course(String title, String stream, String type, String startDate, String endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // FULL PARAMETER CONSTRUCTOR + STUDENT studet
    public Course(String title, String stream, String type, String startDate, String endDate, Student student) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.student = student;
    }
    

    // GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    

    
   
}
