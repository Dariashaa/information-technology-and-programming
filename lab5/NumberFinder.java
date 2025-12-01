package Lab5;
import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text ="Success is 4563not final, failure is not f312639atal ";
        try {
            Pattern pattern = Pattern.compile("\\d+\\.?\\d+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
            System.out.println(matcher.group());  
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
