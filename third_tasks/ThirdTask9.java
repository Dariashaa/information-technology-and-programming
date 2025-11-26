import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask9 {
    public static int differenceMaxMin(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] - numbers[0];
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String[] numbersStr = input.replace("[", "").replace("]", "").replace(" ", "").split(",");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        int result = differenceMaxMin(numbers);
        System.out.println(result);
        scn.close();
    }
}
    

    

