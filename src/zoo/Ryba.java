package zoo;

// třída je odvozena ze třídy Zvíře
class Ryba extends Zvíře {
    private String druh;

    public Ryba(int věk, String druh) {
        // voláme kontruktor nadřízené třídy Zvíře(počet nohou, věk)
        super(0, věk);
        // doplníme členské proměnné této (podřízené) třídy
        this.druh = druh;
    }

    // polymorfismus (přepsání zděděné metody)
    @Override
    public void představSe() {
        // ryba nemá nohy, nelze použít nadřízenou třídu (vadný návrh)
        // metodu lze ale úplně překrýt, takže to nevadí
        System.out.println("Ryba "+this.druh);
        System.out.println("Věk: "+this.getVěk());
        System.out.println("Nohy nemám :-(");
    }
    
}
