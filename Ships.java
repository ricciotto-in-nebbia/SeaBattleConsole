public class Ships {
    private int[][] playerBattleMap;
    private int[][] battleMapEngagedZones;

    public Ships(int[][] playerBattleMap, int[][] battleMapEngagedZones) {
        this.playerBattleMap = playerBattleMap;
        this.battleMapEngagedZones = battleMapEngagedZones;

        FourDeck ships4 = new FourDeck();
        int[][] ship4 = ships4.getShipPosition();
        String ship4Name = ships4.getShipName();

        Ships.ThreeDeck ships3_1 = new Ships.ThreeDeck();
        int[][] ship3_1 = ships3_1.getShipPosition();
        String ship3_1Name = ships3_1.getShipName();

        Ships.ThreeDeck ships3_2 = new Ships.ThreeDeck();
        int[][] ship3_2 = ships3_2.getShipPosition();
        String ship3_2Name = ships3_2.getShipName();

        Ships.TwoDeck ships2_1 = new Ships.TwoDeck();
        int[][] ship2_1 = ships2_1.getShipPosition();
        String ship2_1Name = ships2_1.getShipName();

        Ships.TwoDeck ships2_2 = new Ships.TwoDeck();
        int[][] ship2_2 = ships2_2.getShipPosition();
        String ship2_2Name = ships2_2.getShipName();

        Ships.TwoDeck ships2_3 = new Ships.TwoDeck();
        int[][] ship2_3 = ships2_3.getShipPosition();
        String ship2_3Name = ships2_3.getShipName();

        Ships.OneDeck ships1_1 = new Ships.OneDeck();
        int[][] ship1_1 = ships1_1.getShipPosition();
        String ship1_1Name = ships1_1.getShipName();

        Ships.OneDeck ships1_2 = new Ships.OneDeck();
        int[][] ship1_2 = ships1_2.getShipPosition();
        String ship1_2Name = ships1_2.getShipName();

        Ships.OneDeck ships1_3 = new Ships.OneDeck();
        int[][] ship1_3 = ships1_3.getShipPosition();
        String ship1_3Name = ships1_3.getShipName();

        Ships.OneDeck ships1_4 = new Ships.OneDeck();
        int[][] ship1_4 = ships1_4.getShipPosition();
        String ship1_4Name = ships1_4.getShipName();
    }

    public int[][] getBattleMapEngagedZones() {
        return battleMapEngagedZones;
    }
    public int[][] getPlayerBattleMap() {
        return playerBattleMap;
    }

    private class FourDeck {
        String shipName = "Четырехпалубный корабль";
        private int numberOfDecks = 4;
        private int decksCoeff = 7;
        BattleField10x10 battleField10x10 = new BattleField10x10(numberOfDecks, decksCoeff, getPlayerBattleMap(), getBattleMapEngagedZones());
        public int[][] getShipPosition() {
            return shipPosition;
        }
        private int[][] shipPosition = BattleField10x10.getShipPosition();
        public String getShipName() { return shipName; }
    }

    private class ThreeDeck {
        String shipName = "Трехпалубный корабль";
        private int numberOfDecks = 3;
        private int decksCoeff = 8;
        BattleField10x10 battleField10x10 = new BattleField10x10(numberOfDecks, decksCoeff,  getPlayerBattleMap(), getBattleMapEngagedZones());
        public int[][] getShipPosition() {
            return shipPosition;
        }
        private int[][] shipPosition = BattleField10x10.getShipPosition();
        public String getShipName() { return shipName; }
    }
    private class TwoDeck {
        String shipName = "Двухпалубный корабль";
        int numberOfDecks = 2;
        int decksCoeff = 9;
        BattleField10x10 battleField10x10 = new BattleField10x10(numberOfDecks, decksCoeff,  getPlayerBattleMap(), getBattleMapEngagedZones());
        public int[][] getShipPosition() {
            return shipPosition;
        }
        private int[][] shipPosition = BattleField10x10.getShipPosition();
        public String getShipName() { return shipName; }
    }
    private class OneDeck {
        String shipName = "Однопалубный корабль";
        int numberOfDecks = 1;
        int decksCoeff = 10;
        BattleField10x10 battleField10x10 = new BattleField10x10(numberOfDecks, decksCoeff,  getPlayerBattleMap(), getBattleMapEngagedZones());
        public int[][] getShipPosition() {
            return shipPosition;
        }
        private int[][] shipPosition = BattleField10x10.getShipPosition();
        public String getShipName() { return shipName; }
    }
}
