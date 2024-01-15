import java.util.Scanner;
public class Circunferencia {
    public static void main(String[] args)
    {
        
        //1.definir variables
        Scanner sc = new Scanner(System.in);
            double radio, superficie, longitud;
        //2. Intruducir el valor del radio de la circunferencia
        System.out.println("Dame el Radio de tu circunferencia jejeeee");
            radio = sc.nextDouble();
        //3.Calcular la superficie y la longitud:
            superficie = 3.1416*Math.pow(radio, 2);
            longitud = 2* 3.1416 * radio;
        //4.Imprimirlo por pantalla
        System.out.println("la longitud es " + longitud);
        System.out.println("la superficie es " + superficie);
    
    }
}
