import java.util.Scanner;

/*
Задача №11_Работа с данными
Напишите программу:
Ввести первое  число с клавиатуры и записать его в строковую переменную.
Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
Сравнить 2 числа и вывести большее на экран .
Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */
public class TaskWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 с клавиатуры");
        String num1 = scanner.next();
        System.out.println("Введите число 2 с клавиатуры");
        int num2 = scanner.nextInt();
        int num1Int = Integer.parseInt(num1);
        int max = Math.max(num1Int, num2);
        System.out.println(max);
        double min = Math.min(num1Int, num2);
        System.out.println(min);
    }
}
