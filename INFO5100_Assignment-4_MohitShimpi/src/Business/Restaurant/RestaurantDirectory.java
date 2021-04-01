/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author mohit
 */
public class RestaurantDirectory {
private ArrayList<Restaurant> restaurantDirectory;
    
    public RestaurantDirectory() {
        restaurantDirectory = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public Restaurant newRestaurant(String name, String id, String pass,  String mail, String phoneno, String address){
        Restaurant res = new Restaurant(name,id,pass,mail,phoneno,address);
        restaurantDirectory.add(res);
        return res;
    }
    
    public void removeRestaurant(Restaurant restaurant){
        restaurantDirectory.remove(restaurant);
    }
    
    public Restaurant getRestaurant(String name) {
        for(Restaurant r : restaurantDirectory) {
            if(r.getName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
}
