import java.util.Scanner;

public class ThirdTask1 {

    public static String reverseWords(String line){
        String[] arrLine = line.split(" ");
        var newLine = "";
        for (int i = arrLine.length-1; i>=0; i-- ){
            newLine+=arrLine[i] + " ";
        }
        return newLine.strip();
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        var line = scn.nextLine();
        var result = reverseWords(line);
        System.out.println(result);
        scn.close();
    }
  
}
