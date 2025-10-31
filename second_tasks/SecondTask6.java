import java.util.Scanner;

public class SecondTask6 {
    public static int clamp(int value, int min, int max){
        return Math.max(min, Math.min(value, max));
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        String[] numbers = line.split(",");
        int a = Integer.parseInt(numbers[0].trim());
        int b = Integer.parseInt(numbers[1].trim());
        int c = Integer.parseInt(numbers[2].trim());
        int result = clamp(a,b,c);
        System.out.println(result);
        scn.close();
    }
    
}
