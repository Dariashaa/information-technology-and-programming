package Lab5;
import java.util.regex.*;

public class CheckIP {
    public static void main(String[] args) {
        String ip = "256.213.91.61";
        String ipPattern = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
        try {
                Pattern pattern = Pattern.compile(ipPattern);
            Matcher matcher = pattern.matcher(ip);
            if (matcher.find()){
                System.out.println("ip correct!");
            } else {
                System.out.println("ip uncorrect!!!"); 
                throw new IllegalArgumentException(ip);
            }   
        } catch (PatternSyntaxException e) {
            System.err.println("Ошибка в регулярном выражении: " + e.getMessage());            
        } catch (IllegalArgumentException e) {
            System.err.println("Некорректный формат IP-адреса: " + e.getMessage());
        } catch (NullPointerException e){
            System.err.println("Текст не может равняться null " + e.getMessage());
        } catch (Exception e){
            System.err.println("Неизвестная ошибка " + e.getMessage());
        }   
    }     
}
