import java.util.Scanner;
import java.util.Arrays;

public class SecondTask5 {
    public static int[] rotateRight(int[] arr, int k){
        
        if (arr.length == 0 || k == 0) {
            return arr.clone();
        }

        int shift  = k % arr.length;

        if (shift == 0) {
        return arr.clone();
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < shift; i++){
            result[i] = arr[arr.length-shift+i]; 
        }
        for (int i = shift; i < arr.length; i++){
            result[i] = arr[i-shift];
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine().trim();
        String[] parts = line.split("],");

        String arrayStr = parts[0].replace("[", "").trim();
        int[] array;
        
        if (arrayStr.isEmpty()) {
            array = new int[0];
        } else {
            String[] elements = arrayStr.split(",");
            array = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                array[i] = Integer.parseInt(elements[i].trim());
            }
        }
        
        int k = Integer.parseInt(parts[1].trim());

        int[] result = rotateRight(array,k);
        System.out.println(Arrays.toString(result));
        scn.close();
    }
}
