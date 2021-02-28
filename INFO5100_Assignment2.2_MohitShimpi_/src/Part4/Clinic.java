/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 16177
 */

public class Clinic {
    Scanner sc =new Scanner(System.in);
    
    public ArrayList<Patient> pd = new ArrayList<Patient>();
    public  int id=0;
     public void addNewPatient()
    { 
        int age;
       
        Patient ps= new Patient();     
        
        id++;
        ps.setPersonId(id);
        
        System.out.println("Enter patient name-");
        ps.setName(sc.next());
         
        System.out.println("Choose AGE GROUP-");   
        System.out.println("1) Newborn");
        System.out.println("2) Infant(1-12 months)");
        System.out.println("3) Todler (1-3 years)");
        System.out.println("4) Preschooler (3-5 years)");
        System.out.println("5) School Age (6-12 years)");
        System.out.println("6) Adolescent (13+ years)");
        
        while(true)
        {
            age = sc.nextInt();

            if (age==1)
            {    
            
                break;
            
            }
            else if(age==2)
            {
          
                break;
            }
            else if(age==3)
            {
              
                break;
            }
            else if(age==4)
            {
               
                break;
            }
            else if(age==5)
            {
                
                break;
            }
            else if(age==6)
            {
                
                break;
            }
            else
            {
                 System.out.println("!!! Choose valid option !!!");

            }
        }
         if(age==1)
            {    
                ps.setAge("Newborn");   
            }
        else if(age==2)
            {
                ps.setAge("Infant(1-12 months)");
            }
        else if(age==3)
            {
                ps.setAge("Todler (1-3 years)");
            }
        else if(age==4)
            {
                ps.setAge("Preschooler (3-5 years)");
            }
        else if(age==5)
            {
                ps.setAge("School Age (6-12 years)");
            }
        else if(age==6)
            {
                ps.setAge("Adolescent (13+ years)");
            }
        
          ps.addressInput();
          
        ps.addNewVitalSignEncounter();
        
      
        
        pd.add(ps);
        
        System.out.println("############################");
        System.out.println("Patient assigned id - "+ id);
        System.out.println("############################");
        System.out.println("");
        
    }
     
     public void printPatientList()
     {
      
        for(Patient ps: pd){
           System.out.print("Patient Id - "+ ps.getPersonId());
           System.out.print("  Patient Name - "+ ps.getName());
           System.out.println("  Patient Age - "+ ps.getAge());
          // ps.displayAdrs();
           ps.printVitalSignList();
           
        }
     }
    
     private void displayByName() 
     {
        int i=1;  
        int q = 0;
        while(true)
        { 
            System.out.println("Enter the ID of the patient to know history");
            int id= sc.nextInt();

           for(Patient ps: pd)
           {
               if(ps.getPersonId()==id)
               {
                   if(i==1)
                   {
                        System.out.print("Patient Id - "+ ps.getPersonId());
                        System.out.print("  Patient Name - "+ ps.getName());
                        System.out.println("  Patient Age - "+ ps.getAge());
                        i++;
                   }
                   ps.printVitalSignList();
                   q=1;
                   break;
               }
              
           }
             if(q ==1)
                  break;
             System.out.println("ID not found");
           
        }
     }
     
     private void addVitalSign()
     {
         int q=0;
        while(true)
        {
            System.out.println("Enter the ID of the patient to add vital sign");
            int id = sc.nextInt();

            for(Patient ps: pd)
            {
               if(ps.getPersonId()==id)
               {
                   ps.addNewVitalSignEncounter();
                   q=1;
                   break;
               } 
               
            }
          if(q==1)
              break;
           System.out.println("ID not found");
        }
     }
     
    private void checkAbnormalBP() 
    {
        int i =0;
        
        Community c= new Community();
        VitalSigns v = new VitalSigns();
        Patient ps = new Patient();
        
        System.out.println("Enter the community name of the patient - ");
        String cName = sc.next();
        
//        for(int j=0; j<pd.size();j++)
//        {
          //  String s= ps.addresshistory.get(i).getC().getcName();
            
//            if(s.equals(cName))
//            {
//                if("Newborn".equals(ps.getAge()))
//                {
//                    if(50>v.getBloodpressure() && v.getBloodpressure()>70);
//                        i++;
//                }
//                else if("Infant(1-12 months)".equals(ps.getAge()))
//                {
//                    if(70>v.getBloodpressure() && v.getBloodpressure()>100);
//                        i++;
//                }
//                else if("Todler (1-3 years)".equals(ps.getAge()))
//                {
//                    if(80>v.getBloodpressure() && v.getBloodpressure()>110);
//                        i++;
//                }
//                else if("Preschooler (3-5 years)".equals(ps.getAge()))
//                {
//                    if(80>v.getBloodpressure() && v.getBloodpressure()>110);
//                        i++;
//                }
//                else if("School Age (6-12 years)".equals(ps.getAge()))
//                {
//                    if(80>v.getBloodpressure() && v.getBloodpressure()>120);
//                        i++;
//                }
//                else if("Adolescent (13+ years)".equals(ps.getAge()))
//                {
//                    if(110>v.getBloodpressure() && v.getBloodpressure()>120);
//                        i++;
//                }
                
//            }
//        }
//         System.out.println(i);    
//             
    }
         
         
     public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Clinic cl = new Clinic();

        while(true)
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");             
            System.out.println("Enter a choice:-");
            System.out.println("1) New Patient Entry");
            System.out.println("2) Add vital sign to exsisting patient");
            System.out.println("3) Display full patient history");
            System.out.println("4) Display vital sign history of particular patient");
            System.out.println("5) Total number people in the community with blood pressure that is abnormal");
            System.out.println("6) Number of abnormal cases for each community");
            System.out.println("7) Exit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");             
            
            int ch= sc.nextInt();
            
            switch(ch)
            {
                case 1:         
                    cl.addNewPatient();               
                    break;
                        
                case 2:
                    cl.addVitalSign();
                    break;
                    
                case 3:
                    cl.printPatientList();
                    break;
                    
                        
                case 4:
                    cl.displayByName();
                    break;
                    
                case 5:
                    cl.checkAbnormalBP();
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    System.out.println("");
                    System.out.println("Exiting the application");
                    System.exit(0);
                       
                default: 
                    System.out.println("");
                    System.out.println("Incorrect input!!! Please re-enter choice from our menu");
                
            }
                    
        }
    }



    
}
