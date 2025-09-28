import java.util.Scanner;

public class Task8 {
    public Task8(){

    }
    
    public static void main(String[ ] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        boolean result = isPalindrome(word);
        System.out.println(result);
        scn.close();
    }

    public static String reverseString(String s){
        String str = "";
        for ( int i=s.length()-1; i>=0; i--){
            str += s.charAt(i);  
        }
        return str;
    }

    public static boolean isPalindrome(String s){
        String sReverse = reverseString(s);
        if (s.equals(sReverse)){
            return true;
        } else {
            return false;
        }
    }

}
