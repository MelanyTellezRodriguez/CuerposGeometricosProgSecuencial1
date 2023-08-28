
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double areaEsfe, alturaEsfe, radioMayorEsfe_r1;
        double radioMenorEsfe_r2, volumenEsfe, radioEsfe_R;
        double volumenCasquete, areaCasquete;

        System.out.println("Ingrese la altura de la Zona esferica: ");
        alturaEsfe = entrada.nextDouble();
        System.out.println("Ingrese el radio mayor de la esfera r1: ");
        radioMayorEsfe_r1 = entrada.nextDouble();
        System.out.println("Ingresa el radio menor de la esfera r2: ");
        radioMenorEsfe_r2 = entrada.nextDouble();
        System.out.println("Ingresa el radio de la esfera R: ");
        radioEsfe_R = entrada.nextDouble();

        areaEsfe = (2 * Math.PI * radioEsfe_R * alturaEsfe);
        volumenEsfe = (Math.PI * alturaEsfe * ((alturaEsfe * alturaEsfe) + (3 * (radioMayorEsfe_r1 * radioMayorEsfe_r1)) + (3 * (radioMenorEsfe_r2 * radioMenorEsfe_r2)))) / 6;
        areaCasquete = 2 * Math.PI * radioEsfe_R * alturaEsfe;
        volumenCasquete = ((Math.PI * (alturaEsfe * alturaEsfe)) * (3 * radioEsfe_R) - alturaEsfe);

        System.out.println("El area de la zona esferica es: " + areaEsfe);
        System.out.println("El volumen de la Zona esferica es: " + volumenEsfe);
        System.out.println("El area del casquete esferico es: " + areaCasquete);
        System.out.println("El volumen del casquete esferico es: " + volumenCasquete);

        entrada.close();

    }
}
