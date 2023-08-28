
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, altura, longitudb;
        double profundidadC, diagonal, volumen;

        System.out.println("Ingrese la altura del Ortoedro: ");
        altura = lector.nextDouble();
        System.out.println("Ingrese la longitudb del ortoedro: ");
        longitudb = lector.nextDouble();
        System.out.println("Ingrese la profundidadC del ortoedro: ");
        profundidadC = lector.nextDouble();

        area = 2 * ((altura * longitudb) + (altura * profundidadC) + (longitudb * profundidadC));
        diagonal = Math.sqrt ((altura * altura) + (longitudb * longitudb) + (profundidadC * profundidadC));
        volumen = altura * longitudb * profundidadC;

        System.out.println("El area del Ortoedro es: " + area);
        System.out.println("La diagonal del Ortoedro es: " + diagonal);
        System.out.println("El volumen del Ortoedro es: " + volumen);

        lector.close();
    }
}
