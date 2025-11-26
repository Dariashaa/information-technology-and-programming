import java.util.Scanner;

public class ThirdTask2 {
    public static int countVowels(String line){
        var vowels = "aeiouAEIOU";
        var result = 0;
        for (var i = 0;i< line.length();i++){
            if (vowels.indexOf(line.charAt(i)) != -1){
                result++;
            }
        } 
        return result;
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        var line = scn.nextLine();
        int result = countVowels(line);
        System.out.println(result);
        scn.close();
    }
}
