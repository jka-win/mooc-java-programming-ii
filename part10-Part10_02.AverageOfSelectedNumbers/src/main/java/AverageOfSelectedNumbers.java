import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(Integer.valueOf(input));
        }

        System.out.println("Print the average of the negative numbers or the positive numbers?");
        System.out.print("(n/p) ");
        String choice = scanner.nextLine();
        IntStream stream = list.stream().mapToInt(x -> x);
        if (choice.equals("n")) {
            stream = stream.filter(x -> x < 0);
        } else if (choice.equals("p")) {
            stream = stream.filter(x -> x > 0);
        }
        double average = stream.summaryStatistics().getAverage();
        System.out.println("Average of the numbers: " + average);
    }
}
