/*
Задача №5_ Операторы
Напишите простой калькулятор:

Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */

import java.util.Scanner;

public class TaskWork05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = scanner.next();


        switch (c){
            case "+" : System.out.println(a + b);
                break;
            case  "-" : System.out.println(a - b);
                break;
            case "*" : System.out.println(a * b);
                break;
            case  "/" : System.out.println(a / b);
                break;
        }
    }
}
