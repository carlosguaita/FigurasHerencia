public class Triangulo extends Figura{

    double lado1;
    double lado2;
    double lado3;

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        listaPuntos.add(punto1);
        listaPuntos.add(punto2);
        listaPuntos.add(punto3);
        lado1=calcularDistancia(0,1);
        lado2=calcularDistancia(1,2);
        lado3=calcularDistancia(0,2);
    }

    public Triangulo() {
    }

    public double calcularArea(){
        double s= calcularPerimetro()/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

    public double calcularPerimetro(){
        return lado1+lado2+lado3;
    }

}
