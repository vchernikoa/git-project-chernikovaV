/*
Задача №4_Операторы
Написать программу, которая будет выполнять следующие действия:

Ввести три числа с клавиатуры x, y, z
Найти и вывести в консоль среднее арифметическое этих чисел.
Разделить среднее арифметическое на 2 и округлить в меньшую сторону
Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */

import java.util.Scanner;

public class TaskWork04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = (a+b+c)/3;
        System.out.println("Среднее арифметическое введенных чисел = " + d);

        int e = d/2;

        if (e>3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
