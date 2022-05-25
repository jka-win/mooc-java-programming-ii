
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            int age = Integer.parseInt(scanner.nextLine());
            books.add(new Book(name, age));
        }

        System.out.println(books.size() + " books in total.");
        books.stream().sorted().forEach(System.out::println);
    }

    static class Book implements Comparable<Book> {
        public String name;
        public int age;

        public Book(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(MainProgram.Book o) {
            int c = Integer.compare(age, o.age);
            if (c != 0) {
                return c;
            }
            return name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return String.format("%s (recommended for %d year-olds or older)",
                name, age);
        }
    }
}
