package HomeWorkJAVA.HW9AQA;

import javax.xml.namespace.QName;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int IQ;
    private Pet pet;
    private Human mother;
    private Human father;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getIQ() {
        return IQ;
    }
    public void setIQ(int IQ) {
        this.IQ = IQ;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }
    public Human(String name, String surname, int year, int IQ, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }
    public Human() {
    }
    public void greetPet (){
        System.out.println("Привіт, "+ pet.getNickname());
    }
    public void describePet() {
        if (pet.getTrickLevel() < 50) {
            System.out.println("У мене є " + pet.getSpecies() + ", їй " + pet.getAge() + "років, він дуже хитрий");
        }
        if (pet.getTrickLevel() >= 50) {
            System.out.println("У мене є " + pet.getSpecies() + ", їй " + pet.getAge() + "років, він майже не хитрий");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", IQ=" + IQ +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }
}


