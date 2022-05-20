import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        Pattern pattern = Pattern.compile("((25[4-5]|\\d|1\\d\\d)\\.){3}(\\d?\\d?\\d?\\d?)");
        Matcher matcher = pattern.matcher(text);
        String answer = "";
        while (matcher.find()) {
            answer = matcher.group();
            System.out.println(answer);
        }
        return answer;
    }
}