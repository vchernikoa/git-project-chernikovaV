import java.util.Scanner;

/*
Задача №6_ Операторы
Напишите программу конвертер физических величин:

1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
> Выберите что переводить: 1 - масса, 2 - расстояние
> 2

2. Пользователю предлагается выбрать единицу измерения. Пример:
> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
> 1

3. Пользователю предлагается ввести количество выбранных единиц:
> Введите число
> 10
> Результат:
> Метры: 10
> Мили: 0.006
> Ярды: 10.94
> Футы: 32.81
 */
public class TaskWork06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - массу, 2 - расстояние");
        int a = scanner.nextInt();
        if(a==1){
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограм, 3 - центнер, 4 - тонна");
            int b = scanner.nextInt();
            System.out.println("Введите число");
            double c = scanner.nextInt();
            double m1, m2, m3, m4;
            m1 = m2 = m3 = m4 = 0;
            if(b==1) {
                m1 = c;
                m2 = c/1000;
                m3 = c/10000;
                m4 = c/100000;
            } else if(b==2){
                m1 = c * 1000;
                m2 = c;
                m3 = c/100;
                m4 = c/1000;
            } else if(b==3){
                m1 = c * 100000;
                m2 = c*100;
                m3 = c;
                m4 = c/10;
            } else if(b==4){
                m1 = c * 1000000;
                m2 = c*1000;
                m3 = c*10;
                m4 = c;
            }
            System.out.println("Граммы " + m1 );
            System.out.println("Килограммы " + m2);
            System.out.println("Центнеры " + m3);
            System.out.println("Тонны " + m4);

        } else if(a==2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фунт");
            int d = scanner.nextInt();
            System.out.println("Введите число");
            double f = scanner.nextInt();
            double n1, n2, n3, n4;
            n1 = n2 = n3 = n4 = 0;
            if(d==1) {
                n1 = f;
                n2 = f * 0.00062;
                n3 = f*1.0936;
                n4 = f*3.2808;
            } else if(d==2){
                n1 = f * 1609;
                n2 = f;
                n3 = f*1760;
                n4 = f*3.28;
            } else if(d==3){
                n1 = f * 10.91;
                n2 = f*0.00057;
                n3 = f;
                n4 = f*3;
            } else if(d==4){
                n1 = f * 0.3048;
                n2 = f*0.00019;
                n3 = f*0.3333;
                n4 = f;
            }

            System.out.println("Метры " + n1 );
            System.out.println("Мили " + n2);
            System.out.println("Ярды " + n3);
            System.out.println("Футы " + n4);

        } else
            System.out.println("Вы выбрали несуществующий вариант");
    }
}
