package tasks;

// Задача: Написать последовательность Фибоначчи (проект должен быть модифицируемым)

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    static ArrayList<Integer> fibonacciArrayList = new ArrayList<>();
    static int ArraySize;

    public static void introducingInterface() {
        System.out.println("""
                
                Вас приветствует интерфейс тестового задания!
                Задача: создать последовательность чисел Фибоначчи и вывести их на экран.
                """);
    }

    public static void setFibonacciList() {
        ArrayList<Integer> fibonacciArray = new ArrayList<>();
        fibonacciArray.add(0);
        fibonacciArray.add(1);
        fibonacciArrayList = fibonacciArray;
    }

    public static void enterTheFibonacciListSize () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Давайте попробуем ввести размер данных!
                Введите кол-во чисел в последовательности Фибоначчи:""" + " ");
        ArraySize = scanner.nextInt();
        System.out.println();
    }

    public static void setFibonacciArray (ArrayList<Integer> fibonacciList) {
        System.out.println("Устанавливаем значения массива...");
        for (int i = 2; i < ArraySize; i++)
            fibonacciList.add(i, ((fibonacciList.get(i - 2) + fibonacciList.get(i - 1))));
        System.out.println("Кормим котика на подоконнике...");
        System.out.println("Готово!\n");
    }

    public static void getFibonacciArray (ArrayList<Integer> fibonacciList) {
        System.out.println("Массив чисел Фибоначчи:");
        for (Integer integer : fibonacciList)
            System.out.print(integer + " ");
        System.out.println();
    }

    public static void main (String[] args) {
        introducingInterface();
        setFibonacciList();
        enterTheFibonacciListSize();
        setFibonacciArray(fibonacciArrayList);
        getFibonacciArray(fibonacciArrayList);
    }

}
