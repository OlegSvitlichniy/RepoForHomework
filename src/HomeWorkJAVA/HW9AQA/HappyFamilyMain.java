package HomeWorkJAVA.HW9AQA;

public class HappyFamilyMain {
    static Human mortisia = new Human("Mortisia", "Adams", 1954);
    static Human gomes = new Human("Gomes", "Adams", 1950);
    static Human wednesday = new Human("Wednesday", "Adams", 15, 120, new String[][]{{"tuesday", "to be moody"}, {"thursday", "shooting to Pugsly"}});
    static Human xhavier = new Human("Xhavier", "Bonnes", 19, 100, new String[][]{{"wednesday", "a walk with wednesday"}});
    static Human pugsly = new Human("Pugslay", "Adams", 12, 70, new String[][]{{"thursday", "run from Wednesday"}, {"saturday", "fishing with a plant"}});
    static Pet it = new Pet("Hand", "It", 212, 95, new String[]{"to make a manikure", "to play a card"});
    static Family adamsFamily = new Family(mortisia, gomes);
    static Family bonnesFamily = new Family(wednesday, xhavier);

    public static void main(String[] args) {
        System.out.println("Adams family:");
        System.out.println(mortisia.toString());
        System.out.println(gomes.toString());
        adamsFamily.addChild(wednesday);
        adamsFamily.addChild(pugsly);
        adamsFamily.setPet(it);
        System.out.println(wednesday.toString());
        System.out.println(pugsly.toString());
        System.out.println(it.toString());
        it.respond();
        it.eat();
        it.foul();
        adamsFamily.deleteChild(1);
        bonnesFamily.setPet(it);
        wednesday.setSurname("Bonnes");
        System.out.println(wednesday.toString());
        System.out.println(xhavier.toString());
        System.out.println(it.toString());
        System.out.println(adamsFamily.countFamily());
        System.out.println(bonnesFamily.countFamily());





    }
}
