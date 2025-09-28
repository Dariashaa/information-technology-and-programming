import java.util.Scanner;

public class Task7 {
    public Task7(){

    }
        public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double n1 = scn.nextInt();
        double n2 = scn.nextInt();
        double n3 = scn.nextInt();
        double result = average(n1, n2, n3);
        System.out.println(result);
        scn.close();
    }

    public static double average(double n1, double n2, double n3 ){
        double avr = (n1+n2+n3)/3;
        return avr;
    }
}