
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double areaLateral, generatriz, radioMayor;
        double radioMenor, areaTotal, areaBaseMayor;
        double areaBaseMenor, altura, volumen;

        System.out.println("Ingrese el radio Mayor: ");
        radioMayor = lector.nextDouble();
        System.out.println("Ingrese el radio Menor: ");
        radioMenor = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = lector.nextDouble();
        System.out.println("Ingrese  la generatriz: ");
        generatriz = lector.nextDouble();

        areaLateral = Math.PI * generatriz * (radioMayor + radioMenor);
        areaBaseMayor = Math.PI * (radioMayor * radioMayor);
        areaBaseMenor = Math.PI * (radioMenor * radioMenor);
        areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;
        volumen = 1/3 *  Math.PI * altura * ((radioMayor * radioMayor) + (radioMenor * radioMenor) + (radioMayor * radioMenor));
        
        System.out.println("El area lateral del tronco de cono es: " + areaLateral);
        System.out.println("El areaTotal del tronco de cono es: " + areaTotal);
        System.out.println("El volumen del tronco de cono es: " + volumen);

        lector.close();
        

    }
}
