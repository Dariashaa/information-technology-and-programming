import java.util.Scanner;

public class Task5 {
    public Task5(){

    }
        public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        String result = daysToWeeks(number);
        System.out.println(result);
        scn.close();
    }

    public static String daysToWeeks(int number){
        int weeks = number / 7;
        int days = number % 7;
        
        String weeksText = "";
        if (weeks == 1) {
            weeksText = "неделя";
        } else if (weeks >= 2 && weeks <= 4) {
            weeksText = "недели";
        } else {
            weeksText = "недель";
        }
        
        String daysText = "";
        if (days == 1) {
            daysText = "день";
        } else if (days >= 2 && days <= 4) {
            daysText = "дня";
        } else {
            daysText = "дней";
        }
        
        return weeks + " " + weeksText + " и " + days + " " + daysText;
    }
}