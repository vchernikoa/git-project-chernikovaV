import java.util.Scanner;

/*
Итоговая задача №1
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой. Пример для теста работы программы:
Курс доллара: 67,55
Количество рублей: 1000
Итого: 14,80 долларов
 */
public class FinalTaskWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double usd = scanner.nextDouble();
        System.out.print("Введите количество рублей: ");
        int rub = scanner.nextInt();
        double result = rub/usd;
        System.out.print("Итого: " + String.format("%.2f",result) + " долларов");
    }
}
