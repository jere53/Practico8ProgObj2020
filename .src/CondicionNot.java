public class CondicionNot implements Condicion{
    Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean seCumple(Pregunta p) {
        return (!c1.seCumple(p));
    }
}
