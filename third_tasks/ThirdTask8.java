import java.util.Scanner;

public class ThirdTask8 {
    public static int fibonacci(int numb){
        if (numb<=1){
            return numb;
        }
        return fibonacci(numb-1)+fibonacci(numb - 2);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        var line = scn.nextInt();
        var result = fibonacci(line);
        System.out.println(result);
        scn.close();
    }
}
