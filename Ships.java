public class Ships {
    public Ships(int[][] playerBattleMap, int[][] battleMapEngagedZones) {
        this.playerBattleMap = playerBattleMap;
        this.battleMapEngagedZones = battleMapEngagedZones;
        Ships.FourDeck ships4 = new Ships.FourDeck();
        Ships.ThreeDeck ships3_1 = new Ships.ThreeDeck();
        Ships.ThreeDeck ships3_2 = new Ships.ThreeDeck();
        Ships.TwoDeck ships2_1 = new Ships.TwoDeck();
        Ships.TwoDeck ships2_2 = new Ships.TwoDeck();
        Ships.TwoDeck ships2_3 = new Ships.TwoDeck();
        Ships.OneDeck ships1_1 = new Ships.OneDeck();
        Ships.OneDeck ships1_2 = new Ships.OneDeck();
        Ships.OneDeck ships1_3 = new Ships.OneDeck();
        Ships.OneDeck ships1_4 = new Ships.OneDeck();
    }

    public int[][] getBattleMapEngagedZones() {
        return battleMapEngagedZones;
    }

    public int[][] getPlayerBattleMap() {
        return playerBattleMap;
    }

    private int[][] playerBattleMap;
    private int[][] battleMapEngagedZones;

    private class FourDeck {
        String shipName = "четырехпалубный корабль";
        private int numberOfDecks = 4;
        private int decksCoeff = 7;
        BattleField10x10 battleField10x10 = new BattleField10x10(numberOfDecks, decksCoeff, getPlayerBattleMap(), getBattleMapEngagedZones());


        public void setShipPosition(int[][] shipPosition) {
            this.shipPosition = shipPosition;
        }

        public int[][] getShipPosition() {
            return shipPosition;
        }

        private int[][] shipPosition;
        int[] decks = {1, 1, 1, 1};
//        String status = integrityСheck(decks);
//
    }

    private class ThreeDeck {
        String shipName = "трехпалубник";
        private int numberOfDecks = 3;
        private int decksCoeff = 8;
        BattleField10x10 battleField10x10 = new BattleField10x10(numberOfDecks, decksCoeff,  getPlayerBattleMap(), getBattleMapEngagedZones());
        int[] decks = {1, 1, 1};
//        String status = integrityСheck(decs);

        public ThreeDeck() {
        }
    }
    private class TwoDeck {
        String shipName = "двупалубник";
        int numberOfDecks = 2;
        int decksCoeff = 9;
        BattleField10x10 battleField10x10 = new BattleField10x10(numberOfDecks, decksCoeff,  getPlayerBattleMap(), getBattleMapEngagedZones());
        int[] decks = {1, 1};
//        String status = integrityСheck(decs);

        public TwoDeck() {
        }
    }
    private class OneDeck {
        String shipName = "однопалубник";
        int numberOfDecks = 1;
        int decksCoeff = 10;
        BattleField10x10 battleField10x10 = new BattleField10x10(numberOfDecks, decksCoeff,  getPlayerBattleMap(), getBattleMapEngagedZones());
        int[] decks = {1};
//        String status = integrityСheck(decs);

        public OneDeck() {
        }
    }
}
