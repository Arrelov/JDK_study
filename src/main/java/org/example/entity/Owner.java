package org.example.entity; // Описание Владельца

//import java.util.Calendar; // импортируем календарь
//Calendar clndr = Calendar.getInstance();
//Year = clndr.get(Calendar.YEAR);
//public void ageCounter()

public class Owner {
    private final String name;          // Имя
    private final String surname;	    // Фамилия
    private int age;		            // Возраст (с 1974)

    public Owner(){    // конструктор класса по умолчанию
        name = "Alexander";
        surname = "Brechalov";
        age = 47;
    }

    public Owner(String name, String surname, int age){ // конструктор класса
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void ownerPrint() {                   // метод для вывода данных о Владельце
        System.out.print("Owner description: ");
        System.out.printf("%s %s age %s\n", name, surname, age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
