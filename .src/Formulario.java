import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Formulario {
    private static int nroForm;
    List<Pregunta> preguntas; //las preguntas estan indexadas y ordenadas

    public Formulario(List<Pregunta> preguntas) {
        nroForm++;
        this.preguntas = preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public static int getIdForm() {
        return nroForm;
    }

    public List<Pregunta> getPreguntas() {
        return Collections.unmodifiableList(preguntas);
    }

    public Pregunta getPregunta(int nroPregunta){
        if (preguntas == null) return null;
        return preguntas.get(nroPregunta);
    }

    public double porcentajeRespondido() {
        if ((preguntas == null) || (preguntas.size() == 0)) return  0.0;
        int cantRespuesta = 0;
        for (Pregunta p : preguntas) {
            if (p != null)
                cantRespuesta++;
        }
        return ((cantRespuesta) / (double) preguntas.size()); // [0.0, 1.0]
    }

    public boolean respEsperadaAMasDe(int n, Map<Integer, Condicion> respuestasEsperadas){
        if (preguntas == null) return false;
        int cant = 0;
        for (int i = 0; i < preguntas.size(); i++) {
            if (respuestasEsperadas.get(i).seCumple(preguntas.get(i)))
                cant++;
        }
        return (cant > n);
    }
}
