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
public class Trainer {
    
    //PROPERTIES   
    private String firstName, lastName, subject;
    private ArrayList<Course> courses = new ArrayList<>();

   //EMPTY CONSTRUCTOR
    public Trainer(){
    }

    //SIMPLE CONSTRUCTOR, NO COURSE IN PARAMETERS

    public Trainer(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }


    //FULL PARAMETER CONSTRUCTOR
public Trainer(String firstName, String lastName, String subject, ArrayList<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.courses = courses;
    }

    //GETTERS AND SETTERS
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }



    @Override
    public String toString() {
        return "name :" + getFirstName() + " last name :" +getLastName() 
                +" subject :" +getSubject();
    }

 
    
    
    
}
