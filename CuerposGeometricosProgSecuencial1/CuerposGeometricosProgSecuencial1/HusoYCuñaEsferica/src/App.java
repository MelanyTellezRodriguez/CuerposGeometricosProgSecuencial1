
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double area_Huso_Esferico, volumen_cuña_Esferica, radio, angulo_n;

        System.out.println("Ingrese el radio: ");
        radio = entrada.nextDouble();
        System.out.println("Ingrese el angulo: ");
        angulo_n = entrada.nextDouble();

        area_Huso_Esferico =  (4 * Math.PI * (radio * radio) * angulo_n) / 360;
        volumen_cuña_Esferica = (Math.PI * (radio * radio * radio) * angulo_n) / 270;

        System.out.println("El area del huso esferico es: " + area_Huso_Esferico);
        System.out.println("El volumen de la cuña esferica es: " + volumen_cuña_Esferica);

        entrada.close();
        



    }
}
