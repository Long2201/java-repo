public class Boat {
    private String name = "unknown";
    private String boatClass = "unknown";
    private int regNum = -1;
    private double yardstick;
    public Boat(){
        yardstick = 100.0;
    }
    public String toString(){
        return "Boat " + this.name + ", Class = " + this.boatClass + this.boatClass + ", Registration = " + this.regNum;
    }
}
