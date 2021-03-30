/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 16177
 */
public class Patient extends Person{
    
    Scanner sc = new Scanner(System.in);
    
    public ArrayList<Encounter> encounterhistory =new ArrayList<Encounter>() ;
 


    public void addNewVitalSignEncounter(){
       VitalSigns vs=new VitalSigns();

       System.out.println("");
       System.out.println("Enter Person Vital Signs  ------->>>");
       
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
        vs.setTimestamp(dateFormat.format(date));
        
        System.out.println("Enter respiratory  rate-");
        vs.setRrate(sc.nextDouble());
        
        System.out.println("Enter heart rate-");
        vs.setHrate(sc.nextDouble());

        System.out.println("Enter blood pressure-");
        vs.setBloodpressure(sc.nextDouble());

        System.out.println("Enter weight in killos-");
        vs.setKweight(sc.nextDouble());

        System.out.println("Enter weight in pounds-");
        vs.setPweight(sc.nextDouble());

        
        Encounter encounter = new Encounter(vs);
        encounterhistory.add(encounter); 
    }
    
    
    
    public void printVitalSignList()
    {
        for(int i=0;i<encounterhistory.size();i++){
            System.out.print("  Time Stamp - "+ encounterhistory.get(i).getVitalSigns().getTimestamp());
            System.out.print("  Respiratory Rate - "+ encounterhistory.get(i).getVitalSigns().getRrate());
            System.out.print(" Heart Rate - "+ encounterhistory.get(i).getVitalSigns().getHrate());
            System.out.print(" BP - "+ encounterhistory.get(i).getVitalSigns().getBloodpressure());
            System.out.print("  Weight in killos - "+ encounterhistory.get(i).getVitalSigns().getKweight());
            System.out.println("  Weight in pounds - "+ encounterhistory.get(i).getVitalSigns().getPweight());
         }
    }
     
       
        
    }
    
