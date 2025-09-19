public class Palindrome {
    public static void main(String[ ] args) {
        for (int i = 0; i < args.length; i++ ) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " - палиндром");
            } else {
                System.out.println(s + " - не палиндром");
            }
        }
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
        return s.equals(sReverse);
    }

}

