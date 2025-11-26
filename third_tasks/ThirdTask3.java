import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask3 {
    public static int secondLargest(int[] arrNumb){
        Arrays.sort(arrNumb);
        var result = arrNumb[arrNumb.length-2];
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
        int result = secondLargest(numbers);
        System.out.println(result);
        scn.close();
     
    }
}