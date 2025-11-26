import java.util.Scanner;

public class ThirdTask5 {
    public static boolean isAnagram(String a, String b){
        for (var i = 0;i< a.length();i++){
            if (b.indexOf(a.charAt(i)) == -1){
                return false;
            }
        } 
        return true;
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        var line = scn.nextLine().split(", ");
        var a = line[0].toLowerCase();
        var b = line[1].toLowerCase();
        boolean result = isAnagram(a, b);
        System.out.println(result);
        scn.close();
    }
    
}
