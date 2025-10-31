
import java.util.Scanner;

public class SecondTask1 {
    
    public static int countDivisors(int numb){
        int count = 0;
        for (int i=1; i<=numb; i++ ){
            if (numb % i == 0){
                count++;
            }
        } return count;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numb = scn.nextInt();
        int result = countDivisors(numb);
        System.out.println(result); 
        scn.close();

    }
}
