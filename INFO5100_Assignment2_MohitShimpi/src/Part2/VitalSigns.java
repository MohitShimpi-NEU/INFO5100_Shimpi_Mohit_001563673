/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 16177
 */
public class VitalSigns {
    
    double rrate;
    double hrate;
    double bloodpressure;
    double kweight;
    double pweight;

    public double getRrate() {
        return rrate;
    }

    public void setRrate(double rrate) {
        this.rrate = rrate;
    }

    public double getHrate() {
        return hrate;
    }

    public void setHrate(double hrate) {
        this.hrate = hrate;
    }

    public double getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(double bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public double getKweight() {
        return kweight;
    }

    public void setKweight(double kweight) {
        this.kweight = kweight;
    }

    public double getPweight() {
        return pweight;
    }

    public void setPweight(double pweight) {
        this.pweight = pweight;
    }
    
    public void getInput()
    {
        LocalDate myObj = LocalDate.now(); 

        LocalTime myObj1 = LocalTime.now();
        
        Date date = new Date();
        
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Enter Vital Signs:-");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-> Enter Respiratory Rate-");
        rrate = input.nextInt();
        
        System.out.println("-> Enter Heart Rate-");
        hrate = input.nextInt();
        
        System.out.println("-> Enter Systolic Blood Pressure-");
        bloodpressure = input.nextInt();
        
        System.out.println("-> Enter Weight in Kilos-");
        kweight = input.nextDouble();
        
        System.out.println("-> Enter Weight in Pounds-");
        pweight = input.nextDouble();
        
        
        
         
    }
    
    public void DisplayVS()
    {
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Vital Signs:-");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Respiratory Rate= " + rrate);
        System.out.println("Heart Rate= "+ hrate);
        System.out.println("Systolic Blood Pressure= "+ bloodpressure);
        System.out.println("Weight in Kilos= "+ kweight);
        System.out.println("Weight in Pounds= "+ pweight);
    }
}
