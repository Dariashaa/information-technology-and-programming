package lab4;
import java.io.*;

public class workFiles {

    public static void copyFile(String forCopy, String copiied){
        try (FileInputStream fis = new FileInputStream(forCopy);
            FileOutputStream fos = new FileOutputStream(copiied)) {

            int bytes;
            while ((bytes = fis.read()) != -1){
                fos.write(bytes);
            }
            System.out.println("Файл из "+ forCopy + " в "+ copiied +" успешно скопирован.");
            
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден. " + e.getMessage());
        } catch (IOException e){
            System.err.println("Ошибка ввода/вывода во время копирования: " + e.getMessage());
            analyzeIOException(e, forCopy, copiied);
        }
    }

     private static void analyzeIOException(IOException e, String forCopy, String copied) {
        String message = e.getMessage().toLowerCase();
            
        if (message.contains("disk") || message.contains("space")) {
            System.err.println("Проблема с диском: возможно нехватка места");
            
        } else if (message.contains("corrupt") || message.contains("format")) {
            System.err.println("Проблема с форматом файла или повреждение данных");
            
        } else {
            System.err.println("Общая ошибка ввода-вывода");
        }    
    }

    public static void main(String[] args){
        String forCopyfile = "forCopy.txt";
        String copiedFile = "copied.txt";
        copyFile(forCopyfile, copiedFile);

        IOException artificialException = new IOException("Диск переполнен");
        IOException artificialException2 = new IOException("Disk full - no space left on device");
        analyzeIOException(artificialException, "forCopy.txt", "copied.txt");
        analyzeIOException(artificialException2, "forCopy.txt", "copied.txt");

    }
    
}
