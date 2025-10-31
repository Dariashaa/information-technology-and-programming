
import java.util.Scanner;

public class SecondTask3 {
    public static int sumOfPositives(String line){
        String[] numbers = line.split(",");
        int sum = 0;
        for (int i=0; i<numbers.length; i++){
            int x = Integer.parseInt(numbers[i].trim());
            if (x > 0 ){
                sum+=x;
            }

        } return sum;
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        int result = sumOfPositives(line);
        System.out.println(result);
        scn.close();
    } 
}
