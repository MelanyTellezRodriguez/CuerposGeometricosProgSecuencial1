import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double areaLateral, perimetroBase, generatriz;
        double radio, altura, areaBase, areaTotal;
        double volumen;
        
        System.out.println("Ingrese el radio: ");
        radio = entrada.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = entrada.nextDouble();
        
        generatriz = Math.sqrt( radio * radio + altura * altura);
        perimetroBase = Math.PI * radio;
        areaLateral = perimetroBase * generatriz;
        areaBase = Math.PI * (radio * radio);
        areaTotal = Math.PI * radio * (generatriz + radio);
        volumen = (areaBase * altura)/3;
        
        System.out.println("Area Lateral: " + areaLateral);
        System.out.println("Area Toatal: " + areaTotal);
        System.out.println("El volumen es: " + volumen);

        entrada.close();
    }
    
}
