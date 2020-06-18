public class CondicionOr implements Condicion{
    Condicion c1, c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public boolean seCumple(Pregunta p) {
        return (c1.seCumple(p) || c2.seCumple(p));
    }
}
