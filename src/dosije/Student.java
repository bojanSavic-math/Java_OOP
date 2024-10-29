package dosije;

public class Student extends Dosije {

    private int brojIndeksa;
    private int godinaUpisa;
    private int profilStudija;
    private static int brojac = 0;

    public Student(String imePrezime, String jmbg, int brojIndeksa, int godinaUpisa, int profilStudija) {
        super(imePrezime, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.godinaUpisa = godinaUpisa;
        this.profilStudija = profilStudija;
        brojac++;
    }

    public Student(Student s) {
        this(s.imePrezime, s.jmbg, s.brojIndeksa, s.godinaUpisa, s.profilStudija);
    }

    public void setProfilStudija(int profilStudija) {
        this.profilStudija = profilStudija;
    }

    public static int getBrojac() {
        return brojac;
    }

    @Override
    public String toString() {
        ProfilStudija ps = ProfilStudija.values()[profilStudija];
        return "Student: " + super.toString() + "\nbroj indeksa: " + brojIndeksa + "/" + (godinaUpisa%100) + "\n" +
                "studije: " + ps;
    }
}
