import java.util.Scanner;

public class ThirdTask7 {
    public static int countWords(String line){
        String[] arrStr = line.split("\\s+");
        return arrStr.length;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        var line = scn.nextLine().trim();
        var result = countWords(line);
        System.out.println(result);
        scn.close();
    }
    
}
