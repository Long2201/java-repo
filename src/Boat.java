public class Boat {
    private String name = "unknown";
    private String boatClass = "unknown";
    private int regNum = -1;
    private double yardstick;

    public Boat(){
        yardstick = 100.0;
    }
    public Boat(String initName, String initBoatClass, int initRegNum, double initYardstick){
        this.name = initName;
        this.boatClass = initBoatClass;
        this.regNum = initRegNum;
        this.yardstick = initYardstick;
    }
    public String toString(){
        return "Boat " + this.name + ", Class = " + this.boatClass + ", Registration # = KA " + this.regNum;
    }
}
