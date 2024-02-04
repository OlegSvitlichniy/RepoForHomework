package HomeWorkJAVA;





import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4AQA {
    public static void main(String[] args) {


        /*TASK1*/
   /* Написать программу, которая будет считывать введенные пользователем с клавиатуры слова,
   и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP.
   Все слова введенные до этого должны отобразится в консоли одним предложением.*/
     /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String stringTask1 = scanner.nextLine();
        String summaryStrings = "";
        while (!stringTask1.equalsIgnoreCase("STOP")){
            summaryStrings = stringTask1+ " " + summaryStrings;
            System.out.println(summaryStrings);
            System.out.println("Введите слово:");
             stringTask1 = scanner.nextLine();
        }
        System.out.println(summaryStrings);  */


        /* System.out.println("==================================================================");*/


        /*TASK2*/
        /*Написать программу в которой пользователь вводит с клавиатуры число,
        а программа определяет, является она полиндромом или нет.
        И выводит данную информацию на экран.*/
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число:");
        String thenumber = scanner.nextLine();
        String revertNumber = "";
        for (int index = thenumber.length() - 1; index >= 0; index--){
            revertNumber = revertNumber + thenumber.charAt(index);
        }
        System.out.println(thenumber);
        System.out.println(revertNumber);
        if(thenumber.equals(revertNumber)){
            System.out.println("Ваше число является полиндромом");
        } else {
            System.out.println("Ваше число Не является полиндромом");
        }*/


        /*TASK3*/

        /* Написать проограмму, условно для склада приема металла.
        Представим, что склад может хранить определенный вес металла.
        Пользователь вводит с клавиатуры вес, который может хранится на складе.
        Дальше пользователь вводит с клавиатуры вес, который условно собирается сдать на склад пользователь.
        Программа должна после каждой сдачи металла показывать сколько веса еще может принять склад.
        Если пользователь хочет сдать металла больше чем осталось места на складе, то программа не дает ему это сделать
        и уведомляет пользователя, о невозможности данной операции.
        Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает о невозможности приемки такого малого веса.
        Программа завершается, когда место на складе закончилось.  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вместимость вашего склада:");
        int capacity = scanner.nextInt();
        int balanceOnYourStock = 0;
        while (balanceOnYourStock < capacity) {
            System.out.println("Введите вес метала который хотите сдать");
            int weightMetal = scanner.nextInt();
            if (weightMetal > (capacity-balanceOnYourStock)) {
                System.out.println("Вы превысили допустимый лимит. Рекомендую вам сдать меньше металла или поискать другой склад)");
                continue;
            }
            if (weightMetal < 5) {
                System.out.println("Минимальный вес приема металла 5 кг. Попробуйте еще)");
                continue;
            }
            balanceOnYourStock = balanceOnYourStock + weightMetal;
            System.out.println("Вы сдали металл количеством: " + weightMetal + "кг. На складе находиться: " + (balanceOnYourStock) + "кг металла. Вы можете еще сдать: " + (capacity - balanceOnYourStock) + "кг металла.");
        }
        System.out.println("Вы заполнили своим металом весь склад!! Спасибо вам!!");
    }


        /*TASK4*/
        /*Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”.
        Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20.
        Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”.
        Пользователь вводит три числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов.
        Пример1. после ввода 3,2,1: На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00”
        Пример2. после ввода 1,2,3: На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”*/
   /*     Scanner scannerTask4 = new Scanner(System.in);
        String names[] ={"Петя","Маша","Алена","Федя","Саша","Антон","Глеб"};
        String places[] ={"школу","магазин","церковь","тренажерный зал","кино","поликлиннику"};
        int numbers[] = {10,12,14,16,18,20};

        System.out.println("Введите три числа:)");
        int name = scannerTask4.nextInt();
        int place = scannerTask4.nextInt();
        int number = scannerTask4.nextInt();
        System.out.println(names[name]+" будет идти в "+ places[place]+"в "+ numbers[number]+":00");   */


      /*  System.out.println("======================================================"); */

        /*TASK5*/
        /*Есть одномерный массив из 10 элементов, заполненный случайными числами.
        Пользователь вводит с клавиатуры число.
        Программа показывает есть ли такое число в созданном до этого массиве.*/
     /*   Scanner scanNumber = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanNumber.nextInt();
        Random randomX = new Random();
        int numbT5[];
        numbT5 = new int[10];
            for (int i = 0; i < 10; i++){
                numbT5[i]=randomX.nextInt(100)+1;
                System.out.println(Arrays.toString(numbT5));
                if (numbT5[i]==number) {
                    System.out.println("Ваше число есть в массиве");
                }
                if(numbT5[i]!=number){
                    System.out.println("Вашего числа нет в массиве");
            }
        }*/

       /* System.out.println("======================================================");*/

        /*TASK6*/
        /*Заполнить массив на 45 элементов случайными числами от -50 до +50.
        Найти минимальный элемент и вывести его на консоль.
        Найти максимальный элемент и вывести его на консоль.*/
   /*     Random random = new Random();
        int[] forArray = new int[45];
        int minValue =51;
        int maxValue =-51;
        for (int i = 0; i < forArray.length; i++){
            forArray[i] = random.nextInt(-50,50);
            System.out.println(forArray[i]);
            if (forArray[i]<minValue){
                minValue = forArray[i];
            }
            if (forArray[i]>maxValue){
                maxValue=forArray[i];
            }
        }
        System.out.println("Минимальное значение в масиве = "+minValue);
        System.out.println("Максимальное значение в масиве= "+maxValue);   */



        /*Решение задачи при помощи Stream*/
        /*System.out.println(Arrays.toString(forArray));
        int min = Arrays.stream(forArray).min().getAsInt();
        System.out.println("Минимальное число массива: " + min);
        int max = Arrays.stream(forArray).max().getAsInt();
        System.out.println("Максимальное число массива: " + max);*/






    }
