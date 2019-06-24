/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschoolproject;

import java.util.Scanner;

/**
 *
 * @author Mr.Celosia
 */
public class MySchoolProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int first;
    boolean first1 = true;
    do{
        System.out.println("PRESS :");
        System.out.println("[1]-Registration");
        System.out.println("[2]-SHOW INFO");
        System.out.println("[0]-EXIT");
        System.out.print("-> :");
        first=sc.nextInt();
        switch(first){
            case 1:
                boolean bool=true;
                do{
                System.out.println("REGISTRATION MENU");
                System.out.println("PRESS:");
                System.out.println("[1]-CREATE STUDENT");
                System.out.println("[2]-CREATE ASSIGNMENT");
                System.out.println("[3]-CREATE TRAINER");
                System.out.println("[0]-EXIT");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        ListesClass.createStudent();
                        break;
                    case 2:
                        ListesClass.createAssignments();
                        break;
                    case 3:
                        ListesClass.createTrainers();
                        break;
                    case 0:
                        System.out.println(" back to menu...");
                        bool =false;
                        break;
                    default :
                        System.out.println(" invalid option");
                        break;
                }
                }while(bool);
                break;
            case 2:
                boolean bool1 = true;
            do{
                System.out.println("INFORMATION SYSTEM");
                System.out.println("PRES :");
                System.out.println("[1]ALL STUDENTS");
                System.out.println("[2]ALL COURSES");
                System.out.println("[3]ALL TRAINERS");
                System.out.println("[4]ALL ASSIGNMENTS");
                System.out.println("[5]ALL STUDENTS PER COURSE");
                System.out.println("[6]ALL TRAINERS PER COURSE");
                System.out.println("[7]ALL ASSIGNMENTS PER COURSE");
                System.out.println("[8]ALL ASSIGNMENTS PER STUDENT");
                System.out.println("[9]STUDENTS WITH MORE THAN ONE COURSES");
                System.out.println("[0]Back to menu");
                System.out.print("-> :");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        ListesClass.printAllStudents();
                        break;
                    case 2:
                        ListesClass.printAllCourses();
                        break;
                    case 3:
                        ListesClass.printAllTrainers();
                        break;
                    case 4:
                        ListesClass.printAllAssignments();
                        break;
                    case 5:
                        ListesClass.printJavaFullTime();
                        ListesClass.printJavaPartTime();
                        ListesClass.printCfullTime();
                        ListesClass.printCpartTime();
                        break;
                    case 6:
                        ListesClass.printTrainersForJavaFull();
                        ListesClass.printTrainersForCPart();
                        ListesClass.printTrainersForCFull();
                        ListesClass.printTrainersForCPart();
                        break;
                    case 7:
                        ListesClass.printJavaFullTimeAsses();
                        ListesClass.printJavaPartTimeAsses();
                        ListesClass.printCFullTimeAsses();
                        ListesClass.printCpartTime();
                        break;
                    case 8:
                        ListesClass.printAssPerStudents();
                        break;                        
                    case 9:
                        ListesClass.printStudentWithMoreThanOneCourses();
                        break;
                    case 0:
                        System.out.println("back to menu");
                        bool1=false;
                        break;
                        
                    default:
                        System.out.println("invalid option");
                         break;   
                }
            }while(bool1);
                break;
          
            case 0:
                System.out.println("Exit...");
                first1=false;
                break;
            default :
                System.out.println("invalid");
                break;
        }
    }while(first1);
        
    }
}

