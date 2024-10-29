package dosije;

public class Zaposleni extends Dosije{

    protected int fondCasova;

    public Zaposleni(String imePrezime, String jmbg, int fondCasova) {
        super(imePrezime, jmbg);
        this.fondCasova = fondCasova;
    }
}
