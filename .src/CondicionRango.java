import java.util.List;

public class CondicionRango {

    int limInf, limSup;

    public CondicionRango(int limInf, int limSup) {
        this.limInf = limInf;
        this.limSup = limSup;
    }

    boolean seCumple(Pregunta p) {
        if (p == null) return false;
        try {
            Integer.parseInt(p.getRespuesta());
        } catch(NumberFormatException nfe) {
            // Log exception.
            return false;
        } //sino falla si lo trato de usar en una pregunta con texto
        if (Integer.parseInt(p.getRespuesta()) >= limInf) {
            return (Integer.parseInt(p.getRespuesta()) <= limSup);
        }
        return false;
    }
}
