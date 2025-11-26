package lab4.Throwable;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static String file = "exceptions.txt";
    private static DateTimeFormatter formatter = 
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void logException(Exception e) {
        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
            
            String timestamp = LocalDateTime.now().format(formatter);
            out.println(timestamp);
            out.println("Тип исключения: " + e.getClass().getSimpleName());
            out.println("Сообщение: " + e.getMessage());
            out.println();
            
        } catch (IOException ioException) {
            System.err.println("Ошибка записи: " + ioException.getMessage());
        }
    }
}
