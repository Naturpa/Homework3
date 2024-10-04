package org.example;

public class Table {
    private int[][] table; // переменная для хранения таблицы

    public Table(int rows, int cols) {
        table = new int[rows][cols]; // инициализация таблицы
    }

    public int getValue(int row, int col) { //метод для чтения значений ячейки
        return table[row][col];
    }

    public void setValue(int row, int col, int value) { // метод для записи значения на определенное место в таблице
        table[row][col] = value;
    }

    public int rows() { //возвращает количество строк
        return table.length;
    }

    public int cols() { // возвращает количество столбцов
        return table[0].length;
    }
    @Override
    public String toString() { // метод преобразования таблицы в строки
        StringBuilder sb = new StringBuilder();
        for (int[] row : table) {
            for (int col : row) {
                sb.append(col).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public double average() { // метод для вычисления среднего арифметического
        int sum = 0;
        for (int[] row : table) {
            for (int col : row) {
                sum += col;
            }
        }
        return (double) sum / (rows() * cols());
    }
}
