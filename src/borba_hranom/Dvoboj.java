package borba_hranom;

import java.util.Scanner;


public class Dvoboj {

    public static void dvoboj(Dete d1, Dete d2){
        System.out.println();
        System.out.println("Dok se deca gledaju popreko, dvoboj se zahuktava.");
        String text = " je uspesno pogodio osobu koja se nesretno zove ";

        for(int i=0; i<d1.getJela().length; i++){
            System.out.println();
            if(d1.getJela()[i] != null){
                d1.getJela()[i].baci();
                System.out.println(d1.getIme() + text + d2.getIme());
            }
        }

        for(int i=0; i<d2.getJela().length; i++){
            if(d2.getJela()[i] != null){
                d2.getJela()[i].baci();
                System.out.println(d2.getIme() + text + d1.getIme());
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite ime prvog deteta: ");
        String ime1 = sc.next();
        Dete d1 = new Dete(ime1);

        System.out.print("Unesite ime drugog deteta: ");
        String ime2 = sc.next();
        Dete d2 = new Dete(ime2);

        Supa s = new Supa(60, 150, 10);
        Jabuka j = new Jabuka("crvena", 220, 60);

        d1.dodajJelo(s);
        d1.dodajJelo(j);
        d2.dodajJelo(s);
        d2.dodajJelo(j);

        dvoboj(d1, d2);

        sc.close();

    }
}
