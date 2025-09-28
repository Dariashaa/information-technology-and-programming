import java.util.Scanner;

public class Task6 {
    public Task6(){

    }
        public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        String result = checkAge(age);
        System.out.println(result);
        scn.close();
    }

    public static String checkAge(int age){
        if (age >= 18){
            return "совершеннолетний";
        } else {
            return "несовершеннолетний";
        }
    }
}