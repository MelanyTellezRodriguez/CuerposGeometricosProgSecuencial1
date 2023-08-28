
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double arista, area, altura, volumen;

        System.out.println("Ingrese la arista o valor de la orilla del triangulo: ");
        arista = lector.nextDouble();

        area = (arista * arista) * Math.sqrt(3);
        volumen = (Math.sqrt(2) / 12) * (arista * arista * arista);
        altura = arista * (Math.sqrt(6) /3);

        System.out.println("El area del tetraedro es: " + area);
        System.out.println("El volumen del tetraedro es: " + volumen);
        System.out.println("La altura del tretraedro es: " + altura);

        lector.close();
        



    }
}
