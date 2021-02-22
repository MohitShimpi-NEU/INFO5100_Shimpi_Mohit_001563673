/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

/**
 *
 * @author 16177
 */

import java.util.Scanner;

public class Patient 
{
    String PName;
    int age;
        
    public void CollectPatientInfo()
    {

        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Enter Patient Information:-");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-> Enter Patient Name-");
        PName = input.nextLine();
        System.out.println("-> Choose AGE GROUP-");   
        System.out.println("1) Newborn");
        System.out.println("2) Infant(1-12 months)");
        System.out.println("3) Todler (1-3 years)");
        System.out.println("4) Preschooler (3-5 years)");
        System.out.println("5) School Age (6-12 years)");
        System.out.println("6) Adolescent (13+ years)");
        
        while(true)
        {
            age = input.nextInt();

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
    }
    public void DisplayInfo()
    {
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Patient Information:-");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Patient Name= "+ PName);
        
            if(age==1)
            {    
                System.out.println("Patient Age= Newborn");
               
            }
            else if(age==2)
            {
                
                System.out.println("Patient Age= Infant(1-12 months)");
                
            }
            else if(age==3)
            {
                
                System.out.println("Patient Age= Todler (1-3 years)");
                
            }
            else if(age==4)
            {
                
                System.out.println("Patient Age= Preschooler (3-5 years)");
                
            }
            else if(age==5)
            {
                
                System.out.println("Patient Age= School Age (6-12 years)");
                
            }
            else if(age==6)
            {
                
                System.out.println("Patient Age= Adolescent (13+ years)");
                
            }
          
    }

    public  boolean isPatientNormal(float rrate, float hrate, float bp, double kg, double pounds)
    {
        
        if(age==1)
        {
            if(30<rrate&&rrate<50 && 120<hrate&&hrate<160 && 50<bp&&bp<70 && 2<kg&&kg<3 && 4.5<pounds&&pounds<7)//normal condition
                return true;
            else if(rrate>50 && hrate>160 && bp>70)//heart rate, bp, respiratory rate  increeases while fever or stress
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has FEVER or STREES");
                return false;
            }
            else if (rrate<30 && hrate<120 && 50<bp&&bp<70)//patient health decompensation- every thing decreases but bp is normal at starting but decreases at last
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient health DECOMPENSATING");
                return false;       
            }
            else if(hrate<120)//bradycardia is a slower than normal heart rate
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has Bradycardia which is result of sloer heart rate- CRITICAL CONDITION");
                return false;
            }
            else
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-"); 
                System.out.println("-------------------------------------------------------------------------------------------");
                return false;
            }
        }
        
        else if(age==2)
        {
            if(20<rrate&&rrate<30 && 80<hrate&&hrate<140 && 70<bp&&bp<100 && 4<kg&&kg<10 && 9<pounds&&pounds<22)//normal condition
                return true;
            else if(rrate>30 && hrate>140 && bp>100)//heart rate, bp, respiratory rate  increeases while fever or stress
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has FEVER or STREES");
                return false;
            }
            else if (rrate<20 && hrate<80 && 70<bp&&bp<100)//patient health decompensation- every thing decreases but bp is normal at starting but decreases at last
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient health DECOMPENSATING");
                return false;       
            }
            else if(hrate<80)//bradycardia is a slower than normal heart rate
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has Bradycardia which is result of sloer heart rate- CRITICAL CONDITION");
                return false;
            }
            else
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-"); 
                System.out.println("-------------------------------------------------------------------------------------------");
                return false;
            }
        }
        
        else if(age==3)
        {
            if(20<rrate&&rrate<30 && 80<hrate&&hrate<130 && 80<bp&&bp<110 && 10<kg&&kg<14 && 22<pounds&&pounds<31)//normal condition
                return true;
            else if(rrate>30 && hrate>130 && bp>110)//heart rate, bp, respiratory rate  increeases while fever or stress
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has FEVER or STREES");
                return false;
            }
            else if (rrate<20 && hrate<80 && 80<bp&&bp<110)//patient health decompensation- every thing decreases but bp is normal at starting but decreases at last
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient health DECOMPENSATING");
                return false;       
            }
            else if(hrate<80)//bradycardia is a slower than normal heart rate
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has Bradycardia which is result of sloer heart rate- CRITICAL CONDITION");
                return false;
            }
            else
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");  
                System.out.println("-------------------------------------------------------------------------------------------");
                return false;
            }
        }
        
        else if(age==4) 
        {
            if(20<rrate&&rrate<30 && 80<hrate&&hrate<120 && 80<bp&&bp<110 && 14<kg&&kg<18 && 31<pounds&&pounds<40)//normal condition
                return true;
            else if(rrate>30 && hrate>120 && bp>110)//heart rate, bp, respiratory rate  increeases while fever or stress
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has FEVER or STREES");
                return false;
            }
            else if (rrate<20 && hrate<80 && 80<bp&&bp<110)//patient health decompensation- every thing decreases but bp is normal at starting but decreases at last
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient health DECOMPENSATING");
                return false;       
            }
            else if(hrate<80)//bradycardia is a slower than normal heart rate
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has Bradycardia which is result of sloer heart rate- CRITICAL CONDITION");
                return false;
            }
            else
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");     
                System.out.println("-------------------------------------------------------------------------------------------");
                return false;
            }
        }
        
        else if(age==5)
        {
            if(20<rrate&&rrate<30 && 70<hrate&&hrate<110 && 80<bp&&bp<120 && 20<kg&&kg<42 && 41<pounds&&pounds<92)//normal condition
                return true;
            else if(rrate>30 && hrate>110 && bp>120)//heart rate, bp, respiratory rate  increeases while fever or stress
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has FEVER or STREES");
                return false;
            }
            else if (rrate<20 && hrate<70 && 80<bp&&bp<120)//patient health decompensation- every thing decreases but bp is normal at starting but decreases at last
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient health DECOMPENSATING");
                return false;       
            }
            else if(hrate<70)//bradycardia is a slower than normal heart rate
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has Bradycardia which is result of sloer heart rate- CRITICAL CONDITION");
                return false;
            }
            else
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");    
                System.out.println("-------------------------------------------------------------------------------------------");
                return false;
            }
        }
        
        else if(age==6)  
        {
            if(12<rrate&&rrate<20 && 55<hrate&&hrate<105 && 110<bp&&bp<120 && kg>50 && pounds>110)//normal condition
                return true;
            else if(rrate>20 && hrate>105 && bp>120)//heart rate, bp, respiratory rate  increeases while fever or stress
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient has FEVER or STREES");
                return false;
            }
            else
            {   
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Patient Status:-");   
                System.out.println("-------------------------------------------------------------------------------------------");
                return false;
            }
        }
        else
            return false;
                 
    }
    
    public static void main(String [] args)
    { 
        Scanner sc = new Scanner(System.in);
        Patient PObject = new Patient();
        VitalSigns VSObject = new VitalSigns();
        
        while(true)
        {
            System.out.println("");
        
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");                   
            System.out.println("Enter a choice:-");
            System.out.println("1) Manual input test case");
            System.out.println("2) Inbuilt test case");
            System.out.println("3) Exit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int choice =  sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    
                    PObject.CollectPatientInfo();
                    System.out.println("");
 
                    VSObject.getInput();

                    System.out.println("___________________________________________________________________________________________");
                    System.out.println("___________________________________________________________________________________________");
                    PObject.DisplayInfo();
                    VSObject.DisplayVS();

                    boolean a =  PObject.isPatientNormal(VSObject.getRrate(),VSObject.getHrate(),VSObject.getBloodpressure(),VSObject.getKweight(),VSObject.getPweight());
                    if(a)
                    {
                        System.out.println("");
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("Patient Status:-");
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("Patient Normal");
                    }
                    else
                    {
                        System.out.println("Patient Abnormal");
                    }    
                    break;
                    
                case 2:
                    System.out.println("");
                    System.out.println("Test Case 1: Normal condition for Toddler");
                    InbultTestCase test = new InbultTestCase();
                    boolean b =  test.isPatientNormal("Toddler",25,85,85,11,24);
                    if(b)
                    {
                        System.out.println("");
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("Patient Status:-");
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("Patient Normal");
                    }
                    else
                    {
                        System.out.println("Patient Abnormal");
                    }  
                    
                    System.out.println("");
                    System.out.println("Test Case 2: Abormal condition for infant with fever and stress");
                    boolean c =  test.isPatientNormal("Infant",35,145,105,2.5,4.5);
                    if(c)
                    {
                        System.out.println("");
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("Patient Status:-");
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("Patient Normal");
                    }
                    else
                    {
                        System.out.println("Patient Abnormal");
                    }
                    
                    break;
                    
                case 3:
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
