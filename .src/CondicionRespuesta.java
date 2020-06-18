import java.util.List;

public class CondicionRespuesta implements Condicion{
    String rta;

    public CondicionRespuesta(String rta) {
        this.rta = rta;
    }

    public boolean seCumple(Pregunta p){
        if (p == null) return false;
        return p.getRespuesta().toLowerCase().equals(rta.toLowerCase());
    }

}
