package org.example;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    List<Integer> oddNumbers; // список нечетных чисел
    List<Integer> evenNumbers; // список четных чисел

    public OddEvenSeparator() {
        oddNumbers = new ArrayList<>();  //инициализация списков
        evenNumbers = new ArrayList<>();
    }

    public void addNumber(int number) {  //метод для добавления чисел в нужный список
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    // Метод для вывода четных чисел
    public void even() {
        System.out.println("Even Numbers:");
        System.out.println(evenNumbers);
    }

    // Метод для вывода нечетных чисел
    public void odd() {
        System.out.println("Odd Numbers:");
        System.out.println(oddNumbers);
    }
}