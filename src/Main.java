// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Main {

        public static void main(String[] args) {
            String text = "aba aba a!a abba adca abea";
            //комент просто так
            Pattern pattern = Pattern.compile("(ab)+");

            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                //System.out.println(matcher.replaceAll(""));
                System.out.println(text.substring(matcher.start(), matcher.end()));
            }
            }
        }
