package lab4;

public class ArrayAverage {
    public static void main(String[ ] args) {
        int[ ] arr = {};
        int sum = 0;
        try {
            for (var i= 0; i<arr.length; i++){
                sum+=arr[i];
            }
            System.out.println(sum/arr.length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Недопустимый индекс " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Деление на 0 " + e.getMessage());
    }
 }
}
    