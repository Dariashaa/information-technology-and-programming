import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecondTask4 {
     public static boolean hasDuplicates(String line) {
        String[] numbers = line.split(",");
        Set<String> set = new HashSet<>();
        for (String num : numbers) {
            if (!set.add(num.trim())) return true;
        }
        return false;
    }
    

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        boolean result = hasDuplicates(line);
        System.out.println(result);
        scn.close();
    } 
    
}
