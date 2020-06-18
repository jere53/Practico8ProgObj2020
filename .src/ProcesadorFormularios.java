import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcesadorFormularios {
    private List<Formulario> formularios;
    private Map<Integer, Condicion> respuestasEsperadas = new HashMap<>();

    public ProcesadorFormularios(List<Formulario> formularios, Map<Integer, Condicion> respuestasEsperadas) {
        this.formularios = formularios;
        this.respuestasEsperadas = respuestasEsperadas;
    }

    public ProcesadorFormularios(List<Formulario> formularios) {
        this.formularios = formularios;
    }

    public int cantRespuestas(int nroPregunta, Condicion resp){
        //devuelve la cantidad de respuestas que cumplen la condicion
        int cant = 0;
        for (Formulario f : formularios) {
            if (resp.seCumple(f.getPregunta(nroPregunta)))
                cant++;
        }
        return cant;
    }

    public double porcentajeRespuestas(int nroPregunta, Condicion resp) {
        if((formularios == null) || (formularios.size() == 0)) return 0;
        return (cantRespuestas(nroPregunta, resp)/ (double) formularios.size());
    }

    public int cantRespuestasMayorA(int n){
        int cant = 0;
        for (Formulario f : formularios) {
            if (f.respEsperadaAMasDe(n, respuestasEsperadas))
                cant++;
        }
        return cant;
    }

    public double porcentajeRespuestasMayorA(int n){
        if ((formularios == null) || (formularios.size() == 0)) return 0;
        return (cantRespuestasMayorA(n)/ (double) formularios.size());
    }
}
