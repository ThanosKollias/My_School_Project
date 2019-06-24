/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschoolproject;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mr.Celosia
 */
public class Student {
    
    //PROPERTIES   
    private String firstName, lastName, dateOfBirth;
    private double tuitionFees;
//    private Course course;
    private ArrayList<Course> studentsCourses = new ArrayList<>();
   

//EMPTY CONSTRUCTOR
    public Student() {
    }

    //SIMPLE CONSTRUCTOR, NO COURSE IN PARAMETERS
    public Student(String firstName, String lastName, String dateOfBirth, double tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    
    //FULL PARAMETER CONSTRUCTOR
    public Student(String firstName, String lastName, String dateOfBirth, double tuitionFees, ArrayList<Course> studentsCourses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        this.studentsCourses = studentsCourses;
    }

    // GETTERS AND SETTERS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public ArrayList<Course> getCourses() {
        return studentsCourses;
    }

    public void setCourses(ArrayList<Course> studentsCourses) {
        this.studentsCourses = studentsCourses;
    }

 



    
}
