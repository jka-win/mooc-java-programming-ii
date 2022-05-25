import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    public boolean isDayOfWeek(String string) {
        return Pattern.matches("mon|tue|wed|thu|fri|sat|sun", string);
    }

    public boolean allVowels(String string) {
        return Pattern.matches("^[aeiou]*$", string);
    }

    public boolean timeOfDay(String string) {
        Pattern p = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        Matcher m = p.matcher(string);
        if (!m.matches()) {
            return false;
        }

        int hour = Integer.parseInt(m.group(1));
        int minute = Integer.parseInt(m.group(2));
        int second = Integer.parseInt(m.group(3));
        return hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60;
    }
}
