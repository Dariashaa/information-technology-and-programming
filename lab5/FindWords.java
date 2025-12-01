package Lab5;
import java.util.regex.*;

public class FindWords {
    public static void main(String[] args) {
        String text = "Hi djfl Mom ksdkl Kid";
        String symb = "k";
        try {
            Pattern pattern = Pattern.compile("\\b"+symb+"\\w+");
            Matcher matcher = pattern.matcher(text.toLowerCase());
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
