public class Cuadrado extends Figura{

    boolean validacion=false;
    double lado;

    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4){
        listaPuntos.add(punto1);
        listaPuntos.add(punto2);
        listaPuntos.add(punto3);
        listaPuntos.add(punto4);
        validacion=validarCuadrado();
    }

    public Cuadrado() {
    }

     public boolean validarCuadrado(){
        double d1 = calcularDistancia(0,1);
         double d2 = calcularDistancia(0,2);
         double d3 = calcularDistancia(1,3);
         double d4 = calcularDistancia(2,3);
         if (d1==d2 && d2==d3 && d3==d4 && d4==d1){
             lado=d1;
             return true;
         }else{
             System.out.println("No es cun cuadrado");
             return false;
         }
     }

     public double calcularPerimetro(){
        return lado*4;
     }

     public double calcularArea(){
        return Math.pow(lado,2);
     }
}
