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
public class Community {
   private String communityName;
    private ArrayList<House> houseList=new ArrayList<House>();;
    private String zipCode;
    
    Community(String community, String zipcode) {
        this.communityName = community;
        this.zipCode= zipcode;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  public void addHouse(House house){
    this.houseList.add(house);
    }
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    House addhtocom() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter house address");
        String community = null;
        community =sc.next();
        House house1=new House(community);
            addHouse(house1);
             return house1;
    }
  
    
}
