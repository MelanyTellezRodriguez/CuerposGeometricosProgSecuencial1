import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        Scanner lector = new Scanner(System.in);

        int cantidadLados;
        double longitudLados, altura, areaLateral, areaTotal, volumen;
        double perimetroBase, areaBase, apotema;

        System.out.println(" ingrese la Cantidad de lados del prisma:");
        cantidadLados = lector.nextInt();
        System.out.println("ingrese la Altura del prisma:");
        altura = lector.nextDouble();
        System.out.println("ingrese la Longitud de lados del prisma:");
        longitudLados = lector.nextDouble();

        perimetroBase = cantidadLados * longitudLados;
        areaLateral = perimetroBase * altura;
        double alfa = (Math.PI / 180) * (360 / cantidadLados);
        apotema = longitudLados / (2 * Math.tan (alfa)/2);
        areaBase = (perimetroBase * apotema) /2;
        areaTotal = areaLateral + 2 * areaBase;
        volumen = areaBase * altura;

        System.out.print("Area lateral del prisma es: " + areaLateral);
        System.out.print("Area total del prisma es : " + areaTotal);
        System.out.println("volumen del prisma es: " + volumen);

        lector.close();
        
        


    }
}
