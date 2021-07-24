import java.util.Scanner;

/*
Задача №7_ Циклы
Напишите программу:

Пользователь вводит размер массива и данные с клавиатуры в массив
Сравнить элементы массива с заранее заданными константами x, y, z.
Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
 */
public class TaskWork07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int[] myArray = new int[a];
        System.out.println("Заполните массив числами");
        for (int i = 0; i<myArray.length; i++){
            myArray[i] = scanner.nextInt();
        }
        int x = 3;
        int y = 5;
        int z = 8;

        for (int i = 0; i<myArray.length; i++){
            if(myArray[i] == x || myArray[i] == y || myArray[i] == z){
                System.out.println("Данное значение имеется в константах");
                break; // Использую, чтобы при вводе всех трех константах одновременно, фраза "Данное значение имеется в константах" выводилась один раз.
            }
        }
    }
}
