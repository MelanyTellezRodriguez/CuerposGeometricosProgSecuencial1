
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double areaLateral, areaTrapecio;
        double areaTotal, areaBaseMayor;
        double areaBaseMenor, volumen, apotemaPiramide, altura;

        System.out.println("Ingrese el apotema de la piramide o altura de las caras laterales : ");
        apotemaPiramide = entrada.nextDouble();
        System.out.println("Ingrese la altura del tronco de piramide: ");
        altura = entrada.nextDouble();
        System.out.println("Ingrese el area de la base mayor: ");
        areaBaseMayor = entrada.nextDouble();
        System.out.println("Ingrese el area de la base menor: ");
        areaBaseMenor = entrada.nextDouble();

        areaTrapecio = ((areaBaseMayor + areaBaseMenor) * apotemaPiramide)/2;
        areaLateral = (areaTrapecio * 5);
        areaTotal = areaLateral + areaBaseMenor + areaBaseMayor;
        volumen = 1/3 * altura * (areaBaseMayor + areaBaseMenor + Math.sqrt(areaBaseMayor + areaBaseMenor));

        System.out.println("El area lateral del trono de piramide es: " + areaLateral);
        System.out.println("El area total del tronco de piramide es: " + areaTotal);
        System.out.println("El volumen del troco de piramide es: " + volumen);

        entrada.close();


        

    }
}
