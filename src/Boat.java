public class Boat {
    // Private instances of the class
    private String name = "unknown";
    private String boatClass = "unknown";
    private int regNum = -1;
    private double yardstick;
    
    // Class Constructors
    public Boat(){
        yardstick = 100.0;
    }
    public Boat(String initName, String initBoatClass, int initRegNum, double initYardstick){
        this.name = initName;
        this.boatClass = initBoatClass;
        this.regNum = initRegNum;
        this.yardstick = initYardstick;
    }

    //Functions to get instances of the class
    public String getName(){
        return this.name;
    }
    public String getBoatClass(){
        return this.boatClass;
    }
    public int getNum(){
        return this.regNum;
    }
    public double getYard(){
        return this.yardstick;
    }

    //Functions to set instances of the class
    public void setName(String initName){
        this.name = initName;
    }
    public void setClass(String initBoatClass){
        this.boatClass = initBoatClass;
    }
    public void setNum (int initRegNum){
        this.regNum = initRegNum;
    }
    public void setYard(double initYardstick){
        this.yardstick = initYardstick;
    }

    //Function to create the correct format of the string
    public String toString(){
        return "Boat " + this.name + ", Class = " + this.boatClass + ", Registration # = KA " + this.regNum;
    } 
}
