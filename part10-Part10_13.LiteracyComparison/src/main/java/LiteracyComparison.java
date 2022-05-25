
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(l -> l.split(","))
                    .map(s -> new Literacy(s[2], s[3], Integer.parseInt(s[4]), Double.parseDouble(s[5])))
                    .sorted((a, b) -> Double.compare(a.rate, b.rate))
                    .forEach(System.out::println);
        } catch (IOException e) {

        }
    }

    static class Literacy {
        public String gender;
        public String country;
        public int year;
        public double rate;

        public Literacy(String gender, String country, int year, double rate) {
            this.gender = gender.split(" ")[1].trim();
            this.country = country;
            this.year = year;
            this.rate = rate;
        }

        @Override
        public String toString() {
            return String.format("%s (%d), %s, %s",
                country, year, gender, rate);
        }
    }
}
