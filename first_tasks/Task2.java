import java.util.Scanner;

public class Task2 {
    public Task2(){
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double result = Square(a, b);
        System.out.println(result);
        scanner.close();
        }
    

    public static double Square(double a, double b){
        double S = a * b;
        return S;
    }
}

