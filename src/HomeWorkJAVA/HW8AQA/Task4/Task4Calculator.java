package HomeWorkJAVA.HW8AQA.Task4;

import java.util.Scanner;

/*Создать класс калькулятор.
В нем создать методы:
summ, minus, multiply, division.
Сложение, вычитание, умножение и деление соответственно.
Каждый метод принимает в качестве параметров два значения типа double.
И выводит в консоль результат действия.
Также в классе есть метод старт. Который выводит сообщение в консоль, что
калькулятор запущен. И предлагает ввести действие в вашей консоли.

Калькулятор должен принимать только следующие типы действий:
2+4;    - пример синтаксиса сложения;
5-6;    - пример синтаксиса вычитания;
25*3;   - пример синтаксиса умножения;
34/3;   - пример синтаксиса деления;

После ввода действия на консоль выводится ответ этого действия.
И после снова выводится сообщение о предложении ввести действие.

В случае ввода другого синтаксисана консоль возвращается сообщение:
"Введите корректное действие".
И после снова выводится сообщение о предложении ввести действие.

Программа закрывается после ввода команды Stop.
Перед закрытием на консоль должно выводится сообщение:
"Калькулятор закрыт".*/
public class Task4Calculator {
    public void summ(double first, double second) {
        double result = first + second;
        System.out.println("Ответ - " + result);
    }

    public void minus(double first, double second) {
        double result = first - second;
        System.out.println("Ответ - " + result);
    }

    public void multiply(double first, double second) {
        double result = first * second;
        System.out.println("Ответ - " + result);
    }
    public void division(double first, double second) {
        double result = first / second;
        System.out.println("Ответ - " + result);
    }
    public void start() {
        System.out.println("Вы включили калькулятор!)");
        Scanner scanner = new Scanner(System.in);
        String action;
        do {
            System.out.println("Введите ваше действие");
            action = scanner.nextLine();
            if (action.equalsIgnoreCase("stop")) {
                System.out.println("Вы выключили калькулятор");
                break;
            } else if (action.contains("+")) {
                double first = Double.parseDouble(action.split("\\+")[0]);
                double second = Double.parseDouble(action.split("\\+")[1]);
                summ(first, second);
            } else if (action.contains("*")) {
                double first = Double.parseDouble(action.split("\\*")[0]);
                double second = Double.parseDouble(action.split("\\*")[1]);
                multiply(first, second);
            } else if (action.contains("-")) {
                double first = Double.parseDouble(action.split("\\-")[0]);
                double second = Double.parseDouble(action.split("\\-")[1]);
                minus(first, second);
            } else if (action.contains("/")) {
                double first = Double.parseDouble(action.split("\\/")[0]);
                double second = Double.parseDouble(action.split("\\/")[1]);
                division(first, second);
            } else {
                System.out.println("Попробуйте подобрать другое действие!");
            }
        } while (!action.equalsIgnoreCase("stop")) ;
    }

    public static void main(String[] args) {
        Task4Calculator calculator = new Task4Calculator();
        calculator.start();
    }
}

