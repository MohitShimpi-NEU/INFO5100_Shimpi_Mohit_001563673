/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

/**
 *
 * @author 16177
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Patient 
{
    String PName;
    int age;
    String VSString;

    public String getVSString() {
        return VSString;
    }

    public void setVSString(String VSString) {
        this.VSString = VSString;
    }
        
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

    public  boolean isPatientNormal(double rrate, double hrate, double bp, double kg, double pounds)
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
                System.out.println("Patient has Bradycardia which is result of slow heart rate- CRITICAL CONDITION");
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
                System.out.println("Patient has Bradycardia which is result of slow heart rate- CRITICAL CONDITION");
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
                System.out.println("Patient has Bradycardia which is result of slow heart rate- CRITICAL CONDITION");
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
                System.out.println("Patient has Bradycardia which is result of slow heart rate- CRITICAL CONDITION");
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
                System.out.println("Patient has Bradycardia which is result of slow heart rate- CRITICAL CONDITION");
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
    
    public void getInputForVS()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter name of below vital sign you want to check is normal:-");
        System.out.println("1)Respiratory Rate 2)Heart Rate 3)Blood Pressure 4)Weight in killos 5)Weight in pounds");
        VSString= input.nextLine();
        
    }
    
    public boolean isThisVitalSignNormal(String vsign, double n)
    {
        VitalSigns VSObject1 = new VitalSigns();
        
        if(age==1)
        {

            if("Respiratory Rate".equals(vsign) && 30<n&&n<50)
            {
                    return true;
            }
            else if("Heart Rate".equals(vsign) && 120<n&&n<160 )
            {
                    return true;
            }
            else if("Blood Pressure".equals(vsign) && 50<n&&n<70)
            {
                    return true;
            }
            else if("Weight in killos".equals(vsign) && 2<n&&n<3)
            {
                    return true;
            }
            else if("Weight in pounds".equals(vsign) && 4.5<n&&n<7)
            {
                    return true;
            }
            else
            {
                return false;
            }      
        }
        
        else if(age==2)
        {

            if("Respiratory Rate".equals(vsign) && 20<n&&n<30)
            {
                    return true;
            }
            else if("Heart Rate".equals(vsign) && 80<n&&n<140)
            {
                    return true;
            }
            else if("Blood Pressure".equals(vsign) && 70<n&&n<100)
            {
                    return true;
            }
            else if("Weight in killos".equals(vsign) && 4<n&&n<10)
            {
                    return true;
            }
            else if("Weight in pounds".equals(vsign) && 9<n&&n<22)
            {
                    return true;
            }
            else
            {
                return false;
            }        
        }
        
        else if(age==3)
        {

            if("Respiratory Rate".equals(vsign) && 20<n&&n<30)
            {
                    return true;
            }
            else if("Heart Rate".equals(vsign) && 80<n&&n<130)
            {
                    return true;
            }
            else if("Blood Pressure".equals(vsign) && 80<n&&n<110)
            {
                    return true;
            }
            else if("Weight in killos".equals(vsign) && 10<n&&n<14)
            {
                    return true;
            }
            else if("Weight in pounds".equals(vsign) && 22<n&&n<31)
            {
                    return true;
            }
            else
            {
                return false;
            }        
        }
        
        else if(age==4)
        {

            if("Respiratory Rate".equals(vsign) && 20<n&&n<30)
            {
                    return true;
            }
            else if("Heart Rate".equals(vsign) && 80<n&&n<120)
            {
                    return true;
            }
            else if("Blood Pressure".equals(vsign) && 80<n&&n<110)
            {
                    return true;
            }
            else if("Weight in killos".equals(vsign) && 14<n&&n<18)
            {
                    return true;
            }
            else if("Weight in pounds".equals(vsign) && 31<n&&n<40)
            {
                    return true;
            }
            else
            {
                return false;
            }        
        }
        
        else if(age==5)
        {

            if("Respiratory Rate".equals(vsign) && 20<n&&n<30)
            {
                    return true;
            }
            else if("Heart Rate".equals(vsign) && 70<n&&n<110)
            {
                    return true;
            }
            else if("Blood Pressure".equals(vsign) && 80<n&&n<120)
            {
                    return true;
            }
            else if("Weight in killos".equals(vsign) && 20<n&&n<42)
            {
                    return true;
            }
            else if("Weight in pounds".equals(vsign) && 41<n&&n<92)
            {
                    return true;
            }
            else
            {
                return false;
            }        
        }
        
        else if(age==6)
        {

            if("Respiratory Rate".equals(vsign) && 12<n&&n<20)
            {
                    return true;
            }
            else if("Heart Rate".equals(vsign) && 55<n&&n<105)
            {
                    return true;
            }
            else if("Blood Pressure".equals(vsign) && 110<n&&n<120)
            {
                    return true;
            }
            else if("Weight in killos".equals(vsign) && n>50)
            {
                    return true;
            }
            else if("Weight in pounds".equals(vsign) && n>110)
            {
                    return true;
            }
            else
            {
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
        
        PObject.CollectPatientInfo();
        System.out.println("");
 
        VSObject.getInput();

        
        ArrayList list = new ArrayList();
        
        while(true)
        {
            System.out.println("");
        
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");             
            System.out.println("Enter a choice:-");
            System.out.println("1) Check patient is normal or abnormal");
            System.out.println("2) View patient information and current vital signs");
            System.out.println("3) Add new vital signs");
            System.out.println("4) View history of vital signs");
            System.out.println("5) Check if vital sign is normal");
            System.out.println("6) Exit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            int choice =  sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    
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
                    PObject.DisplayInfo();
                    VSObject.DisplayVS();
                    break;
                    
                case 3:
                    list.add(VSObject.getTimestamp());
                    list.add(VSObject.getRrate());
                    list.add(VSObject.getHrate());
                    list.add(VSObject.getBloodpressure());
                    list.add(VSObject.getKweight());
                    list.add(VSObject.getPweight());
                    VSObject.getInput();
                    break;
                
                case 4:
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("PATIENT HISTORY:-");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    PObject.DisplayInfo();
                    int n = list.size();
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("History of VITAL SIGNS:-");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    for (int i = 0; i < n; ++i) 
                    { 
                        if (i % 6 == 0){
                            System.out.println("");
                            System.out.println("-> Vital Sign "+(i/6+1)+":-");
                            System.out.println("Time                                  Respiratory Rate    Heart Rate          Blood Pressure      Weight(kg)          Weight(pounds)  ");
                        }
                        System.out.print(list.get(i) + "                 ");
                    }
                    System.out.println("");
                    
                    break;
                    
                case 5:
                    PObject.getInputForVS();
                    boolean c ;
                    
                    String s1= PObject.getVSString();

                    String s2="Respiratory Rate";
                    String s3="Heart Rate";
                    String s4="Blood Pressure";
                    String s5="Weight in killos";
                    String s6="Weight in pounds";
                    System.out.println("");
                    if(s1.equals(s2))
                    {
                        c = PObject.isThisVitalSignNormal(PObject.getVSString(),VSObject.getRrate());
                        if(c)
                        {
                            System.out.println("-> Patient "+ PObject.getVSString()+ " is normal");
                        }
                        else
                        {
                            System.out.println("-> Patient "+ PObject.getVSString()+" is abnormal");
                        }
                    }
                    if(s1.equals(s3))
                    {
                        c = PObject.isThisVitalSignNormal(PObject.getVSString(),VSObject.getHrate());
                        if(c)
                        {
                            System.out.println("-> Patient "+ PObject.getVSString()+ " is normal");
                        }
                        else
                        {
                            System.out.println("-> Patient "+ PObject.getVSString()+" is abnormal");
                        }
                    }
                    if(s1.equals(s4))
                    {
                        c = PObject.isThisVitalSignNormal(PObject.getVSString(),VSObject.getBloodpressure());
                        if(c)
                        {
                            System.out.println("-> Patient "+ PObject.getVSString()+ " is normal");
                        }
                        else
                        {
                            System.out.println("-> Patient "+ PObject.getVSString()+" is abnormal");
                        }
                    }
                    if(s1.equals(s5))
                    {
                        c = PObject.isThisVitalSignNormal(PObject.getVSString(), VSObject.getKweight());
                        if(c)
                        {
                            System.out.println("-> Patient "+ PObject.getVSString()+ " is normal");
                        }
                        else
                        {
                            System.out.println("-> Patient "+ PObject.getVSString()+" is abnormal");
                        }
                    }
                    if(s1.equals(s6))
                    {
                        c = PObject.isThisVitalSignNormal(PObject.getVSString(), VSObject.getPweight());
                        if(c)
                        {
                            System.out.println("-> Patient "+ PObject.getVSString()+ " is normal");
                        }
                        else
                        {
                            System.out.println("-> Patient "+ PObject.getVSString()+" is abnormal");
                        }
                    }
 
                    break;

                    
                case 6:
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
