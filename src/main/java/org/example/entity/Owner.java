package org.example.entity; // Описание Владельца

//import java.util.Calendar; // импортируем календарь
//Calendar clndr = Calendar.getInstance();
//Year = clndr.get(Calendar.YEAR);
//public void ageCounter()

public class Owner {
    private final String name = "Alexander";		// Имя
    private final String surname = "Brechalov";	    // Фамилия
    private int age = 47;		                    // Возраст (с 1974)

    public Owner(){
    }

    public void OwnerPrint() {                   // метод для вывода данных о Владельце
        System.out.print("Owner description: ");
        System.out.printf("%s %s age %s", name, surname, age);
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
