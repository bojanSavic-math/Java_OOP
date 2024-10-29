package borba_hranom;

public class Jabuka extends Hrana{

    private String boja;

    public Jabuka(String boja, double tezina, double domet) {
        super(tezina, domet);
        this.boja = boja;
    }

    public Jabuka(Jabuka j) {
        this(j.boja, j.getTezina(), j.getDomet());
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    @Override
    public void baci() {
        String text = " jabuka leti kroz vazduh";
        if(super.getTezina() > 200)
            System.out.println("ogromna " +
                    boja + text);
        else
            System.out.println(boja + text);

    }

    @Override
    public String toString() {
        return "[Jabuka] boja: " + boja + ", " + super.toString();
    }
}
