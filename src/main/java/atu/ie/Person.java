package atu.ie;

import java.util.Scanner;
public class Person {
    String name;
    String address;
    String telephone;

    public Person(){
        this.name = " ";
        this.address = " ";
        this.telephone = " ";
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
}
