package dosije;

import java.util.Scanner;

public class TestDosije {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaci o studentu: ");
        System.out.println("------------------------");

        System.out.print("ime osobe: ");
        String ime = sc.next();

        System.out.print("prezime osobe: ");
        String prezime = sc.next();

        String jmbg;
        do {
            System.out.print("jmbg: ");
            jmbg = sc.next();
        } while(!Dosije.jesteJmbg(jmbg));

        System.out.print("broj indeksa: ");
        int brojIndeksa = sc.nextInt();
        System.out.print("godina upisa: ");
        int godinaUpisa = sc.nextInt();
        System.out.print("studije (0 - 'Osnovne', 1 -'MSc', 2 - 'PhD'): ");
        int profilStudija = sc.nextInt();


        String imePrezime = ime + " " + prezime;
        Student s = new Student(imePrezime, jmbg, brojIndeksa, godinaUpisa, profilStudija);
        System.out.println();
        System.out.println(s.toString());
        System.out.println();
        System.out.println("Broj upisanh studenata: " + Student.getBrojac());


        System.out.println("Podaci o nastavniku: ");
        System.out.println("------------------------");

        System.out.print("ime osobe: ");
        String ime1 = sc.next();

        System.out.print("prezime osobe: ");
        String prezime1 = sc.next();

        String jmbg1;
        do {
            System.out.print("jmbg: ");
            jmbg1 = sc.next();
        } while(Nastavnik.jmbgUdatum(jmbg1) == null);

        System.out.print("radni odnos: ");
        int fond = sc.nextInt();
        System.out.print("zvanje: ('docent', 'vanredni', 'redovni'): ");
        String zvanje =sc.next();

        Nastavnik n = new Nastavnik(ime1+ " " + prezime1, jmbg1, fond, zvanje);
        System.out.println();
        System.out.println(n.toString());

        System.out.print("studije (0 - 'Osnovne', 1 -'MSc', 2 - 'PhD'): ");
        profilStudija = sc.nextInt();

        System.out.println();
        s.setProfilStudija(profilStudija);

        Student s1 = new Student(s);
        System.out.println(s1.toString());
        System.out.println("Broje studenata: " + Student.getBrojac());

    }
}
