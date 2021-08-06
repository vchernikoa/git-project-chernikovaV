/*
Задача №12_Работа с данными
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
Проверить, содержит ли строка подстроку “Java” (используйте contains()).
Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
 */
public class TaskWork12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean test1 = str.contains("Java");
        boolean test2 = str.startsWith("I like");
        boolean test3 = str.endsWith("!!!");

        boolean result = test1 & test2 &test3;

        if (result){
            System.out.println(str.toUpperCase());
            String changeStr = str.replaceAll("a","o");
            System.out.println(changeStr.substring(7));
        }
    }
}
