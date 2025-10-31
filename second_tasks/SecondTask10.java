import java.util.Scanner;

public class SecondTask10 {
        public static String grade(int numb){ 
            if (numb < 0 || numb >100){
                return "Invalid";
            } else if (numb >= 90){
                return "A";        
            } else if (numb >= 80){
                return "B";
            } else if (numb >= 70){
                return "C";
            } else if (numb >= 60 ){
                return "D";
            } else {
                return "F";     
        } 
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numb = scn.nextInt();
        String result = grade(numb);
        System.out.println(result);
        scn.close();
    } 
}