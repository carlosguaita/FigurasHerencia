public class Piramide extends Triangulo{

    private double altura;

    public Piramide(Punto punto1, Punto punto2, Punto punto3, double altura) {
        super(punto1, punto2, punto3);
        this.altura = altura;
    }

    public double calcularVolumen(){
        return 1/3*calcularArea()*altura;
    }
}
