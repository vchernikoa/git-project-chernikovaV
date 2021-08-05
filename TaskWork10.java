import java.util.Scanner;
/*
Напишите программу, где пользователь вводит данные с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.

 */
public class TaskWork10 {
    public static void main(String[] args) {
        int rows, columns;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        rows = scanner.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        columns = scanner.nextInt();
        int[][] arr = new int[rows][columns];

        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i =0; i<arr[0].length; i++){
            System.out.print(arr[0][i]*3 + " ");
        }
    }
}
