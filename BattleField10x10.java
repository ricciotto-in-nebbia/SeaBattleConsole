class BattleField10x10 {

    public static int[][] getShipPositionOnBattleMap() { return shipPositionOnBattleMap; }

    public static void setShipPositionOnBattleMap(int[][] shipPositionOnBattleMap) {
        BattleField10x10.shipPositionOnBattleMap = shipPositionOnBattleMap;
    }

    private static int[][] shipPositionOnBattleMap;

    public static int[][] getShipPosition() {
        return shipPosition;
    }

    public static void setShipPosition(int[][] shipPosition) {
        BattleField10x10.shipPosition = shipPosition;
    }

    private static int[][] shipPosition;

    public static int[][] getBattleMapEngagedZones() { return battleMapEngagedZones; }

    public static void setBattleMapEngagedZones(int[][] battleMapEngagedZones) {
        BattleField10x10.battleMapEngagedZones = battleMapEngagedZones;
    }

    private static int[][] battleMapEngagedZones;

    public BattleField10x10(int numberOfDecks, int decksCoeff, int[][] playerBattleMap, int[][] battleMapEngagedZones) {
        this.battleShipsPosition(numberOfDecks, decksCoeff, playerBattleMap, battleMapEngagedZones);
    }

    private void battleShipsPosition(int numberOfDecks, int decksCoeff, int[][] playerBattleMap, int[][] battleMapEngagedZones) {
        int[][] shipPositionOnBattleMap = new int[10][10];
        ShipPosition shipPosition = new ShipPosition(numberOfDecks, decksCoeff);

        int[] shipCoordinationPlayer = ShipPosition.getCoordinates();
//        System.out.println("shipCoordinationPlayer hor=0, vert=1: "+ shipCoordinationPlayer[0] + " y= " + shipCoordinationPlayer[1] + " x= " +  shipCoordinationPlayer[2]);

        ShipPositionControl controlPositionTempObject = new ShipPositionControl(battleMapEngagedZones, shipCoordinationPlayer, numberOfDecks);
        boolean shipControl = ShipPositionControl.isShipControl();
        if (shipControl) {
            if (shipCoordinationPlayer[0] == 0) for (int i = 0; i < numberOfDecks; i++) shipPositionOnBattleMap[shipCoordinationPlayer[1]][shipCoordinationPlayer[2] + i] = 1;
            else for (int i = 0; i < numberOfDecks; i++) shipPositionOnBattleMap[shipCoordinationPlayer[1] + i][shipCoordinationPlayer[2]] = 1;
        }
        else {
            battleShipsPosition(numberOfDecks, decksCoeff, playerBattleMap, battleMapEngagedZones);
        }
        setShipPosition(shipPositionOnBattleMap);
        shipOnMap(playerBattleMap, shipPositionOnBattleMap);
        engaged(shipPositionOnBattleMap, battleMapEngagedZones);
    }

    public void shipOnMap(int[][] playerBattleMap, int[][] shipPositionOnBattleMap){
        for (int i = 0; i < playerBattleMap.length; i++) {
            for (int j = 0; j < playerBattleMap.length; j++) {
                playerBattleMap[i][j] += shipPositionOnBattleMap[i][j];
            }
        }
        setShipPositionOnBattleMap(playerBattleMap);
    }

        private void engaged(int[][] shipPositionOnBattleMap, int[][] battleMapEngagedZones){
        for (int i = 0; i < shipPositionOnBattleMap.length; i++) {
            for (int j = 0; j < shipPositionOnBattleMap.length; j++) {
                if (shipPositionOnBattleMap[i][j] > 0) {
                    battleMapEngagedZones[Math.abs(i - 1)][Math.abs(j - 1)] = 8;
                    battleMapEngagedZones[Math.abs(i - 1)][j] = 8;
                    battleMapEngagedZones[i][j] = 8;
                    battleMapEngagedZones[i][Math.abs(j - 1)] = 8;
                    if (j < 9) {
                        battleMapEngagedZones[i][j + 1] = 8;
                        battleMapEngagedZones[Math.abs(i -1)][j + 1] = 8;
                    }
                    if (i < 9) {
                        battleMapEngagedZones[i + 1][Math.abs(j - 1)] = 8;
                        battleMapEngagedZones[i + 1][j] = 8;
                    }
                    if (i < 9 && j < 9) {
                        battleMapEngagedZones[i + 1][j + 1] = 8;
                    }
                }
            }
        }
        setBattleMapEngagedZones(battleMapEngagedZones);
    }
}
