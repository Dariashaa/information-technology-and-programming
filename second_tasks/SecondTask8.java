import java.util.Scanner;

public class SecondTask8 {
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine().trim();
        String clean = line.substring(1, line.length() - 1);
        String[] rows = clean.split("],\\s*\\[");
        
        int n = rows.length;
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            String cleanRow = rows[i].replace("[", "").replace("]", "");
            String[] numbers = cleanRow.split(",");
            
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(numbers[j].trim());
            }
        }
        
        int result = diagonalSum(matrix);
        System.out.println(result);
        
        scn.close();
    }
}
