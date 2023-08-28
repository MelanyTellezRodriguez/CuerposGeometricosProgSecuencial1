
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double area, arista, volumen;

        System.out.println("Ingrese el valor de la arista del Icosaedro: ");
        arista = entrada.nextDouble();

        area = 2 * (arista * arista) * Math.sqrt(3);
        volumen = (Math.sqrt(2)/3) * (arista * arista * arista);

        System.out.println("El area del Icosaedro es: " + area);
        System.out.println("El volumen del Icosaedro es: " + volumen);
        
        entrada.close();
    }
}
