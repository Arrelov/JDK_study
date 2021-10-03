package org.example.entity; // Описание дома

import org.example.entity.Owner;        // импорт класса Owner

public class House {
    private Owner owner1;                // Владелец
    private final int floorsQuantity;	// Количество этажей final
    private String address;	            // Адрес
    private String colour;		        // Цвет

    public void somePrint() {                   // метод для вывода текста
        System.out.println("House description:");
        owner1.ownerPrint();
        //System.out.print("Owner is: ");
        //System.out.println(owner1);
        System.out.print("Floors quantity is: ");
        System.out.println(floorsQuantity);
        System.out.print("Address is: ");
        System.out.println(address);
        System.out.print("Color is: ");
        System.out.println(colour);
    }
            // конструктор класса
    public House(int floorsQuantity, String address, String colour) {
        owner1 = new Owner();
        this.floorsQuantity = floorsQuantity;
        this.address = address;
        this.colour = colour;
    }


    public int getFloorsQuantity() {            // геттер для количества этажей
        return floorsQuantity;
    }

    public String getAddress() {                // геттер для адреса
        return address;
    }

    public String getColour() {                  // геттер для цвета дома
        return colour;
    }

}
