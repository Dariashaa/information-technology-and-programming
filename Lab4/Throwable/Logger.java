package lab4.Throwable;
import java.io.*;

public class Logger {
    public static void logException(Exception e) {
        try (FileWriter writer = new FileWriter("exception.txt", true)){
            writer.write("Тип исключения: " + e.getClass().getSimpleName()+"\n");
            writer.write("Сообщение: " + e.getMessage()+ "\n");
            writer.write("\n");
            
        } catch (IOException ioException) {
            System.err.println("Ошибка записи: " + ioException.getMessage());
        }
    }
}
