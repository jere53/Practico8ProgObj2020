public class CondicionValor implements Condicion {
    int valor;

    public CondicionValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean seCumple(Pregunta p) {
        if (p == null) return false;
        try {
            Integer.parseInt(p.getRespuesta());
        } catch(NumberFormatException nfe) {
            // Log exception.
            return false;
        } //sino falla si lo trato de usar en una pregunta con texto

        return (Integer.parseInt(p.getRespuesta()) == valor);
    }
}
