import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double perimetroBase, altura, radio;
        double areaLateral, areaBase;
        double volumen, areaTotal;

        System.out.println ("Ingrese el radio:");
        radio = entrada.nextDouble();
        System.out.println("Ingrese la altura:");
        altura = entrada.nextDouble();

        perimetroBase = (2 * Math.PI * radio);
        areaLateral = perimetroBase * altura;
        areaBase = Math.PI * (radio * radio);
        areaTotal = perimetroBase * (altura + radio);
        volumen = areaBase * altura;

        System.out.println("El area lateral es: " + areaLateral);
        System.out.println("El area total es: " + areaTotal);
        System.out.println("El volumen es: " + volumen);

        entrada.close();
        



    }
}
