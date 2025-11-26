import java.util.Scanner;

public class ThirdTask4 {
    public static int sumOfDigits(int a){
            a = Math.abs(a);
            int sum = 0;
            while (a > 0){
                sum += a % 10;
                a = a / 10; 
            }
            return sum;
        }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int startNamber = scn.nextInt();
        int result = sumOfDigits(startNamber);
        System.out.println(result);
        scn.close();
    }  
}
