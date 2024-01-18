package HomeworkAQAjava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*TASK 1*/
        /*У вас есть строка "Я тестирую замечательно. Что еще нужно?", которую нужно ввести с клавиатуры в консоль.
Необходимо при помощи только  метода next() класса Scanner (не используем метод nextLine()) присвоить перемнным типа String следующие значения:
string1 = Я
string2 = тестирую
string3 = замечательно
string4 = Что еще нужно?
Помимо string1, string2, string3, string4 новых переменных
создавать нельзя.*/

    /*    Scanner scanT1 = new Scanner(System.in);
        System.out.println("Введите ваш текст");
        String string1 = scanT1.next();
        String string2 = scanT1.next();
        String string3 = scanT1.next();
        String string4 = scanT1.next()+" "+scanT1.next()+ " "+scanT1.next();

        System.out.println(string1+" "+string2+" "+string3+" "+string4 + " ");

        System.out.println("=========================================================================================");
*/
        /*TASK 2*/
        /*Пользователь вводит с клавиатуры три целочисленных значения. На экран выводится информация можно ли из этих сторон
построить треугольник. (необходимо вспомнить правило построения треугольника по трем сторонам).*/

     /*   System.out.println("Введите три целочисленных числа:");
        Scanner scanForTringle = new Scanner(System.in);
        int a = scanForTringle.nextInt();
        int b = scanForTringle.nextInt();
        int c = scanForTringle.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник с такими сторонами существует.");
        }
        else{
            System.out.println("Треугольник с такими сторонами НЕ существует.");}

        System.out.println("=========================================================================================");
      */
        /*TASK 3*/
        /*3)
При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры,
и всегда отнимать от большего меньшее.
Вывести эту разность в консоль.*/
    /*    System.out.println("Пожалуйста введите два числа:");
        Scanner scannerThirdTask = new Scanner(System.in);
        int numberD = scannerThirdTask.nextInt();
        int numberE = scannerThirdTask.nextInt();
        int result = numberD>numberE ? numberD-numberE:numberE-numberD;
        System.out.println(result);
        System.out.println("=========================================================================================");
        */

        /*TASK 4*/

      /*  (Использовать операторы if-else-if)
        Пользоватьель вводит с клавиатуры числа:
        Если число равно 1, то выводин на консоль "Понедельник";
        Если число равно 2, то выводин на консоль "Вторник";
        Если число равно 3, то выводин на консоль "Среда";
        Если число равно 4, то выводин на консоль "Четверг";
        Если число равно 5, то выводин на консоль "Пятница";
        Если число равно 6, то выводин на консоль "Суббота";
        Если число равно 7, то выводин на консоль "Воскресенье";
        В противном случае выводим текст: "Лучше бы сегодня была пятница".*/

     /*   System.out.println("Пожалуйста введите число от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Понедельник");
        } else if (number == 2) {
            System.out.println("Вторник");
        } else if (number == 3) {
            System.out.println("Среда");
        } else if (number == 4) {
            System.out.println("Четверг");
        } else if (number == 5) {
            System.out.println("Пятница");
        } else if (number == 6) {
            System.out.println("Суббота");
        } else if (number == 7) {
            System.out.println("Воскресенье");
        } else if (number <= 1|| number >= 7) {
            System.out.println("Лучше бы сегодня была пятница");
            System.out.println("=========================================================================================");
        }*/

        /*TASK 5*/
        /*Написать программу, используя тернарный оператор,
        где пользователь вводит с клавиатуры два числа и символ - или + или % или / или *.
        На экран выводится резултат действия над двумя введенными числами.
        Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите операцию (+, -, *, /, %): ");
        char operation = scanner.next().charAt(0);
        int result = (operation == '+') ? a + b :
                (operation == '-') ? a - b :
                        (operation == '*') ? a * b :
                                (operation == '/') ? a / b :
                                        (operation == '%') ? a % b : 0;
        System.out.println("Результат: " + result);
        System.out.println("=========================================================================================");

*/

        /*TASK 6*/
        /*Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы.
        Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows.
        Программа должна спросить пользователя какая программа ему интересна, также спросить какую ОС он использует,
        а после вывести в консоль необходимую ссылку. Если программа с таким названием не существует выводит сообщение в консоль, о том что такой программы не существует.
        Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том что такой ОС не существует.
         */
      /*  Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите программу которую требуется скачать: \nIntelliJ Idea\nGIT\nJava");
        String program = scanner.nextLine().toLowerCase();

        System.out.println("Пожалуйста, введите вашу ОС: \nWindows\nLinux\nMacOS");
        String OS = scanner.nextLine().toLowerCase();

        switch (program + OS) {
            case ("Intellij Idea + Windows"):
                System.out.println("Ссылка на скачивание Intellij Idea для Windows");
                break;
            case ("Intellij Idea + Linux"):
                System.out.println("Ссылка на скачивание Intellij Idea для Windows");
                break;
            case ("Intellij Idea + Macos"):
                System.out.println("Ссылка на скачивание Intellij Idea для Windows");
                break;
            case ("GIT + Windows"):
                System.out.println("Ссылка на скачивание Intellij Idea для Windows");
                break;
            case ("GIT + Linux"):
                System.out.println("Ссылка на скачивание Intellij Idea для Windows");
                break;
            case ("GIT + MacOS"):
                System.out.println("Ссылка на скачивание Intellij Idea для Windows");
                break;
            case ("Java + Windows"):
                System.out.println("Ссылка на скачивание Intellij Idea для Windows");
                break;
            case ("Java + Linux"):
                System.out.println("Ссылка на скачивание Intellij Idea для Windows");
                break;
            case ("Java + MacOS"):
                System.out.println("Ссылка на скачивание Intellij Idea для Windows");
                break;
            default:
                System.out.println("Данной системы нет в природе");
        }*/
    }
}


