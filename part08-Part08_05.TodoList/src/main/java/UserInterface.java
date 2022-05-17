import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("add")) {
                System.out.print("Add: ");
                String task = scanner.nextLine();
                todo.add(task);
            } else if (command.equals("remove")) {
                System.out.print("Remove: ");
                int number = Integer.parseInt(scanner.nextLine());
                todo.remove(number);
            } else if (command.equals("list")) {
                todo.print();
            } else if (command.equals("stop")) {
                break;
            }
        }
    }
}
