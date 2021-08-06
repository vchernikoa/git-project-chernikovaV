import java.util.Scanner;

/*
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
Например: “I love java 8 Я люблю java 14 core1”.
Выполните следующие действия:
Выведите слова, состоящие только из латиницы.
Выведите количество этих слов.
 */
public class TaskWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами");
        String str = scanner.nextLine();
        String[] arrStr = str.split(" ");

        for (int i = 0; i<arrStr.length; i++){
            boolean onlyLatinAlphabet = arrStr[i].matches("^[a-zA-Z]+$");
            if(onlyLatinAlphabet){
                System.out.println(arrStr[i]);
            }
        }
    }
}
