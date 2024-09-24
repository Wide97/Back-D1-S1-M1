package Switch;

public class Switch {
    public void eseguiSwitch (int numero) {
        switch (numero) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:System.out.println("numero non valido, da 1 a 3");
        }
    }
}
