public class Players {

    public void setPlayerBattleMap(int[][] playerBattleMap) {
        this.playerBattleMap = playerBattleMap;
    }

    private int[][] playerBattleMap = new int[10][10];

    public void setBattleMapEngagedZones(int[][] battleMapEngagedZones) {
        this.battleMapEngagedZones = battleMapEngagedZones;
    }

    private int[][] battleMapEngagedZones = new int[10][10]; //ships and ship's zones

    public Players(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    private int score;
    Ships ships = new Ships(this.playerBattleMap, this.battleMapEngagedZones);


    public void battleMapPrint() {
        for (int[] battleMapTEMP : this.playerBattleMap) { //вывод карты кораблей
            for (int batlleMapShipPosition : battleMapTEMP) {
                System.out.print(batlleMapShipPosition+ "\t");
            }
            System.out.println();
        }
    }
    public void battleMapEngagedZonesPrint() {
        for (int[] battleMapTEMP0 : this.battleMapEngagedZones) { //вывод карты кораблей и зон
            for (int battleMapShipPositiontemp : battleMapTEMP0) {
                System.out.print(battleMapShipPositiontemp + "\t");
            }
            System.out.println();
        }
    }
}