/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.CourseSchedule.CourseOffer;
import java.util.ArrayList;

/**
 *
 * @author mohit shimpi
 */
public class FacultyProfile {

    Person person;
    ArrayList <FacultyAssignment> facultyassignments; 

    public FacultyProfile(Person p) {

        person = p;
        facultyassignments = new ArrayList();
    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        
        return fa;
    }
    
    public FacultyProfile getCourseOffer(String courseid){
        return null; //complete it later
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public String getFacultyName(){
    return person.getPersonName();
    }
    
    public String getFacultyid(){
    return person.getPersonId();
    }
    
    public String getFacultyPassword(){
    return person.getPassword();
    }
}
