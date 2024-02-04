package HomeWorkJAVA.HW7AQA;

import java.util.Arrays;
import java.util.Scanner;

/* Написать перегруженный метод, который может:

•	Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
•	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
•	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
•	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
•	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
     "Ваше сообщение - "%%%%%%%%", ваше число -  $",
     где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/
public class Task2 {
    public void methodForTask2(){
        System.out.println("Я пустой");
    }
    public void methodForTask2(String string){
        System.out.println("Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.");
    }
    public  void methodForTask2(String[] string3){
        for (int i = 0; i<string3.length; i++){
            System.out.print(string3[i]+ " ");
        }
    }
    public void methodForTask2(int[]array4){
        int sumArraysValue = 0;
        for (int i = 0; i < array4.length; i++) {
            sumArraysValue = sumArraysValue + array4[i];
        }
        System.out.println(sumArraysValue);
    }
    public void methodForTask2(String message,int number){
        System.out.println("Ваше сообщение - "+message+", ваше число - "+number);
    }

}
