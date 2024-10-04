package org.example;

public class Button {
    private int clickINT; //счетчик нажатий

    public Button() { //конструктор
        clickINT = 0; //начальное значение количества нажатий кнопки
    }

    public void click() { //метод для подсчета нажатий, выводит их количество
        clickINT++;
        System.out.println("Buttun was clicked " + clickINT + " times");
    }

    public int getClickINT() { //метод для получения текущего количества нажатий
        return clickINT;
    }
}

