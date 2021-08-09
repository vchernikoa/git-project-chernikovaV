import java.util.Random;

/*
Задача №14_ Работа с данными
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
Выведите максимальный и минимальный элемент массива.
Из максимального и минимального значения выведите наибольшее по модулю.
 */
public class TaskWork14 {
    public static void main(String[] args) {
        int[] mas = new int[15];
        Random random = new Random();
        for (int i = 0; i<mas.length; i++){
            mas[i]= ((int)(Math.random()*41) - 20);
        }
        int min = mas[0];
        int max = mas[0];
        for (int i = 0; i<mas.length; i++){
            min = Math.min(min, mas[i]);
            max = Math.max(max, mas[i]);
        }
        System.out.println("Минимальное значение в массиве = "+min + "; Максимальное значение в массиве = " + max);
        int result = Math.max(Math.abs(min), Math.abs(max));
        System.out.println(result);
    }
}
