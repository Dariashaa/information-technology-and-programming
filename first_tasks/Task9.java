import java.util.Scanner;

public class Task9 {
    public Task9(){
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        boolean result = isPrime(number);
        System.out.println(result);
        scn.close();

   }

    public static boolean isPrime(int n){
        if (n <=1 ) return false;
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

}
