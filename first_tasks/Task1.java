import java.util.Scanner;

public class Task1 {
    public Task1(){
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        int result = toFahrenheit(C);
        System.out.println(result);
        scanner.close();
        }
    

    public static int toFahrenheit(int C){
        int F = C * 9/5 + 32;
        return F;
    }
}