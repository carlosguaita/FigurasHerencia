public class Cubo extends Cuadrado{

    private double profundidad;

    public Cubo(Punto punto1, Punto punto2, Punto punto3, Punto punto4, double profundidad) {
        super(punto1, punto2, punto3, punto4);
        this.profundidad = profundidad;
    }

    public double calcularVolumen(){
        return calcularArea()*profundidad;
    }

    public double areaSuperficial(){
        double areaBase = calcularArea();
        double area2 = lado*profundidad;
        return areaBase*2+area2*4;
    }

}
