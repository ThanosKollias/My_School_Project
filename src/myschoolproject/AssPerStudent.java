

package myschoolproject;

import java.util.ArrayList;

/*
 * @author Mr.Celosia
 */
public class AssPerStudent {

    private Student student;
    private ArrayList<Assignment> studentsAssignments = new ArrayList<>();

    public AssPerStudent() {
    }

    
    public AssPerStudent(Student student, ArrayList<Assignment> studentsAssignments) {
        this.student = student;
        this.studentsAssignments = studentsAssignments;
    }

    
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<Assignment> getStudentsAssignments() {
        return studentsAssignments;
    }

    public void setStudentsAssignments(ArrayList<Assignment> studentsAssignments) {
        this.studentsAssignments = studentsAssignments;
    }
    
    
}
