// Využijte dědičnost tříd pro definování zvířat
// napište metody představSe(), která popíše objekt a využijte polymorfismus
//
package zoo;

public class Zoo {

    public static void main(String[] args) {
        Zvíře zv = new Zvíře(4, 7);

        System.out.println("Výpis zvířete:");
        zv.představSe();

        Pes p1 = new Pes(15, "voříšek", "Žeryk");
        p1.představSe();
        p1.stěkěj();

        Ryba r1 = new Ryba(1, "neonka");
        r1.představSe();
    }

}
