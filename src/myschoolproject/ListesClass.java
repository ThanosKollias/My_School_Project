/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschoolproject;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Mr.Celosia
 */
public class ListesClass {

    public static ArrayList<Student> listOfAllStudents = new ArrayList<>();
    public static ArrayList<Course> listOfAllCourses = new ArrayList<>();
    public static ArrayList<Trainer> listOfAllTrainers = new ArrayList<>();
    public static ArrayList<Assignment> listOfAllAssignments = new ArrayList<>();
    public static ArrayList<Student> listOfStudentsWithCourse = new ArrayList<>();
    public static ArrayList<Student> javaFullTimeStudents = new ArrayList<>();
    public static ArrayList<Student> javaPartTimeStudents = new ArrayList<>();
    public static ArrayList<Student> CFullTimeStudents = new ArrayList<>();
    public static ArrayList<Student> CPartTimeStudents = new ArrayList<>();
    public static ArrayList<Trainer> javaFullTimeTrainers = new ArrayList<>();
    public static ArrayList<Trainer> javaPartTimeTrainers = new ArrayList<>();
    public static ArrayList<Trainer> CFullTimeTrainers = new ArrayList<>();
    public static ArrayList<Trainer> CPartTimeTrainers = new ArrayList<>();
    public static ArrayList<Assignment> assPerCourse = new ArrayList<>();
    public static ArrayList<Assignment> assPerStudent = new ArrayList<>();
    public static ArrayList<Assignment> javaFulltimeAssignments = new ArrayList<>();
    public static ArrayList<Assignment> javaParttimeAssignments = new ArrayList<>();
    public static ArrayList<Assignment> cFulltimeAssignments = new ArrayList<>();
    public static ArrayList<Assignment> cParttimeAssignments = new ArrayList<>();
    public static ArrayList<AssPerStudent> assesPerStudents = new ArrayList<>();
//    public static ArrayList<AssPerStudent> ListaMeStudentsWithMoreThanOneCourses = new ArrayList<>();
//    public HashMap<Student, ArrayList<Assignment>> assesPerStudent = new HashMap<Student, ArrayList<Assignment>>();
    

    // LOCKED CONSTRUCTOR/ OBJECT MUST BE INITIALIZED WITHIN THE CLASS
    private ListesClass() {
    }

    public static void createStudent() {
        Course cr = new Course("Java", "java", "full time", "12/12/2019", "12/12/2020");
        Course cr1 = new Course("Java", "java", "part time", "12/12/2019", "12/12/2020");
        Course cr2 = new Course("C#", "C#", "full time", "12/12/2019", "12/12/2020");
        Course cr3 = new Course("C#", "C#", "part time", "12/12/2019", "12/12/2020");
        listOfAllCourses.add(cr);
        listOfAllCourses.add(cr1);
        listOfAllCourses.add(cr2);
        listOfAllCourses.add(cr3);
        
        System.out.println("Student creation procedure");
        System.out.println("__________________________");
        Scanner sc = new Scanner (System.in);
        
        Boolean optionChoice = true;
        while(optionChoice){
            System.out.println("Student Registration form");
            System.out.println("--------------------------");
            System.out.print("Name: ");
            String t1 = sc.nextLine();
            System.out.print("Surname: ");
            String t2 = sc.nextLine();
            System.out.print("Date of Birth(DD/MM/YYYY): ");
            String t3 = sc.nextLine();
            System.out.print("Tuiotion fees: ");
            double t4 =(int) sc.nextInt();
            Student s1 = new Student(t1, t2, t3, t4);
            listOfAllStudents.add(s1);
        

            System.out.println(" * * * ");
            System.out.println("Add students to a course procedure");
                for(int i =0; i<listOfAllStudents.size(); i++){
                    System.out.println("Add student : < " + listOfAllStudents.get(i).getFirstName() + " " + listOfAllStudents.get(i).getLastName() +
                       " > to a course" + "\n" );

                 
                    boolean exitchoise = true;
                    while(exitchoise){           
                            System.out.println("Press [1] for java full time" + "\n" +
                                               "Press [2] for java part time" + "\n" +
                                               "Press [3] for C# full time" + "\n" +
                                               "Press [4] for C# part time" + "\n" +
                                               "Press [0] EXIT");
               
                            System.out.print("Type your choise :");
                            int choice = sc.nextInt();
                            switch(choice){
                                case 1:
                                    s1.getCourses().add(cr);
                                    javaFullTimeStudents.add(s1);
                                    break;
                                case 2:
                                    s1.getCourses().add(cr1);
                                    javaPartTimeStudents.add(s1);
                                    break;
                                case 3:
                                    s1.getCourses().add(cr2);
                                    CFullTimeStudents.add(s1);
                                    break;
                                case 4:
                                    s1.getCourses().add(cr3);
                                    CPartTimeStudents.add(s1);
                                    break;
                                case 0:
                                        System.out.println("");
                                        System.out.println("Thank you for your registration ");
                                        exitchoise = false;
                                        break;
                                default:
                                      System.out.println("invalid option");  
                                      break;
                                     
                            }
                                
                    }
                 
            System.out.println("");
            System.out.println("Student(s) has been added Course ");
            System.out.println("Press[1]to continue [0]exit");

                    }
//            sc.nextLine();

                if(sc.nextInt()==0){
                    System.out.println("You exit the create student procedure");
                    optionChoice=false;
                }
                sc.nextLine();
        }
    }
             
    
    public static void printAllStudents() {
        System.out.println("This is the list with all our students :) ");
            for(Student s : listOfAllStudents){
                System.out.println( "Name         : " + s.getFirstName() +"\n" +
                                    "Surname      : " + s.getLastName() + "\n" +
                                    "Date of Birth: " + s.getDateOfBirth() +"\n" +
                                    "Tuition fees : " + s.getTuitionFees() + "$");
                System.out.println(" * * *");
        }   
    }
    
    public static void printJavaFullTime(){
        System.out.println("JAVA FULL TIME has the following students");
        for(Student s : javaFullTimeStudents){
            
            System.out.println( "Name         : " + s.getFirstName() +"\n" +
                                "Surname      : " + s.getLastName() + "\n" +
                                "Date of Birth: " + s.getDateOfBirth() +"\n");
            System.out.println(" * * *");
        }
    }
    
    public static void printJavaPartTime(){
        System.out.println("JAVA PART TIME has the following students");
        for(Student s : javaPartTimeStudents){
            
            System.out.println( "Name         : " + s.getFirstName() +"\n" +
                                "Surname      : " + s.getLastName() + "\n" +
                                "Date of Birth: " + s.getDateOfBirth() +"\n");
            System.out.println(" * * *");
        }
    }
    public static void printCfullTime(){
        System.out.println("C# FULL TIME has the following students");
        for(Student s : CFullTimeStudents){
            
            System.out.println( "Name         : " + s.getFirstName() +"\n" +
                                "Surname      : " + s.getLastName() + "\n" +
                                "Date of Birth: " + s.getDateOfBirth() +"\n");
            System.out.println(" * * *");
        }
    }
    public static void printCpartTime(){
        System.out.println("C# PART TIME has the following students");
        for(Student s : CPartTimeStudents){
            
            System.out.println( "Name         : " + s.getFirstName() +"\n" +
                                "Surname      : " + s.getLastName() + "\n" +
                                "Date of Birth: " + s.getDateOfBirth() +"\n");
            System.out.println(" * * *");
        }
    }
    
    public static void createTrainers() { 
        Course cr = new Course("Java", "java", "full time", "12/12/2019", "12/12/2020");
        Course cr1 = new Course("Java", "java", "part time", "12/12/2019", "12/12/2020");
        Course cr2 = new Course("C#", "C#", "full time", "12/12/2019", "12/12/2020");
        Course cr3 = new Course("C#", "C#", "part time", "12/12/2019", "12/12/2020");
        
        
        System.out.println("Trainer creation procedure");
        System.out.println("__________________________");
        Scanner sc = new Scanner (System.in);
        
        Boolean optionChoice = true;
        while(optionChoice){
            System.out.println("Trainer Registration form");
            System.out.println("--------------------------");
            System.out.print("Name: ");
            String t1 = sc.nextLine();
            System.out.print("Surname: ");
            String t2 = sc.nextLine();
            System.out.print("Subject: ");
            String t3 = sc.nextLine();
            
            Trainer tr1 = new Trainer(t1,t2,t3);
            listOfAllTrainers.add(tr1);

            System.out.println(" * * * ");
            System.out.println("Add trainers to a course procedure");
                for(int i =0; i<listOfAllTrainers.size(); i++){
                    System.out.println("Add trainer : < " + listOfAllTrainers.get(i).getFirstName() + " " + listOfAllTrainers.get(i).getLastName() +
                       " > to a course" + "\n" );

                 
                    boolean exitchoise = true;
                    while(exitchoise){           
                            System.out.println("Press [1] for java full time" + "\n" +
                                               "Press [2] for java part time" + "\n" +
                                               "Press [3] for C# full time" + "\n" +
                                               "Press [4] for C# part time" + "\n" +
                                               "Press [0] EXIT");
               
                            System.out.print("Type your choise :");
                            int choice = sc.nextInt();
                            switch(choice){
                                case 1:                                    
                                    tr1.getCourses().add(cr);                     
                                    javaFullTimeTrainers.add(tr1);                 
                                    break;                                          
                                case 2:
                                    tr1.getCourses().add(cr1);
                                    javaPartTimeTrainers.add(tr1);
                                    break;
                                case 3:
                                    tr1.getCourses().add(cr2);
                                    CFullTimeTrainers.add(tr1);
                                    break;
                                case 4:
                                    tr1.getCourses().add(cr3);
                                    CPartTimeTrainers.add(tr1);
                                    break;
                                case 0:
                                        System.out.println("");
                                        System.out.println("Thank you for your registration ");
                                        exitchoise = false;
                                        break;
                                default:
                                      System.out.println("invalid option");      
                                      break;
                                     
                            }
                                
                    }
                 
            System.out.println("");
            System.out.println("Trainer has been added Course ");
            System.out.println("Press[1]to continue [0]exit");

                    }
//            sc.nextLine();

                if(sc.nextInt()==0){
                    System.out.println("You exit the create trainer procedure");
                    optionChoice=false;
                }
                sc.nextLine();
        }
    }
        

    
    
    
    
    
    
    
    public static void printAllTrainers() {
        System.out.println("This is the list with all our trainers :) ");
        for(Trainer t : listOfAllTrainers){
            System.out.println("Name    : " + t.getFirstName() +"\n" +
                               "Surname : " + t.getLastName() + "\n" +
                               "Subject : " + t.getSubject()+"\n");
            System.out.println(" * * *");
        }
    }
    
    public static void printTrainersForJavaFull(){
        System.out.println("JAVA FULL TIME has the following trainers");
        for(Trainer trz : javaFullTimeTrainers){
            
            System.out.println( "Name         : " + trz.getFirstName() +"\n" +
                                "Surname      : " + trz.getLastName() + "\n" );                                
            System.out.println(" * * *");
        }
    }
    
    public static void printTrainersForJavaPart(){
        System.out.println("JAVA PART TIME has the following students");
        for(Trainer trz : javaPartTimeTrainers){
            
            System.out.println( "Name         : " + trz.getFirstName() +"\n" +
                                "Surname      : " + trz.getLastName() + "\n" );                                
            System.out.println(" * * *");
        }
    }
    
    public static void printTrainersForCFull(){
        System.out.println("C# FULL TIME has the following students");
        for(Trainer trz : CFullTimeTrainers){
            
            System.out.println( "Name         : " + trz.getFirstName() +"\n" +
                                "Surname      : " + trz.getLastName() + "\n" );                                
            System.out.println(" * * *");
        }
    }
    public static void printTrainersForCPart(){
        System.out.println("C# PART TIME has the following students");
        for(Trainer trz : CPartTimeTrainers){
            
            System.out.println( "Name         : " + trz.getFirstName() +"\n" +
                                "Surname      : " + trz.getLastName() + "\n" );                                
            System.out.println(" * * *");
        }
    }

    public static void createCourse() { //toDo  fix method to loop more than once
        
        System.out.println(" Course creation procedure");
        System.out.println("__________________________");
        Scanner sc = new Scanner(System.in);
        
        boolean bool = true;
        
        System.out.println("Course Registration form");
        System.out.println("------------------------");
        while (bool){
            System.out.println("[1]to create course [0]Exit");
            String choice = sc.nextLine();
            if(choice.equals("1")){
        System.out.print("Title: ");
        String t1 = sc.nextLine();
        System.out.print("Stream (Java / C#): ");
        String t2 = sc.nextLine();
        System.out.print("Type (Full/Part time): ");
        String t3 = sc.nextLine();
        System.out.print("Start Date (DD/MM/YYYY): ");
        String t4 = sc.nextLine();
        System.out.print("End Date (DD/MM/YYYY): ");
        String t5 = sc.nextLine();
        
        Course cr = new Course(t1, t2, t3, t4, t5);
        listOfAllCourses.add(cr);
        
        System.out.println("Course(s) has been added to the system.");
        System.out.println("");
            }else if(choice.equals("0")){
                System.out.println("Thank you for your registration");
                bool=false; ////////////////////////////////////////////////////////////////////////////////////////////////////////
            }else{
                System.out.println(" invalid option ...");
            }
    }
    }
    public static void printAllCourses() {
        System.out.println("This is the list with all our courses :) ");
        for(Course c : listOfAllCourses){
            System.out.println("Title     : " + c.getTitle()+"\n" +
                               "Stream    : " + c.getStream()+"\n" +
                               "Type      : " + c.getType() +"\n" +
                               "Start Date: " + c.getStartDate()+"\n" +
                               "End Date  : " + c.getEndDate() + "\n" );
            System.out.println(" * * *");
        }

    }

    public static void createAssignments() {
        Course cr = new Course("Java", "java", "full time", "12/12/2019", "12/12/2020");
        Course cr1 = new Course("Java", "java", "part time", "12/12/2019", "12/12/2020");
        Course cr2 = new Course("C#", "C#", "full time", "12/12/2019", "12/12/2020");
        Course cr3 = new Course("C#", "C#", "part time", "12/12/2019", "12/12/2020");
        System.out.println("Assignment creation procedure");
        System.out.println("__________________________");
        Scanner sc = new Scanner (System.in);
        
        Boolean optionChoice = true;
        while(optionChoice){
            System.out.println("Assignment Registration form");
            System.out.println("--------------------------");
            System.out.print("Title: ");
            String t1 = sc.nextLine();
            System.out.print("Description: ");
            String t2 = sc.nextLine();
            System.out.print("Submit Date (DD/MM/YYYY): ");
            String t3 = sc.nextLine();
            System.out.print("Oral Mark :");
            String t4 = sc.nextLine();
            System.out.print("Total Mark :");
            String t5 = sc.nextLine();
            
            Assignment ass1 = new Assignment(t1,t2,t3,t4,t5);
            listOfAllAssignments.add(ass1);

            System.out.println(" * * * ");
            System.out.println("Add Assgnment to a course procedure");
                for(int i =0; i<listOfAllAssignments.size(); i++){
                    System.out.println("Add assignment : < " + listOfAllAssignments.get(i).getTitle()+ " " + listOfAllAssignments.get(i).getDescription()+
                       " > to a course" + "\n" );

                 //edw 3ekinaw na louzw
                    boolean exitchoise = true;
                    while(exitchoise){           
                            System.out.println("Press [1] for java full time" + "\n" +
                                               "Press [2] for java part time" + "\n" +
                                               "Press [3] for C# full time" + "\n" +
                                               "Press [4] for C# part time" + "\n" +
                                               "Press [0] EXIT");
               
                            System.out.print("Type your choice :");
                            int choice = sc.nextInt();
                            switch(choice){
                                case 1:                                    
                                    ass1.getCourse().add(cr);
                                    javaFulltimeAssignments.add(ass1);
                                    break;                                          
                                case 2:
                                    ass1.getCourse().add(cr1);
                                    javaParttimeAssignments.add(ass1);
                                    break;
                                case 3:
                                    ass1.getCourse().add(cr2);
                                    cFulltimeAssignments.add(ass1);
                                    break;
                                case 4:
                                    ass1.getCourse().add(cr3);
                                    cParttimeAssignments.add(ass1);
                                    break;
                                case 0:
                                        System.out.println("");
                                        System.out.println("Thank you for your registration ");
                                        exitchoise = false;
                                        break;
                                default:
                                      System.out.println("invalid option");      
                                      break;
                                     
                            }
                                
                    }
                 
            System.out.println("");
            System.out.println("Assignment has been added Course ");
            System.out.println("Press[1]to continue [0]exit");

                    }
//            sc.nextLine();

                if(sc.nextInt()==0){
                    System.out.println("You exit the create Assignment procedure");
                    optionChoice=false;
                }
                sc.nextLine();
        }
    
    }

       public static void printAllAssignments(){
           System.out.println("This is the list with all the assignments ");
           for(Assignment ass : listOfAllAssignments){
               System.out.println("Title       : " + ass.getTitle() +"\n" +
                                  "Description : " + ass.getDescription() +"\n" +
                                  "Submit Date : " + ass.getSubmitDate() +"\n" +
                                  "Oral Date   : " + ass.getOralMark()  +"\n" +
                                  "Total Date  : " + ass.getTotalMark() + "\n");
               System.out.println(" * * *");
           }
       }
       
       
       public static void printJavaFullTimeAsses(){
           System.out.println("JAVA FULL TIME has the following assignments");
        for(Assignment ass : javaFulltimeAssignments){
            
            System.out.println( "Title        : " + ass.getTitle() +"\n" +
                                "Description  : " + ass.getTitle() + "\n" +                                
                                "Submit Date  : " + ass.getSubmitDate() + "\n" +
                                "Oral Mark    : " + ass.getOralMark()+ "\n" +
                                "Total Mark    : " + ass.getTotalMark()+ "\n" 
                                    );                                
            System.out.println(" * * *");
        }
           
       }
       
       public static void printJavaPartTimeAsses(){
           System.out.println("JAVA PART TIME has the following assignments");
        for(Assignment ass : javaParttimeAssignments){
            
            System.out.println( "Title        : " + ass.getTitle() +"\n" +
                                "Description  : " + ass.getTitle() + "\n" +                                
                                "Submit Date  : " + ass.getSubmitDate() + "\n" +
                                "Oral Mark    : " + ass.getOralMark()+ "\n" +
                                "Total Mark    : " + ass.getTotalMark()+ "\n" 
                                    );                                
            System.out.println(" * * *");
        }
           
       }
public static void printCFullTimeAsses(){
           System.out.println("C# FULL TIME has the following assignments");
        for(Assignment ass : javaFulltimeAssignments){
            
            System.out.println( "Title        : " + ass.getTitle() +"\n" +
                                "Description  : " + ass.getTitle() + "\n" +                                
                                "Submit Date  : " + ass.getSubmitDate() + "\n" +
                                "Oral Mark    : " + ass.getOralMark()+ "\n" +
                                "Total Mark    : " + ass.getTotalMark()+ "\n" 
                                    );                                
            System.out.println(" * * *");
        }
           
       }
public static void printCPartTimeAsses(){
           System.out.println("C# PART TIME has the following assignments");
        for(Assignment ass : cParttimeAssignments){
            
            System.out.println( "Title        : " + ass.getTitle() +"\n" +
                                "Description  : " + ass.getTitle() + "\n" +                                
                                "Submit Date  : " + ass.getSubmitDate() + "\n" +
                                "Oral Mark    : " + ass.getOralMark()+ "\n" +
                                "Total Mark    : " + ass.getTotalMark()+ "\n" 
                                    );                                
            System.out.println(" * * *");
        }
           
       }

       public static void addAssToStudent(){
           System.out.println("Add an assignment to a Student");
           System.out.println("______________________________");
       
           Scanner sc = new Scanner(System.in);
           
           boolean keepGoing = true;
           while(keepGoing){
           for(int i=0; i<listOfAllStudents.size(); i++){
               System.out.println("Do u wanna add the Assignment :" );
               for(int j=0; j<listOfAllAssignments.size(); j++){
                   System.out.println("Title : " + listOfAllAssignments.get(j).getTitle());
                   System.out.println("Description : " + listOfAllAssignments.get(j).getDescription());
               
               System.out.println("To student : " + listOfAllStudents.get(i).getFirstName() + " " + listOfAllStudents.get(i).getLastName() + " ??");
               System.out.println("press [1]Yes [0]Exit");
                String choice=sc.nextLine();
                if(choice.equals("1")){
                  AssPerStudent aps = new AssPerStudent();
                   aps.setStudent(listOfAllStudents.get(i));
                   aps.getStudentsAssignments().add(listOfAllAssignments.get(j));
                   assesPerStudents.add(aps);
                   System.out.println("assignment has been addes to student !");
               }else if(choice.equals("0")){
                   System.out.println("thank you for your registration :)");
                   keepGoing=false;
               }else
                       System.out.println("invalid");
               }
                
               }
           }
            
             
        }
               
       public static void printAssPerStudents(){
           for(AssPerStudent spc : assesPerStudents){
               System.out.println( "Student      : " + spc.getStudent().getFirstName() + " " + 
                       spc.getStudent().getLastName());
               System.out.println("has the assignments");
               for(int i=0; i<spc.getStudentsAssignments().size(); i++){
                   System.out.println("Title: " +spc.getStudentsAssignments().get(i).getTitle() );
                   System.out.println("Description: " +spc.getStudentsAssignments().get(i).getDescription() );
                   System.out.println("Submit Date: " +spc.getStudentsAssignments().get(i).getSubmitDate() );
                   System.out.println("Oral Mark: " +spc.getStudentsAssignments().get(i).getOralMark());
                   System.out.println("Total Mark: " +spc.getStudentsAssignments().get(i).getTotalMark());
                   System.out.println(" * * * ");
               }
            
           }
       }
       
       public static void printStudentWithMoreThanOneCourses(){
           System.out.println("Our students with more than one corses are the following ");
           for(Student s : listOfAllStudents){
               if(s.getCourses().size() >=2){
                   System.out.println("name : " + s.getFirstName());
                   System.out.println("Surname : " + s.getLastName());
                   System.out.println(" * * *");
                   
               }
           }
       }
       
       
       
       
       
}
         




