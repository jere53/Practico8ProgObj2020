import java.util.List;
import java.util.Map;

public class FormularioConMinimo extends Formulario {

    double porcentajeMinimo;

    public FormularioConMinimo(List<Pregunta> preguntas, double porcentajeMinimo) {
        super(preguntas);
        this.porcentajeMinimo = porcentajeMinimo;
        if (porcentajeMinimo > porcentajeRespondido()) this.preguntas = null;
    }
}
