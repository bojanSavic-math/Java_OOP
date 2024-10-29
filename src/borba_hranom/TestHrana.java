package borba_hranom;

public class TestHrana {
    public static void main(String[] args) {

        Jabuka j1 = new Jabuka("crvena", 220, 60);
        Jabuka j2 = new Jabuka("zelena", 115, 50);

        System.out.println(j1);
        System.out.println(j2);
        System.out.println("-----------");

        j1.baci();
        j2.baci();

        System.out.println("-----------");

        Supa s1 = new Supa(20, 200, 5);
        Supa s2 = new Supa(60, 200, 5);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("-----------");

        s1.baci();
        s2.baci();

        System.out.println("-----------");

        Dete d = new Dete("Fica");
        System.out.println(d);

        System.out.println("-----------");

        d.dodajJelo(s1);
        d.dodajJelo(j1);
        d.dodajJelo(j2);
        System.out.println(d);

        System.out.println("-----------");

        for(int i=0; i<d.getJela().length; i++){
            if(d.getJela()[i] != null)
                d.getJela()[i].baci();
        }

    }
}
