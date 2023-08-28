import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double area, radio, volumen;

        System.out.println("Ingrese el radio: ");
        radio = entrada.nextDouble();

        area = 4 * Math.PI * (radio * radio);
        volumen = 4/3 * Math.PI * (radio * radio * radio);

        System.out.println("El area de la esfera es: " + area);
        System.out.println("el volumen de la esfera es: " + volumen);

        entrada.close();


    }
}
