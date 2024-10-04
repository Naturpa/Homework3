package org.example;

public class Main {
    public static void main(String[] args) {
        /*Задание 1. "Кнопка".*/
        System.out.println("Number 1:");
        Button btn = new Button(); //экземпляр класса
        btn.click(); // нажатие на кнопку
        btn.click();
        btn.click();
        btn.click();
        btn.click();

        /*Задание 2. "Весы".  */
        System.out.println("Number 2:");
        Balance balance = new Balance(); //экземпляр класса
        balance.addLeft(10); // вес левой чаши
        balance.addRight(8); //вес правой чаши
        balance.result(); // результат сравнения

        /*Задание 3. "Звонок".*/
        System.out.println("Number 3:");
        Bell bell = new Bell(); //экземпляр класса
        bell.sound(); //звонок
        bell.sound();
        bell.sound();
        bell.sound();

        /*Задание 4. "Числа.*/
        System.out.println("Number 4:");
        OddEvenSeparator separator = new OddEvenSeparator(); //экземпляр класса
        separator.addNumber(2); //ввод числа в список
        separator.addNumber(7);
        separator.addNumber(9);
        separator.addNumber(4);
        separator.addNumber(10);
        separator.addNumber(15);
        separator.even(); // Вывод четных чисел
        separator.odd(); // Вывод нечетных чисел

        /*Задание 5. "Таблица".*/
        System.out.println("Number 5:");
        Table table = new Table(2, 3); //экземпляр класса
        table.setValue(0, 0, 4); //элемент 1 строки, 1 столбца
        table.setValue(0, 1, 5); //элемент 1 строки, 2 столбца
        table.setValue(0, 2, 7); //элемент 1 строки, 3 столбца
        table.setValue(1, 0, 9); //элемент 2 строки, 1 столбца
        table.setValue(1, 1, 1); //элемент 2 строки, 2 столбца
        table.setValue(1, 2, 0); //элемент 2 строки, 3 столбца
        System.out.println(table.toString()); //вывод на экран строчек таблицы
        System.out.println("Average: " + table.average()); //среднее арифметическое значений ячеек

    }
}