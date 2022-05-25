
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(Integer.valueOf(input));
        }

        double average = list.stream().mapToInt(x -> x).summaryStatistics().getAverage();
        System.out.println("Average of the numbers: " + average);
    }
}
