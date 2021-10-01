package org.example;

import org.example.entity.House;
import org.example.entity.House;
import org.example.entity.Owner;


public class Application {
    public static void main(String[] args) {
        //System.out.println("main programm is running");
        House myHouse = new House(
                "Brechalov A.V.",
                5,
                "Izhevsk sity",
                "Black");
        myHouse.somePrint();
/*
        System.out.print("Owner is: ");
        System.out.println(myHouse.getOwner());
        System.out.print("Floors quantity is: ");
        System.out.println(myHouse.getFloorsQuantity());
        System.out.print("Address is: ");
        System.out.println(myHouse.getAddress());
        System.out.print("Color is: ");
        System.out.println(myHouse.getColour());
        System.out.println("*******************************");
*/
        Owner president = new Owner();
        president.OwnerPrint();
    }
}
