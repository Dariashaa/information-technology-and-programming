
import java.util.Scanner;

public class SecondTask7 {

    public static int[] countEvenOddDigits(Integer numb){
        int[] evenOdd = new int[2];
        if (numb == 0) {
            evenOdd[0] = 1; 
            return evenOdd;
        }
        while (Math.abs(numb)>0) {
            if ((numb%10)%2 == 0){
                evenOdd[0]++;
            } else {
                evenOdd[1]++;
            }
            numb/=10;
        } return evenOdd;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numb = scn.nextInt();
        int[] result = countEvenOddDigits(numb);
        System.out.println(result[0]+ ", "+ result[1]);
        scn.close();
    }
}
