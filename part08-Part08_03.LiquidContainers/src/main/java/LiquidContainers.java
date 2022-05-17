
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (amount > 0) {
                if (command.equals("add")) {
                    first = Math.min(first + amount, 100);
                } else if (command.equals("move")) {
                    amount = Math.min(first, amount);
                    first -= amount;
                    second = Math.min(second + amount, 100);
                } else if (command.equals("remove")) {
                    second = Math.max(second - amount, 0);
                }
            }
        }
    }

}
