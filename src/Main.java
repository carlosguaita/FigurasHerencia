import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los puntos del Cubo");
        Punto[] punto = new Punto[4];
        for (int i = 0; i <4; i++) {
            System.out.println("Ingrese la componente X punto "+i+" : ");
            double x=sc.nextDouble();
            System.out.println("Ingrese la componente Y punto "+i+" : ");
            double y=sc.nextDouble();
            System.out.println("Ingrese la componente Z punto "+i+" : ");
            double z=sc.nextDouble();
            punto[i]= new Punto(x,y,z);
        }
        System.out.println("Ingrese la profundidad: ");
        double profundidad=sc.nextDouble();
        Cubo cubo = new Cubo(punto[0],punto[1],punto[2],punto[3],profundidad);
        System.out.println("El volumen del cubo es: "+cubo.calcularVolumen());
        System.out.println("El area superficial del cubo es: "+cubo.areaSuperficial());
    }
}