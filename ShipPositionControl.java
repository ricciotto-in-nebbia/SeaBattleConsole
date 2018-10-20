public class ShipPositionControl {


    public static boolean isShipControl() {
        return shipControl;
    }

    private static boolean shipControl = false;

    public ShipPositionControl(int[][] battleMapEngagedZones, int[] shipCoordination, int numberOfDecks) {
        controlPosition(battleMapEngagedZones, shipCoordination, numberOfDecks);
    }

    private void controlPosition(int[][] battleMapEngagedZones, int[] shipCoordination, int numberOfDecks) {
        boolean b = false;
        if (shipCoordination[0] == 0) {
            for (int i = 0; i < numberOfDecks; i++) {
                if (battleMapEngagedZones[shipCoordination[1]][shipCoordination[2] + i] != 8)
                    b = true;
                else {
                    b = false;
                    break;
                }
            }
        }
        else {
            for (int i = 0; i < numberOfDecks; i++) {
                if (battleMapEngagedZones[shipCoordination[1] + i][shipCoordination[2]] != 8)
                    b = true;
                else {
                    b =  false;
                    break;
                }
            }
        }
        ShipPositionControl.shipControl = b;
//        System.out.println(b);
    }
}