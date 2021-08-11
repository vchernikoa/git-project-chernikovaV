import java.util.Scanner;

/*
Итоговая задача №4
Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”.

У пользователя есть 3 попытки, чтобы отгадать загадку.
Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
Если пользователь, использовавший подсказку, ошибется,
вывести “Обидно, приходи в другой раз” и завершить работу.
 */
public class FinalTaskWork04 {
    public static void main(String[] args) {
        System.out.println ("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner csanner = new Scanner (System.in);
        String answer = null;
        boolean exit = false;


        for(int i = 1; i <= 3; i++){
            if (exit == true)
                break;
            answer = csanner.nextLine ();
            if(i == 1){
                switch (answer){
                    case ("Заархивированный вирус"):
                        System.out.println ("Правильно!");
                        exit = true;
                        break;
                    case ("Подсказка"):
                        System.out.println ("Червь");
                        answer = csanner.nextLine ();
                        if (answer.equals("Заархивированный вирус")){
                            System.out.println ("Правильно!");
                        } else System.out.println ("Обидно, приходи в другой раз");
                        exit = true;
                        break;
                    default:
                        System.out.println("Подумай еще!");
                }
            } else if (i ==2) {
                switch (answer) {
                    case ("Заархивированный вирус"):
                        System.out.println("Правильно!");
                        exit = true;
                        break;
                    case ("Подсказка"):
                        System.out.println("Подсказка уже недоступна");
                        i = 1;
                        break;
                    default:
                        System.out.println("Подумай еще!");
                }
            } else if (i ==3){
                switch (answer) {
                    case ("Заархивированный вирус"):
                        System.out.println("Правильно!");
                        exit = true;
                        break;
                    case ("Подсказка"):
                        System.out.println("Подсказка уже недоступна");
                        i = 2;
                        break;
                    default:
                        System.out.println("Обидно, приходи в другой раз");
                }
            }

        }
    }
}
