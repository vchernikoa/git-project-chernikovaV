/*
Задача №3_ Массивы
Выполните следующие действия с массивом:

Задайте массив из 5 любых целых чисел.
Поменяйте местами первый и последний элемент в массиве.
Вывести в консоль результат суммы первого и среднего элемента.
Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.
 */
public class TaskWork03 {
    public static void main(String[] args) {
        int[] mas1 = {1, 2, 3, 4, 5};
        int a = mas1[0];
        mas1[0] = mas1[mas1.length-1];
        mas1[mas1.length-1] = a;
        System.out.println(mas1[0]+mas1[mas1.length/2]);
    }
}