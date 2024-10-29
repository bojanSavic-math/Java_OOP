package borba_hranom;

public abstract class Hrana implements BivaBacen {

    private double tezina;
    private double domet;

    public Hrana() {
        tezina = 0;
        domet = 0;
    }

    public Hrana(double tezina, double domet) {
        if (tezina < 0)
            this.tezina = 0;
        else
            this.tezina = tezina;

        if (domet < 0)
            this.domet = 0;
        else
            this.domet = domet;
    }

    public double getTezina() {
        return tezina;
    }

    public double getDomet() {
        return domet;
    }

    @Override
    public String toString() {
        return "tezina: " + tezina + "g, domet: " + domet + "m";
    }
}
