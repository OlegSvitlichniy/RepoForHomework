package HomeworkAQAjava;

public class HomeWork2 {
    public static void main(String[] args) {

        /* TASK 1*/
       String string1 = "This line that i want to cut, cause it is too long";
       String string2 = "This line that i want to cut, cause it is too long".substring(0 , 35);
       String string3 = "This line that don't want to cut, cause it is perfect".substring(0 , 35);

        System.out.println(string1 + " = " + string1.length());
        System.out.println(string2 + " = " + string2.length());
        System.out.println(string3 + " = " + string3.length());


        /*TASK 2*/
        String jobtextTask2 ="Testing is my favourite job";
        String[] splitJobTask2 = jobtextTask2.split(" ");
        int solitJT = splitJobTask2.length;
        System.out.println(solitJT);
        String word1 = splitJobTask2[0];
        String word2 = splitJobTask2[1];
        String word3 = splitJobTask2[2];
        String word4 = splitJobTask2[3];
        String word5 = splitJobTask2[4];
        System.out.println("The word1"+" "+"="+" "+word1+" "+","+" "+"the length of this word"+" "+"="+word1.length());
        System.out.println("The word2"+" "+"="+" "+word2+" "+","+" "+"the length of this word"+" "+"="+word2.length());
        System.out.println("The word3"+" "+"="+" "+word3+" "+","+" "+"the length of this word"+" "+"="+word3.length());
        System.out.println("The word4"+" "+"="+" "+word4+" "+","+" "+"the length of this word"+" "+"="+word4.length());
        System.out.println("The word5"+" "+"="+" "+word5+" "+","+" "+"the length of this word"+" "+"="+word5.length());
        /*
        int a = word1.length();
        int b = word2.length();
        int c = word3.length();
        int d = word4.length();
        int e = word5.length();
        boolean comparison = a>b&a>c&a>d&a>e;
       System.out.println(comparison);*/

        if (word1.length()>word2.length()&word1.length()>word3.length()&word1.length()>word4.length()&word1.length()>word5.length()){
         System.out.println("True");}
        else {
         System.out.println("False");}

        /*TASK 3*/
     String text3 = "Completely random text in English. "
             + "In it, we just need to determine how many times the character 'a' occurs there. "
             + "And we can use the split method and the length method.";
     String[] splittext3 = text3.split("a");
     int splitT3 = splittext3.length-1;
     System.out.println(splitT3);

    }
}












