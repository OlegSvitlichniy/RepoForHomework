package HomeWorkJAVA.HW7AQA;

import java.util.Arrays;
import java.util.Random;

public class MainForHW7 {

    /*Task1*/
    public static void main(String[] args) {
        Random randomTask1 = new Random();
        int[] arrayForTask1 = new int[10];
        for (int i = 0; i < arrayForTask1.length; i++) {
            arrayForTask1[i] = randomTask1.nextInt(1, 20);
        }
        System.out.println(Arrays.toString(arrayForTask1));
        System.out.println();
        Task1 task = new Task1();
        task.methodTask1(arrayForTask1);
        System.out.println("============================");
        System.out.println("============================");
        System.out.println("============================");
        /*Task2*/
        String stringForTask2=".......";
        String arrayStrings[] ={"Ким Чен Ин","Ким Чен Ыр","Ким Ир Сен"};
        int arrayOfNumbers[] = {1,2,3,4,5,6,7,8,9};

        Task2 task2 = new Task2();
        task2.methodForTask2();
        System.out.println("============================");
        Task2 task21 = new Task2();
        task21.methodForTask2(stringForTask2);
        System.out.println("============================");
        Task2 task22 = new Task2();
        task22.methodForTask2(arrayStrings);
        System.out.println();
        System.out.println("============================");
        Task2 task23 = new Task2();
        task23.methodForTask2(arrayOfNumbers);
        System.out.println("============================");
        Task2 task24 = new Task2();
        task24.methodForTask2("СООБЩЕНИЕ",69);
        System.out.println("============================");
        System.out.println("============================");
        System.out.println("============================");


        /*Task3Conspect*/

        Task3Conspect student = new Task3Conspect();
        student.theNameOfStudent="ОЛЕГ СВЕТЛИЧНЫЙ";
        student.theNameOfMatter = "JAVA";
        student.theCountOfPages= 150;
        student.theYearOfGraduation=2024;
        student.theColorOfCover="Синяя";
        student.theNameOfUniversity="DAN.IT";

    }
}