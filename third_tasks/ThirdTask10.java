import java.util.Scanner;

public class ThirdTask10 {
    public static boolean isTriangle(int a, int b, int c){
        if (a+b>c && b+c>a && c+a>b){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        var line = scn.nextLine().split(", ");
        var a = Integer.parseInt(line[0]);
        var b = Integer.parseInt(line[1]);
        var c = Integer.parseInt(line[2]);
        boolean result = isTriangle(a, b, c);
        System.out.println(result);
        scn.close();
    }
}
