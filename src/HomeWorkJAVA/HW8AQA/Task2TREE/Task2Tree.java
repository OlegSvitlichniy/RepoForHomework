package HomeWorkJAVA.HW8AQA.Task2TREE;

/*Создать класс Tree с перегруженными конструкторами.
В классе есть Tree есть поля:
String type; int height, int coutOfsticks, String colour;

Конструктор1 принимающий в параметры String type; int height
и присваивающий значение полям coutOfsticks значение 13,
colour "Зеленый".

Конструктор2 принимающий в параметры int height, int coutOfsticks,
String colour и присваивающий значение полю type "пихта".

Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
сolour = "Желтый".

Конструктор4 который принимает в параметры String type,
и вызывает внутри себя конструктор 3.

Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.*/
public class Task2Tree {
    String type;
    int height;
    int coutOfsticks;
    String colour;

    public Task2Tree(String type, int height) {
        this.type=type;
        this.height=height;
        coutOfsticks = 13;
        colour = "Зеленый";
    }

    public Task2Tree(int height, int coutOfsticks, String colour) {
        type = "Пихта";
        this.height=height;
        this.coutOfsticks=coutOfsticks;
        this.colour=colour;
    }

    public Task2Tree() {
        height = 350;
        coutOfsticks = 29;
        colour = "Желтый";
    }

    public Task2Tree (String type){
        this.type=type;
        Task2Tree task2Tree = new Task2Tree();
        this.height=task2Tree.height;
        this.coutOfsticks=task2Tree.coutOfsticks;
        this.colour=task2Tree.colour;
    }
    public void GetInfo(){
        System.out.println(type+" "+height+" "+coutOfsticks+" "+colour);
    }
}