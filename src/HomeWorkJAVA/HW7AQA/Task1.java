package HomeWorkJAVA.HW7AQA;

/*TASK1*/
/*Написать метод, принимающий в качестве параметра массив целых чисел.
И выводит на экран все четные числа списком, a также нечетные числа списком.*/

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public void methodTask1(int[] arrayTask1) {
        int n = 0;
        int m = 0;
        System.out.println("Нечетные числа:");
        for (int odd : arrayTask1) {
            if (odd % 2 != 0) {
                ++n;
                System.out.println(n+". - " + odd);
            }
        }
        System.out.println("Четные числа:");
        for (int even : arrayTask1) {
            if (even % 2 == 0) {
                ++m;
                System.out.println(m+". - " + even);
            }
        }
    }
}



