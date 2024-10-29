package dosije;

public enum ProfilStudija {
    Osnovne(0),
    MSc(1),
    PhD(2);

    private final int ps;

    private ProfilStudija(int ps) {
        this.ps = ps;
    }
}
