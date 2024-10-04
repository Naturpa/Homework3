package org.example;

public class Bell {
    private int count; // переменная для хранения количества звонков (счетчик)

    public Bell() { // конструктор
        count = 0; // количество звонков по умолчанию
    }


    public void sound() { //метод для вывода "динь", если звонок четный, "дон", если нечетный
        if (count % 2 == 0) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        count++; // счетчик
    }
}


