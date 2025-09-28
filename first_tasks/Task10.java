import java.util.Scanner;

public class Task10 {
    public Task10(){

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numbM = scn.nextInt();
        String result = season(numbM);
        System.out.println(result);
        scn.close();

    }

    public static String season(int numbM){
        if (numbM == 12 || numbM == 1 || numbM == 2){
            return "зима";
        } else if (numbM >2  && numbM <=5){
            return "весна";
        } else if (numbM >5  && numbM <=8){
            return "лето";
        } else if (numbM >8  && numbM <=11){
            return "осень";
        } else {
            return "неверный месяц";
        }
    }
}
