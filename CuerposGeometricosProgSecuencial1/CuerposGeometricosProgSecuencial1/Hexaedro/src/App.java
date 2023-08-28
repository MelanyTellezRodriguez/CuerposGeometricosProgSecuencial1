
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double area, volumen, arista, diagonal;

        System.out.println("Ingrese la arista: ");
        arista = entrada.nextDouble();

        area = 6 * (arista * arista);
        volumen = (arista * arista * arista);
        diagonal = arista * (Math.sqrt(3));

        System.out.println("El area del hexaedro es: " + area);
        System.out.println("El volumen del hexaedro es: " + volumen);
        System.out.println("La diagonal del hexaedro es: " + diagonal);

        entrada.close();
        
    }
}
