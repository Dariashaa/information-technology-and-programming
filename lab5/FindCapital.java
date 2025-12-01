package Lab5;
import java.util.regex.*;

public class FindCapital {
    public static void main(String[] args) {
        String text = "hfdjD kjsdSjff вораФвллоФ";
        StringBuilder newText = new StringBuilder();
        Pattern pattern = Pattern.compile("[a-zа-я][А-ЯA-Z]");
        Matcher matcher = pattern.matcher(text);

        int lastIndex = 0;

        while (matcher.find()) {
            newText.append(text, lastIndex, matcher.start());
            newText.append("!").append(matcher.group()).append("!");
            lastIndex = matcher.end();
        }
        newText.append(text, lastIndex, text.length());
        System.out.println(newText);
    }
}