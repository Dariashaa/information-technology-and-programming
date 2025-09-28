import java.util.Scanner;

public class Task4 {
    public Task4(){

    }
    
        public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int startNamber = scn.nextInt();
        boolean result = isEven(startNamber);
        System.out.println(result);
        scn.close();
    }

    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;

    }
}


