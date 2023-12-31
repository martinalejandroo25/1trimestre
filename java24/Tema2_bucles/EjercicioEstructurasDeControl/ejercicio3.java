import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            try {
                System.out.println("dime un dígito na' mas");
                num = sc.nextInt();
                switch (num) {
                    case 0:
                        System.out.println("cero");
                        break;
                    case 1:
                        System.out.println("uno");
                        break;
                    case 2:
                        System.out.println("dos");
                        break;
                    case 3:
                        System.out.println("tres");
                        break;
                    case 4:
                        System.out.println("cuatro");
                        break;
                    case 5:
                        System.out.println("cinco");
                        break;
                    case 6:
                        System.out.println("seis");
                        break;
                    case 7:
                        System.out.println("siete");
                        break;
                    case 8:
                        System.out.println("ocho");
                        break;
                    case 9:
                        System.out.println("nueve");
                        break;
                    default:
                        System.out.println("Este número contiene más de un dígito, pruebe otro de un solo dígito de longitud");
                        break;
            }   
            } catch (InputMismatchException e) {
                System.out.println("Ingresa solo dígitos, por favor "+ e.getMessage());
            }
        }
    }
}
