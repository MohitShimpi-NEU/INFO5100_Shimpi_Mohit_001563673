/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.Persona.Admin.Adminn;
import info5100.university.example.Persona.Person;
import info5100.university.example.universityy.University;

/**
 *
 * @author mohit shimpi
 */
public class maintrial {
    public static void main(String[] args) {
       
        
        Person a1 = new Person("mohit","mohit.p","1234");
        Adminn admin = new Adminn(a1);
        University nEU = new University("Northeastern University");
        
        
        nEU.setAdmin(admin);
       
        nEU.start();
        
        
    }

    
}
