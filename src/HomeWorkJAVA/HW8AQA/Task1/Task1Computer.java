package HomeWorkJAVA.HW8AQA.Task1;

import java.util.Objects;

/*TASK 1*/
/*Создать класс Computer c конструктором принимающим параметры
Марка тип String, цена тип int, оперативная память тип int,
и видеокарта тип int.
Переопределить метод toString для вывода объекта класса в след. виде:

"Создан PC.
Имя = марка.
Цена = цена.
Видеокарта = объем видеокарты.
ОЗУ = Объем оперативной памяти."
Все поля класса Computer должны быть приватными.
Также создайте публичные методы для получения информации о полях класса Computer.
А также методы для изменения его полей.

Переопределите метод equals и метод hashCode для вашего класса.
Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
равны значения полей марка, оперативная память и видеокарта.
В отдельном классе создайте объект класса компьютер, и выведите в консоль
информацию о вашем объекте*/
public class Task1Computer {
    private String brend;
    private int price;
    private int ram;
    private int videocard;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task1Computer computer = (Task1Computer) o;
        return price == computer.price && ram == computer.ram && videocard == computer.videocard && Objects.equals(brend, computer.brend);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brend, price, ram, videocard);
    }
    @Override
    public String toString() {
        System.out.println("Создан новый PC.\nИмя = "+brend+".\nЦена = "+price+".\nВидеокарта = "+videocard+".\nОЗУ = "+ram+".");
        return super.toString();
    }
    public Task1Computer(String brend, int price, int ram, int videocard){
        this.brend = brend;
        this.price = price;
        this.ram = ram;
        this.videocard = videocard;
    }
    public String getBrend() {
        return brend;
    }
    public int getPrice() {
        return price;
    }
    public int getRam() {
        return ram;
    }
    public int getVideocard() {
        return videocard;
    }
    public void getInfoComputer(){
        System.out.println(getBrend());
        System.out.println(getPrice());
        System.out.println(getRam());
        System.out.println(getVideocard());
    }
    public void setBrend(String brend) {
        this.brend = brend;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setVideocard(int videocard) {
        this.videocard = videocard;
    }
}

