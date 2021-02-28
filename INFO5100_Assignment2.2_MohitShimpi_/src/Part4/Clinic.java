/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4;

import java.util.ArrayList;
import java.util.HashMap;
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
        String zipcode;
        String com;
        
        String name;
        Patient ps= new Patient();     
        
        id++;
        ps.setPersonId(id);
        
        do{System.out.println("Enter patient name-");
        name=sc.next();
        }while(!name.matches("^[a-zA-Z]*"));
        ps.setName(name);
         
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
        
         System.out.println("");
        System.out.println("Enter Person Address ------->>>");
      
        System.out.println("Enter patient address-");
          ps.setAddress(sc.next());
          
        do{System.out.println("Enter patient community-");
        com=sc.next();}while(!com.matches("^[a-zA-Z]*"));
          
          
          do{
          System.out.println("Enter patient zipcode-");
          zipcode= sc.next();
          }while(!zipcode.matches("[0-9]{5}"));
          
          ps.setCommunity(com);
        
          ps.setZip(zipcode);
                  
          VitalSigns v = new VitalSigns();
        ps.addNewVitalSignEncounter();
             int status = 0;
             if(age==1)
        {
            if(30<v.getRrate()&&v.getRrate()<50 && 120<v.getHrate()&&v.getHrate()<160 && 50<v.getBloodpressure()&&v.getBloodpressure()<70 && 2<v.getKweight()&&v.getKweight()<3 && 4.5<v.getPweight()&&v.getPweight()<7)//normal condition
                 status=1;
            else if(v.getRrate()>50 && v.getHrate()>160 && v.getBloodpressure()>70)//heart rate, bp, respiratory rate  increeases while fever or stress
            {  
                status=0;
            }
            else if (v.getRrate()<30 && v.getHrate()<120 && 50<v.getBloodpressure()&&v.getBloodpressure()<70)//patient health decompensation- every thing decreases but bp is normal at starting but decreases at last
            {
                 status=0;       
            }
            else if(v.getHrate()<120)//bradycardia is a slower than normal heart rate
            {
                 status=0;
            }
            else
            {   
                 status=0;
            }
        }
        
        else if(age==2)
        {
             if(20<v.getRrate()&&v.getRrate()<30 && 80<v.getHrate()&&v.getHrate()<140 && 70<v.getBloodpressure()&&v.getBloodpressure()<100 && 4<v.getKweight()&&v.getKweight()<10 && 9<v.getPweight()&&v.getPweight()<22)//normal condition
                 status=1;
            else if(v.getRrate()>30 && v.getHrate()>140 && v.getBloodpressure()>100)//heart rate, bp, respiratory rate  increeases while fever or stress
            {  
                status=0;
            }
            else if (v.getRrate()<30 && v.getHrate()<80 && 70<v.getBloodpressure()&&v.getBloodpressure()<100)//patient health decompensation- every thing decreases but bp is normal at starting but decreases at last
            {
                 status=0;       
            }
            else if(v.getHrate()<100)//bradycardia is a slower than normal heart rate
            {
                 status=0;
            }
            else
            {   
                 status=0;
            }
        }
        
        else if(age==3)
        {
             if(20<v.getRrate()&&v.getRrate()<30 && 80<v.getHrate()&&v.getHrate()<130 && 80<v.getBloodpressure()&&v.getBloodpressure()<110 && 10<v.getKweight()&&v.getKweight()<14 && 22<v.getPweight()&&v.getPweight()<31)//normal condition
                 status=1;
            else if(v.getRrate()>30 && v.getHrate()>130 && v.getBloodpressure()>110)//heart rate, bp, respiratory rate  increeases while fever or stress
            {  
                status=0;
            }
            else if (v.getRrate()<20 && v.getHrate()<80 && 80<v.getBloodpressure()&&v.getBloodpressure()<110)//patient health decompensation- every thing decreases but bp is normal at starting but decreases at last
            {
                 status=0;       
            }
            else if(v.getHrate()<80)//bradycardia is a slower than normal heart rate
            {
                 status=0;
            }
            else
            {   
                 status=0;
            }
        }
        
        else if(age==4) 
        { if(20<v.getRrate()&&v.getRrate()<30 && 80<v.getHrate()&&v.getHrate()<120 && 80<v.getBloodpressure()&&v.getBloodpressure()<110 && 10<v.getKweight()&&v.getKweight()<14 && 22<v.getPweight()&&v.getPweight()<31)//normal condition
                 status=1;
            else if(v.getHrate()>30 && v.getHrate()>120 && v.getBloodpressure()>110)//heart rate, bp, respiratory rate  increeases while fever or stress
            {  
                status=0;
            }
            else if (v.getRrate()<20 && v.getHrate()<80 && 80<v.getBloodpressure()&&v.getBloodpressure()<110)//patient health decompensation- every thing decreases but bp is normal at starting but decreases at last
            {
                 status=0;       
            }
            else if(v.getHrate()<80)//bradycardia is a slower than normal heart rate
            {
                 status=0;
            }
            else
            {   
                 status=0;
            }
        }
        
        else if(age==5)
        { if(20<v.getRrate()&&v.getRrate()<30 && 70<v.getHrate()&&v.getHrate()<110 && 80<v.getBloodpressure()&&v.getBloodpressure()<120 && 20<v.getKweight()&&v.getKweight()<42 && 41<v.getPweight()&&v.getPweight()<92)//normal condition
                 status=1;
            else if(v.getHrate()>30 && v.getHrate()>110 && v.getBloodpressure()>120)//heart rate, bp, respiratory rate  increeases while fever or stress
            {  
                status=0;
            }
            else if (v.getRrate()<20 && v.getHrate()<120 && 80<v.getBloodpressure()&&v.getBloodpressure()<120)//patient health decompensation- every thing decreases but bp is normal at starting but decreases at last
            {
                 status=0;       
            }
            else if(v.getHrate()<70)//bradycardia is a slower than normal heart rate
            {
                 status=0;
            }
            else
            {   
                 status=0;
            }
        }
        
        else if(age==6)  
        {
             if(12<v.getRrate()&&v.getRrate()<20 && 55<v.getHrate()&&v.getHrate()<105 && 110<v.getBloodpressure()&&v.getBloodpressure()<120 && v.getKweight()>50 && v.getPweight()>110)//normal condition
                 status=1;
            else if(v.getHrate()>20 && v.getHrate()>105 && v.getBloodpressure()>120)//heart rate, bp, respiratory rate  increeases while fever or stress
            {  
                status=0;
            }
        
            else
            {   
                 status=0;
            }
        }
        else
            status=0;
        
             ps.setStatuss(status);
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
           //System.out.println("  ++ PATIENT STATUS ++ - "+ status);
           System.out.print("  Patient address - "+ ps.getAddress());
           System.out.print("  Patient community - "+ ps.getCommunity());
          System.out.println("  Patient zipcode - "+ps.getZip());
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

        VitalSigns v = new VitalSigns();
      
        
        System.out.println("Enter the community name of the patient - ");
        String cName = sc.next();
        
        for(Patient ps:pd)
        {
            String s = ps.getCommunity();
           
            if(s.equals(cName))
            {
                if("Newborn".equals(ps.getAge()))
                {
                    if(50>v.getBloodpressure() && v.getBloodpressure()>70);
                        i++;
                }
                else if("Infant(1-12 months)".equals(ps.getAge()))
                {
                    if(70>v.getBloodpressure() && v.getBloodpressure()>100);
                        i++;
                }
                else if("Todler (1-3 years)".equals(ps.getAge()))
                {
                    if(80>v.getBloodpressure() && v.getBloodpressure()>110);
                        i++;
                }
                else if("Preschooler (3-5 years)".equals(ps.getAge()))
                {
                    if(80>v.getBloodpressure() && v.getBloodpressure()>110);
                        i++;
                }
                else if("School Age (6-12 years)".equals(ps.getAge()))
                {
                    if(80>v.getBloodpressure() && v.getBloodpressure()>120);
                        i++;
                }
                else if("Adolescent (13+ years)".equals(ps.getAge()))
                {
                    if(110>v.getBloodpressure() && v.getBloodpressure()>120);
                        i++;
                }
                
            }
        }
         System.out.println("Total number people in the community with blood pressure that is abnormal - "+i);    
             
    } 
           private void checkAbnormal() 
    {
        HashMap<String, Integer> AbnormalStatus = new HashMap<String, Integer>();
        int count =1;
        for(Patient ps:pd)
        {
           
            if(ps.getStatuss()==0)
            {
                 if(AbnormalStatus.containsKey(ps.getCommunity())){
                     
                     int tmp = AbnormalStatus.get(ps.getCommunity());
                     
                     //i++;
                     AbnormalStatus.replace(ps.getCommunity(), ++tmp);
                 }
                     
                 else{
                     //i++;
                AbnormalStatus.put(ps.getCommunity(), count);}
            }  
        }

        for (String i : AbnormalStatus.keySet()) {
         System.out.println("Community: " + i + " Count: " + AbnormalStatus.get(i));
}
        
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
                    cl.checkAbnormal();
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
