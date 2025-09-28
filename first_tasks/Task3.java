import java.util.Scanner;

public class Task3 {
    public Task3(){

    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int startNamber = scn.nextInt();
        int result = digitSum(startNamber);
        System.out.println(result);
        scn.close();
    }

    public static int digitSum(int a){
        a = Math.abs(a);
        int sum = 0;
        while (a > 0){
            sum += a % 10;
            a = a / 10; 
        }
        return sum;

    }
}
