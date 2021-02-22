/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.util.Scanner;

/**
 *
 * @author 16177
 */
public class VitalSigns {
    
    float rrate;
    float hrate;
    float bloodpressure;
    double kweight;
    double pweight;

    public float getRrate() {
        return rrate;
    }

    public void setRrate(float rrate) {
        this.rrate = rrate;
    }

    public float getHrate() {
        return hrate;
    }

    public void setHrate(float hrate) {
        this.hrate = hrate;
    }

    public float getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(float bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public double getKweight() {
        return kweight;
    }

    public void setKweight(float kweight) {
        this.kweight = kweight;
    }

    public double getPweight() {
        return pweight;
    }

    public void setPweight(float pweight) {
        this.pweight = pweight;
    }
    
    public void getInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Enter Vital Signs:-");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-> Enter Respiratory Rate-");
        rrate = input.nextFloat();
        
        System.out.println("-> Enter Heart Rate-");
        hrate = input.nextFloat();
        
        System.out.println("-> Enter Systolic Blood Pressure-");
        bloodpressure = input.nextFloat();
        
        System.out.println("-> Enter Weight in Kilos-");
        kweight = input.nextFloat();
        
        System.out.println("-> Enter Weight in Pounds-");
        pweight = input.nextFloat();
        
        
        
         
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
