package org.example.entity; // Описание дома

import org.example.entity.Owner;        // импорт класса Owner

public class House {
    private String owner;               // Владелец
    private final int floorsQuantity;	// Количество этажей final
    private String address;	            // Адрес
    private String colour;		        // Цвет

    public void somePrint() {                   // метод для вывода текста
        System.out.println("House description:");
        System.out.print("Owner is: ");
        System.out.println(owner);
        System.out.print("Floors quantity is: ");
        System.out.println(floorsQuantity);
        System.out.print("Address is: ");
        System.out.println(address);
        System.out.print("Color is: ");
        System.out.println(colour);
    }

    public House(String owner, int floorsQuantity, String address, String colour) {
        this.owner = owner;
        this.floorsQuantity = floorsQuantity;
        this.address = address;
        this.colour = colour;
    }

    public String getOwner() {                  // геттер для владельца
        return owner;
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
