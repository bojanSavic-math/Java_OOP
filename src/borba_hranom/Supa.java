package borba_hranom;

public class Supa extends Hrana {

    private double temperatura;

    public Supa(double temperatura, double tezina, double domet){
        super(tezina, domet);
        this.temperatura = temperatura;
    }

    public Supa(Supa s){
        this(s.temperatura, s.getTezina(), s.getDomet());
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void baci() {
        String text = " supa krstari vazduhom ka svojoj meti";
        if(temperatura < 30)
            System.out.println("ledena" + text);
        else if(temperatura >= 30 && temperatura <= 45)
            System.out.println("mlaka" + text);
        else
            System.out.println("vrela" + text);
    }

    @Override
    public String toString() {
        return "[Supa] temperatura: " + temperatura +
                "C, " + super.toString();
    }
}
