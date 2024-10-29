package borba_hranom;

public class Dete {

    private String ime;
    private Hrana[] jela;

    public Dete(String ime){
        this.ime = ime;
        jela = new Hrana[4];
    }

    public String getIme() {
        return ime;
    }

    public Hrana[] getJela() {
        return jela;
    }

    public void dodajJelo(Hrana hr){
        int i=0;
        while (jela[i] != null)
            i++;
        jela[i] = hr;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[Dete] ime: ").append(ime).append("\n");

        if(jela[0] == null) {
            sb.append("\t").append("nema jela");
            return sb.toString();
        }

        sb.append("\t").append("jela").append("\n");
        for(int i=0; i<jela.length; i++)
            if(jela[i] != null) {
                sb.append("\t").append("\t");
                sb.append(jela[i].toString()).append("\n");
            }

        return sb.toString();
    }
}
