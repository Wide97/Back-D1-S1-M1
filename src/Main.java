import ElseIf.ElseIf;
import ForExample.ForExample;
import Switch.Switch;
import While.WhileExample;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ElseIf PariDispari = new ElseIf();

        PariDispari.elseif(22);
        PariDispari.elseif(45);

        PariDispari.AnnoBisestile(2000);
        PariDispari.AnnoBisestile(1945);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a 3:");

        int numero = scanner.nextInt();

        Switch intero = new Switch();

        intero.eseguiSwitch(numero);

        System.out.print("Inserisci un numero: ");
        int cifra = scanner.nextInt();

        // Crea un'istanza di ForExample
        ForExample forExample = new ForExample();
        forExample.number(cifra);



        scanner.close();



    }
}