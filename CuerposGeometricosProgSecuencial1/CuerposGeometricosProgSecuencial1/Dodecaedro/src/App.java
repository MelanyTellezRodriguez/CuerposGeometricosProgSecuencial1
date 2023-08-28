
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, arista, volumen;

        System.out.println("Ingrese el valor de la arista del dodecaedro: ");
        arista = lector.nextDouble();

        area = (3 * (arista * arista)) * Math.sqrt(25 + (10 * Math.sqrt(5)));
        volumen = (Math.pow(arista, 3)) / 4 * (15 + 7 * Math.sqrt(5));

        System.out.println ("El area del dodecaedro es: " + area);
        System.out.println("El volumen del dodecaedro es: " + volumen);

        lector.close();

    }
}
