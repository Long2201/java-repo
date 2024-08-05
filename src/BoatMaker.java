public class BoatMaker {
    public static void main(String[] args) {
        System.out.println("Starting boat application");
        Boat myBoat = new Boat();
        Boat myBoat1 = new Boat("Harmony Blue", "International 505", 6467, 95 );
        System.out.println(myBoat.toString());
        System.out.println(myBoat1.toString());

        //Extention of checkout 18 requirements
        myBoat.setName("Australia II");
        System.out.println(myBoat.getName());
        System.out.println(myBoat1.getName());

        //Adding loop for checkout 19
        int i = 4;
        while (i > 0) {
            Boat testBoat = new Boat();
            System.out.println("Sequence #: " + testBoat.getSeqNum());
            System.out.println(testBoat);
            i--;
        }
        System.out.println();
        System.out.println(Boat.getTotal());
    }
}

