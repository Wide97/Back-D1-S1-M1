package ElseIf;

public class ElseIf {

    public void elseif(int stringPariDispari) {
        if (stringPariDispari % 2 == 0) {
            System.out.println("il numero è pari ");
        } else {
            System.out.println("il numero è dispari");
        }
    }

    public void AnnoBisestile (int Anno) {
        if ((Anno % 4 == 0 && Anno % 100 != 0) || (Anno % 400 == 0)) {
            System.out.println("L' anno è bisestile");
        } else  {
            System.out.println("L' anno NON è bisestile!");
        }
    }
}
