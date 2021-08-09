import java.util.Scanner;

/*
Итоговая задача №2
Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’. Первым, третьим и пятым символом
являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке. Нужно найти неизвестное.
Пример для теста работы программы:
Ввод: x+5=7
Вывод: 2
Ввод: 3-x=9
Вывод: -6
Ввод: 3-3=x
Вывод: 0
 */
public class FinalTaskWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение с неизвестной х: ");
        String str = scanner.next();
        char oneNumber = str.charAt(0);
        char twoNumber = str.charAt(2);
        char threeNumber = str.charAt(4);
        char symbol = str.charAt(1);
        int result = 0;
        if(oneNumber == 'x') {
            int two = Character.getNumericValue(twoNumber);
            int three = Character.getNumericValue(threeNumber);
            if (symbol == '-') {
                result = three + two;
            } else if (symbol == '+'){
                result = three - two;
            }
            //System.out.println("Неизвестное = " + result);
        } else if (twoNumber == 'x'){
            int one = Character.getNumericValue(oneNumber);
            int three = Character.getNumericValue(threeNumber);
            if (symbol == '-') {
                result = one - three ;
            } else if (symbol == '+'){
                result = three - one;
            }
        } else if (threeNumber == 'x'){
            int one = Character.getNumericValue(oneNumber);
            int two = Character.getNumericValue(twoNumber);
            if (symbol == '-') {
                result = one - two ;
            } else if (symbol == '+'){
                result = one + two;
            }
        }
        System.out.println("x = " + result);
    }
}
