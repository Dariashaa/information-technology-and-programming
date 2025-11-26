import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask6 {
    public static int[] filterEven(int[] arr){
        var count = 0;
        for (int num: arr){
            if (num % 2 == 0){
                count++;
            }
        }

        int index = 0;
        int[] result = new int[count];
        for (int num:arr){
            if (num % 2 == 0){
                result[index] = num;
                index++;
            }
        }
        return result;
    }

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            String line = scn.nextLine().trim();
            line = line.replace("[","").replace("]", "").replace(" ", "");
            String[] parts = line.split(",");
            int[] numbers = new int[parts.length];
                
            for (int i = 0; i < parts.length; i++) {
                numbers[i] = Integer.parseInt(parts[i]);
            }
            int[] result = filterEven(numbers);
            System.out.println(Arrays.toString(result));
            scn.close();
    }
}
