public class ShipPosition {
    public static int[] getCoordinates() {
        return coordinates;
    }

    private static int[] coordinates = new int[3];

    public ShipPosition(int numberOfDecs, int decsCoeff) {
        shipCoordination(numberOfDecs, decsCoeff);
    }

    private static boolean horizVert(){
        int b = (int) (Math.random() * 10);
        return b % 2 == 0;
    }
    private void shipCoordination(int numberOfDecs, int decsCoeff){
        if (horizVert()) {
            int vertikal = (int) (Math.random() * 10);
            int horizontal = (int) (Math.random() * decsCoeff);
            ShipPosition.coordinates[0] = 0;
            ShipPosition.coordinates[1] = vertikal;
            ShipPosition.coordinates[2] = horizontal;
//            System.out.println("horiz: y=" + ShipPosition.coordinates[1] + ", x=" + ShipPosition.coordinates[2] + " decks:" + numberOfDecs);
        }
        else {
            int vertikal = (int) (Math.random() * decsCoeff);
            int horizontal = (int) (Math.random() * 10);
            ShipPosition.coordinates[0] = 1;
            ShipPosition.coordinates[1] = vertikal;
            ShipPosition.coordinates[2] = horizontal;
//            System.out.println("vert: y=" + ShipPosition.coordinates[1] + ", x=" + ShipPosition.coordinates[2] + " decks:" + numberOfDecs);
        }
    }
}
