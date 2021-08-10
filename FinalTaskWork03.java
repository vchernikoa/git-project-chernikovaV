import java.util.Scanner;
import java.util.*;

/*
Итоговая задача № 3
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.
Пример для теста работы программы:
Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
 */
public class FinalTaskWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        String[] mas = new String[rows];

        for (int i=0; i< mas.length; i++){
            mas[i] = scanner.next();
        }

        int[] sizeMas = new int[rows];

        for (int j=0; j< mas.length; j++){
            char[] arr= mas[j].toCharArray();
            HashSet<Character> al = new HashSet<Character>();
            for (int i=0; i<arr.length; i++)
            {
                al.add(arr[i]);
            }
            sizeMas[j] = al.size();
            // System.out.println(sizeMas[j]);
        }
        int indexOfMax = 0;
        for (int i=0; i< sizeMas.length;i++){
            if (sizeMas[i] > sizeMas[indexOfMax])
            {
                indexOfMax = i;
            }
        }
        System.out.println(mas[indexOfMax]);
    }
}
