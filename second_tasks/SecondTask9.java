import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SecondTask9 {
    public static int[] mergeUniqueSorted(int[] a, int[] b) {
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine().trim();
        String[] parts = line.split("\\],\\s*\\[");

        String arr1Str = parts[0].replace("[", "").replace("]", "").trim();
        int[] array1;
        if (arr1Str.isEmpty()) {
            array1 = new int[0];
        } else {
            String[] elements1 = arr1Str.split(",");
            array1 = new int[elements1.length];
            for (int i = 0; i < elements1.length; i++) {
                array1[i] = Integer.parseInt(elements1[i].trim());
            }
        }

        String arr2Str = parts[1].replace("[", "").replace("]", "").trim();
        int[] array2;
        if (arr2Str.isEmpty()) {
            array2 = new int[0];
        } else {
            String[] elements2 = arr2Str.split(",");
            array2 = new int[elements2.length];
            for (int i = 0; i < elements2.length; i++) {
                array2[i] = Integer.parseInt(elements2[i].trim());
            }
        }

        int[] result = mergeUniqueSorted(array1, array2);
        System.out.println(Arrays.toString(result).replace(" ", ""));
        
        scn.close();
    }
}
