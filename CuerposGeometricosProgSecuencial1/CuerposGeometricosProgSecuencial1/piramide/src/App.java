
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int cantidadLados;
        double areaLateral, perimetroBase, apotemaPiramide;
        double altura, apotema, areaTotal, areaBase;
        double volumen, longitudLados;

        System.out.println("Ingrese la cantidad de lados:");
        cantidadLados = lector.nextInt();
        System.out.println("Ingrese la altura:");
        altura = lector.nextDouble();
        System.out.println("Ingrese la longitud de los lados:");
        longitudLados = lector.nextDouble();

        perimetroBase = cantidadLados * longitudLados;
        double alfa = (Math.PI / 180) *(360 / cantidadLados);
        apotema = longitudLados / (2 * Math.tan(alfa)/2);
        apotemaPiramide = (altura * altura) + (apotema * apotema);
        areaLateral = (perimetroBase * apotemaPiramide) / 2;
        areaBase =(perimetroBase * apotema) / 2;
        areaTotal = areaLateral + areaBase;
        volumen = (areaBase * altura) / 3;

        System.out.println("El area lateral es: " + areaLateral);
        System.out.println("El area total es: " + areaTotal);
        System.out.println("El volumen es: " + volumen);

        lector.close();
    }
}
