package HomeWorkJAVA;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW6AQA {
    public static void main(String[] args) {
        /*TASK1*/
        /*1) Пользователь задает размерность двумерного массива с клавиатуры.
Массив заполняется случайными числами от 0 до 1000.
Необходимо создать одномерный массив, состоящий из максимальных значений
каждого отдельного массива входящего в двумерный.
Новый полученный массив вывести на экран.*/
   /*     Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите две величины для вашего двухмерного массива:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] manyArray = new int[x][y];
        for (int i = 0; i < manyArray.length; i++) {
            System.out.println();
            for (int j = 0; j < y; j++) {
                manyArray[i][j] = random.nextInt(0, 1000);
            }
        }
        int[] singleArray = new int[x];
        for (int i = 0; i < manyArray.length; i++) {
            int maximum = manyArray[i][0];
            for (int k = 0; k < manyArray[i].length; k++) {
                if (manyArray[i][k] > maximum) {
                    maximum = manyArray[i][k];
                }
            }
            singleArray[i] = maximum;
        }

        for (int[] intsArr : manyArray) {
            System.out.println(Arrays.toString(intsArr));
        }
        System.out.println(Arrays.toString(singleArray)+" Этот массив является ответом на задачу");  */
        System.out.println("================================================================================");


        /*TASK 2*/
        /*Написати програму “стрільба по цілі”.
                  Технічні вимоги:
• Даний квадрат 5х5, де програма випадковим чином ставить ціль.
• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
• Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія
  знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
• Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
• Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
• Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
• Уражену ціль відзначити як x.
• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
Приклад виведення в консоль:

[0, 1, 2, 3, 4, 5]
[1, -, *, -, -, -]
[2, -, -, -, -, -]
[3, -, *, -, -, -]
[4, -, -, *, -, -]
[5, -, *, -, -, *]*/

      /*  Scanner scanForShoting = new Scanner(System.in);
        String[][] target = {{"0", "1", "2", "3", "4", "5"},
                {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"},
                {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"},
                {"5", "-", "-", "-", "-", "-"}};
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[i].length; j++) {
                System.out.print(target[i][j] + "\t");
            }
            System.out.println();
        }
        while (target[2][4]!="x") {
            System.out.println("Введите линию для стрельбы от 1 до 5:");
            int a = scanForShoting.nextInt();
            if (a<1 && a >5) {
                System.out.println("Ваше число не подходит. Повторите попытку.");
                continue;
            }
            System.out.println("Введите столбец для стрельбы от 1 до 5:");
            int b = scanForShoting.nextInt();
            if (b<1 && b>5){
                System.out.println("Ваше число не подходит. Повторите попытку.");
                continue;
            }
            if (a!=2&&b!=4){
                target[a][b]="*";
                for (int i = 0; i < target.length; i++) {
                    for (int j = 0; j < target[i].length; j++) {
                        System.out.print(target[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("....МОЛОКО....");
                System.out.println("Попробуйте еще)");
                continue;
            }
            if (a==2||b==4){
                target[2][4] = "X";
                for (int i = 0; i < target.length; i++) {
                    for (int j = 0; j < target[i].length; j++) {
                        System.out.print(target[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Поздравляю, вы  выграли))");
                break;
            }
        }   */
    }
}





























