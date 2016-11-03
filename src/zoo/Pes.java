package zoo;

// třída Pes je odvozena od třídy Zvíře
public class Pes extends Zvíře {

    // přidáváme charakteristiky, zbytek dědíme z nadřízené třídy Zvíře
    private String rasa;
    private String jmeno;

    public Pes(int v, String r, String j) {
        // voláme kontruktor nadřízené třídy Zvíře(počet nohou, věk)
        super(4, v);
        // doplníme členské proměnné této (podřízené) třídy
        this.rasa = r;
        this.jmeno = j;
    }

    // polymorfismus (přepsání zděděné metody)
    @Override
    public void představSe() {
        System.out.println("Pes " + this.rasa + ", jmenuji se " + this.jmeno + ".");
        super.představSe();
    }

    public void stěkěj() {
        if (this.getVěk() < 2) {
            System.out.println("Ňaf, ňaf!");
        } else if (this.getVěk() < 10) {
            System.out.println("Vrrr! Haf, haf!");
        } else {
            System.out.println("Ha...f... a už nepruď!");
        }
    }
}
