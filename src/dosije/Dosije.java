package dosije;

public class Dosije {

    protected String imePrezime;
    protected String jmbg;

    public Dosije(String imePrezime, String jmbg) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
    }

    public Dosije(Dosije d) {
        this(d.imePrezime, d.jmbg);
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public static boolean jesteJmbg(String jmbg) {
        if(jmbg.length() == 13) {
            char[] niz = jmbg.toCharArray();
            for(int i = 0; i < niz.length; i++) {
                if(! Character.isDigit(niz[i])) {
                    System.out.println("Jmbg nije broj!");
                    return false;
                }
            }

            return true;
        }
        else {
            System.out.println("Jmbg nije duzina 13!");
            return false;
        }
    }

    @Override
    public String toString() {
        return imePrezime + "\n" + "jmbg: " + jmbg;
    }
}
