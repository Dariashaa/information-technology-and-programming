import java.util.Scanner;

public class SecondTask2 {
    public static int sumRange(int a, int b){
        int sum = 0;
        for (int i = a; i<=b; i++){
            sum+=i;
        }
        return sum;
    } 

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        String[] numbers = line.split(",");
        int a = Integer.parseInt(numbers[0].trim());
        int b = Integer.parseInt(numbers[1].trim());
        int result = sumRange(a,b);
        System.out.println(result);
        scn.close();
    }
}
