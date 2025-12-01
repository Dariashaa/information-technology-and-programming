package Lab5;
import java.util.regex.*;

public class PasswordCheck {
    public static void main(String[] args) {
        String password = "d1ahfiero2";
        try{
           Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,16}");
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()){
                System.out.println("Password correct!");
            } else {
                System.out.println("Password uncorrect!!!"); 
            } 
        } catch ( PatternSyntaxException e){
            System.err.println("Ошибка в регулярном выражении:" + e.getMessage());
        } catch (NullPointerException e){
            System.err.println("Текст не может равняться null" + e.getMessage());
        } catch (Exception e){
            System.err.println("Неизвестная ошибка" + e.getMessage());
        } 
    }  
}
