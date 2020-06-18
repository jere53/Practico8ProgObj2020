public class Pregunta {
    String enunciado;
    String respuesta;

    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
    }

    public Pregunta(String enunciado, String respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }
}
