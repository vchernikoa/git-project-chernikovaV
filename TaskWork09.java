import java.util.Scanner;

/*
Задача №9_ Циклы
Напишите программу:
Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
Посчитайте среднее арифметическое элементов массива.
После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */
public class TaskWork09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        double[] mas = new double[a];
        double sum = 0;

        for(int i = 0; i<mas.length; i++) { // заполнение массива данными
            mas[i] = scanner.nextDouble();
        }

        for (int i=0; i<mas.length; i++){ // вычисление суммы чисел массива
            sum+=mas[i];
        }
        double c = mas.length;
        double b = sum/c; // вычисление средней арифметической

        for (int i = 0; i<mas.length; i++){ // умножение кажого элемента массива на среднее арифметическое и вывод на экран
            System.out.println(mas[i]*b);
        }
    }
}
