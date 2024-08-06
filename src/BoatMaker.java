public class BoatMaker {
    public static int getCorrectedTime(int min, int max) {
        int randomNum;
        do {
            randomNum = min + (int)(Math.random() * ((max - min) + 1));
            int randomMinute = randomNum % 100;
            int randomHour = randomNum / 100;
            if (randomMinute >= 60) {
                randomNum = randomHour * 100 + 100 + (randomMinute - 60);
            }
        } while (randomNum > max); // Repeat if the number exceeds max
        return randomNum;
    }
    public static void main(String[] args) {
        // System.out.println("Starting boat application");
        // Boat myBoat = new Boat();
        // Boat myBoat1 = new Boat("Harmony Blue", "International 505", 6467, 95 );
        // System.out.println(myBoat.toString());
        // System.out.println(myBoat1.toString());

        // //Extention of checkout 18 requirements
        // myBoat.setName("Australia II");
        // System.out.println(myBoat.getName());
        // System.out.println(myBoat1.getName());

        // //Adding loop for checkout 19
        // int i = 4;
        // while (i > 0) {
        //     Boat testBoat = new Boat();
        //     System.out.println("Sequence #: " + testBoat.getSeqNum());
        //     System.out.println(testBoat);
        //     i--;
        // }
        // System.out.println();
        // System.out.println(Boat.getTotal());


        //Challenge - Checkout 20 
        System.out.println("Boat #\tStart\tEnd\tYdstk\tAdjusted Time (mins)");
        System.out.println("--------------------------------------------------");

        // generate a corrected start time between 900 and 1145
        int startTime = BoatMaker.getCorrectedTime(900, 1145);
    

        // set up variables you will need to calculate the best time
        int index = 0;
        double bestTime = Double.MAX_VALUE;
        int boatNum =  0;
        while (index < 8){
            // Yardstick in the range 91 to 100
            double yardstick = 91 + (Math.random() * 10);
            // create a new Boat with the default constructor
            Boat boat = new Boat();
            // set the yardstick to the one generated above
            boat.setYard(yardstick);
            // generate a corrected end time between 1030 and 1230
            int endTime = BoatMaker.getCorrectedTime(1030, 1230);
            // call the adjustedRaceTime method in the Boat class on the corrected start and end time
            String adTime = boat.adjustedRaceTime(startTime, endTime);
            // Print out the Boat sequence number, start time, end time, yardstick and adjusted time
            // these should be separated with the \t (tab) character
            System.out.printf("Boat %d\t%d\t%d\t%.2f\t%s%n", boat.getSeqNum(), startTime, endTime, yardstick, adTime);
            // determine the best time

            if (adTime == "Incorrect time keeping"){
                index++; 
            }
            else{
                if (Double.valueOf(adTime) < bestTime){
                    bestTime = Double.valueOf(adTime);
                    boatNum = boat.getSeqNum() - 1;
                }
                index++;
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println("The winner of the race is: Boat " + (boatNum + 1) +
        " with a time of " + bestTime + " minutes");
        
    }
}

