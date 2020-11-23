public class Archer extends Fighter {

    public Archer() {
        super(100, 15);
    }
    public String toString(){
        return super.toString() + " (Archer)";
    }
    public void gainPower(){
        super.gainPower(10);
    }
}
