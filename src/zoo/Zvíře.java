// základní třída Zvíře
// obsahuje společné vlastnosti pro podtřídy Pes a Ryba
//
package zoo;

class Zvíře {

    private int nohy;
    private int věk;

    public Zvíře(int nohy, int věk) {
        this.nohy = nohy;
        this.věk = věk;
    }

    public int getNohy() {
        return nohy;
    }

    public int getVěk() {
        return věk;
    }

    public void představSe() {
        System.out.println("Počet nohou: " + this.getNohy());
        System.out.println("Věk: " + this.getVěk());
    }
}
