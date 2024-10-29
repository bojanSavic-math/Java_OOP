package dosije;

public class Nastavnik extends Zaposleni {

    private String zvanje;
    public static String[] zvanja = {"docent", "vanredni", "redovan"};

    public Nastavnik(String imePrezime, String jmbg, int fondCasova, String zvanje) {
        super(imePrezime, jmbg, fondCasova);
        this.zvanje = zvanje;
    }

    public Nastavnik(Nastavnik n) {
        this(n.imePrezime, n.jmbg, n.fondCasova, n.zvanje);
    }

    public static boolean ispravnoZvanje(String zvanje) {
        if(zvanje.equals(zvanja[0]) || zvanje.equals(zvanja[1]) || zvanje.equals(zvanja[2]))
            return true;
        else
            return false;
    }

    public static String jmbgUdatum(String jmbg) {
        if(Dosije.jesteJmbg(jmbg)) {
            String dan = jmbg.substring(0, 2);
            int danInt = Integer.parseInt(dan);
            if(danInt < 0 || danInt > 31) {
                System.out.println("Pogresan format za jmbg!");
                return null;
            }
            String mesec = jmbg.substring(2, 4);
            int mesecInt = Integer.parseInt(mesec);
            switch (mesecInt) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if(danInt > 31) {
                        System.out.println("Pogresan format za jmbg!");
                        return null;
                    }
                    break;
                case 4, 6, 9, 11:
                    if(danInt > 30) {
                        System.out.println("Pogresan format za jmbg!");
                        return null;
                    }
                    break;
                case 2:
                    if(danInt > 29) {
                        System.out.println("Pogresan format za jmbg!");
                        return null;
                    }
                    break;
                default:
                    break;
            }
            String godina = "1" + jmbg.substring(4, 7);
            int godinInt = Integer.parseInt(godina);
            if(godinInt < 1900 || godinInt > 1999) {
                System.out.println("Pogresan format za jmbg!");
                return null;
            }
            return dan + "." + mesec + "." + godina + ".";
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Nastavnik: " + super.toString() + "\nDatum rodjenja: " + Nastavnik.jmbgUdatum(super.jmbg) +
                "\nradni odnos: " + fondCasova + "%\nzvanje: " + zvanje;
    }
}
