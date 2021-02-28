/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4;

/**
 *
 * @author 16177
 */
public class Person {
     int personId;
     String name;
     String age;
    String address1;
    String cName;
    int zip;
    String city;
    String State;
    
//    Person(int personId, String name, String age,String address1,  String cName,  int zip,  String city,  String State)
//    {
//        this.personId= personId;
//     this.name= name;
//     this.age= age;
//    this.address1= address1;
//    this.cName= cName;
//    this.zip= zip;
//    this.city= city;
//    this.State= State;
//    }
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    
 
}
