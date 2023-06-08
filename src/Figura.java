import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Figura {

    List<Punto> listaPuntos = new ArrayList<>();

    public Figura() {
    }

    public double calcularDistancia(int indice1, int indice2){
        return Math.sqrt(Math.pow(listaPuntos.get(indice1).getX()-listaPuntos.get(indice2).getX(),2)+
                         Math.pow(listaPuntos.get(indice1).getY()-listaPuntos.get(indice2).getY(),2)+
                         Math.pow(listaPuntos.get(indice1).getZ()-listaPuntos.get(indice2).getZ(),2));

    }


}
