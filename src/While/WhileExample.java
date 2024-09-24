package While;
import java.util.Scanner;

public class WhileExample {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Inserisci una stringa (digita ':q' per uscire): ");
            input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("Uscita dal programma.");
                break;
            }

            StringBuilder result = new StringBuilder();
            for (char c : input.toCharArray()) {
                result.append(c).append(", ");
            }

            if (result.length() > 0) {
                result.setLength(result.length() - 2);
            }

            System.out.println("Caratteri separati da virgole: " + result);
        }

        scanner.close();
    }
}
