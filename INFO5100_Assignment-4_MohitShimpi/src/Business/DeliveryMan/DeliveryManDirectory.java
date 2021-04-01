/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author mohit
 */
public class DeliveryManDirectory {
     private ArrayList<DeliveryMan> deliveryManDirectory;
    
    public DeliveryManDirectory() {
        deliveryManDirectory = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public DeliveryMan CreateNewDeliveryMan(String name, String id, String pass,  String mail, String phoneno, String address){
        DeliveryMan delman = new DeliveryMan(name,id,pass,mail,phoneno,address);
        deliveryManDirectory.add(delman);
        return delman;
    }
    
    public void removeDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManDirectory.remove(deliveryMan);
    }
    
    public DeliveryMan getCustomer(String name){
        for(DeliveryMan d: deliveryManDirectory){
            if(d.getName().equalsIgnoreCase(name)){
                return d;
            }
        }
        return null;
    }
}
