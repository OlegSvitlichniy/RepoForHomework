package HomeWorkJAVA.HW8AQA.Task1;

import HomeWorkJAVA.HW8AQA.Task1.Task1Computer;

import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        Task1Computer task1Computer = new Task1Computer("блаблабла", 1, 2,2);
        Task1Computer task1Computer1 = new Task1Computer("блаблабла", 2, 2,2);
        System.out.println(task1Computer.equals(task1Computer1));
        task1Computer.toString();
        task1Computer1.toString();
        }
    }


