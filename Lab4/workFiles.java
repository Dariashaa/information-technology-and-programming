package lab4;
import java.io.*;

public class workFiles {

    public static void copyFile(String forCopy, String copiied){
        try (FileReader reader = new FileReader(forCopy);
            FileWriter writer = new FileWriter(copiied)) {

            int bytes;
            while ((bytes = reader.read()) != -1){
                writer.close();
                writer.write(bytes);
            }
            System.out.println("Файл из "+ forCopy + " в "+ copiied +" успешно скопирован.");
            
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден. " + e.getMessage());
        } catch (IOException e){
            System.err.println("Ошибка ввода/вывода во время копирования: " + e.getMessage());
            analyzeIOException(e);
        }
    }

     private static void analyzeIOException(IOException e) {
        String message = e.getMessage().toLowerCase();
            
        if (message.contains("disk") || message.contains("space")) {
            System.err.println("Проблема с диском: возможно нехватка места"); 
        } else if (message.contains("corrupt") || message.contains("format")) {
            System.err.println("Проблема с форматом файла или повреждение данных");    
        } else if (message.contains("stream")) {
            System.err.println("Проблема с закрытием потока");
        }else {
            System.err.println("Общая ошибка ввода-вывода");
        }    
    }

    public static void main(String[] args){
        copyFile("forCopy.txt", "new.txt" );
        copyFile("someoneFile.txt", "Copy.txt");

        // IOException artificialException = new IOException("Диск переполнен");
        // IOException artificialException2 = new IOException("Disk full - no space left on device");
        // analyzeIOException(artificialException);
        // analyzeIOException(artificialException2);
    } 
}
