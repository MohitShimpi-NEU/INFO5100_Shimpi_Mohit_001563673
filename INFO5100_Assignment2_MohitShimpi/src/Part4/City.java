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
public class City {
Scanner sc= new Scanner(System.in);

private ArrayList<Community> communityList;
private String cityName;
    public City(String cityName) {
        this.cityName = cityName;
        communityList =new ArrayList<Community>();
    }

    City() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public Community addcomtoct() {
        System.out.println("Enter Community");
        String community;
        community=sc.next();
        System.out.println("Enter Zipcode");
        String zipcode;
        zipcode=sc.next();
        Community ck=new Community(community,zipcode);
            communityList.add(ck);
            return ck;
    }
  
}
