package HomeWorkJAVA;

import java.util.Random;
import java.util.Scanner;

public class HW5AQA {
    public static void main(String[] args) {
        /*Написати програму “числа”, яка загадує випадкове число та пропонує гравцеві його вгадати.
         • За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100] та
         пропонує гравцеві через консоль ввести своє ім’я, яке зберігається в змінній name.
         • Перед початком на екран виводиться текст: Let the game begin!
         • Сам процес гри обробляється у нескінченному циклі.
         • Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану кількість з тим, що ввів користувач.
         • Якщо введене число менше загаданого, програма виводить на екран текст: Your number is too small. Please, try again..
         Якщо введене число більше за загадане, то програма виводить на екран текст: Your number is too big. Please, try again.. •
         Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}! •
         Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).*/
        Random random = new Random();
        int x= random.nextInt(0,100);
        Scanner scan = new Scanner(System.in);
        System.out.println("Игра начинается)");
        System.out.println("Давайте познакомимся. Как вас зовут??");
        String theName = scan.nextLine().toUpperCase();
        System.out.println("Приятно познакомится "+theName+"!");
        System.out.println("И так "+theName+", правила игры простые. Я загадал число от 0 до 100. Попробуйте его отгадать.");
        int number= 0;
        while (number!=x) {
            System.out.println("Введите ваше число:");
            number = scan.nextInt();
            if (number < x) {
                System.out.println("Ваше число слишком маленькое. Пожалуйста, попробуйте снова...");
                continue;
            }
            if (number > x) {
                System.out.println("Ваше число слишком большое. Пожалуйста, поробуйте еще раз...");
                continue;
            }
            System.out.println("Мои поздравления " + theName + ". Вы угадали, это действительно число: " + x );
            System.out.println("...[GAME OVER]...");
            System.out.println("================================================================");
        }
        }
    }

