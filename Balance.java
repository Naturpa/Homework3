package org.example;

public class Balance {
    public int leftWeight; //переменная для хранения значения веса левой чаши
    public int rightWeight; //переменная для хранения значения веса правой чаши

    public Balance() { //конструктор
        leftWeight = 0; //стартовый вес
        rightWeight = 0;
    }

    public void addRight(int weight) { //добавление веса на правую чашу
        rightWeight += weight;
    }

    public void addLeft(int weight) { //добавление веса на левую чашу
        leftWeight += weight;
    }

    public void result() { //сравнение двух чаш и вывод результата
        if (leftWeight == rightWeight) {
            System.out.println("=");
        } else if (leftWeight > rightWeight) {
            System.out.println("L");
        } else {
            System.out.println("R");
        }
    }
}
