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
public class InbultTestCase {
    public  boolean isPatientNormal(String s,float rrate, float hrate, float bp, double kg, double pounds)
    {
        
        if(s=="Newborn")
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
        
        else if(s=="Infant")
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
        
        else if(s=="Toddler")
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
        
        else if(s=="Preschooler") 
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
        
        else if(s=="SchoolAge")
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
        
        else if(s=="Adolescent")  
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
    
}
