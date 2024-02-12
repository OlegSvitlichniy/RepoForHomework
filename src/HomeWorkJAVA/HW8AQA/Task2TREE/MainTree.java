package HomeWorkJAVA.HW8AQA.Task2TREE;

import HomeWorkJAVA.HW8AQA.Task2TREE.Task2Tree;

public class MainTree {
    public static void main(String[] args) {
        Task2Tree objectForTask2Tree1 = new Task2Tree("Клен",50);
        objectForTask2Tree1.GetInfo();
        Task2Tree objectForTask2Tree2 = new Task2Tree(80,44,"Темнозеленый");
        objectForTask2Tree2.GetInfo();
        Task2Tree objectForTask2Tree3 = new Task2Tree();
        objectForTask2Tree3.GetInfo();
        Task2Tree objectForTask2Tree4= new Task2Tree("Смерека");
        objectForTask2Tree4.GetInfo();
    }
}
