public class Boat {
    // Private instances of the class
    private String name = "unknown";
    private String boatClass = "unknown";
    private int regNum = -1;
    private double yardstick;
    private static int countBoats = 0;
    private int sequenceNum;
    
    // Class Constructors
    public Boat(){
        this.yardstick = 100.0;
        countBoats++ ;
        this.sequenceNum = countBoats;
    }
    public Boat(String initName, String initBoatClass, int initRegNum, double initYardstick){
        this.name = initName;
        this.boatClass = initBoatClass;
        this.regNum = initRegNum;
        this.yardstick = initYardstick;
        countBoats++ ;
        this.sequenceNum = countBoats;
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
    
    public int getSeqNum(){
        return sequenceNum;
    }

    //A static function to return the count of boats
    public static String getTotal(){
        return "Total number of boats created = " + countBoats;
    }

    public String adjustedRaceTime(int start, int end){
        if (start > end){
            return "Incorrect time keeping";
        }
        else{
            int startHour = start / 100;
            int startMinutes = start % 100;
            int endHour = end / 100;
            int endMinutes = end % 100;
            int elapsedTime = (endHour - startHour - 1)*60 + (60-startMinutes) + endMinutes;
            double adjustedTime = (elapsedTime / yardstick) * 100;
            return String.format("%.2f", adjustedTime);
        }
    }
    
}
