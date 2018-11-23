import java.io.IOException;

public class Players {
    static int[][] playerOneMap = new int[10][10];
    static int[][] playerTwoMap = new int[10][10];
    private int[][] playerBattleMap = new int[10][10];
    private int[][] battleMapEngagedZones = new int[10][10]; //ships and ship's zones
    Ships ships = new Ships(this.playerBattleMap, this.battleMapEngagedZones);
    private String name;
    private String shoot;

    public Players(String name) {
        this.name = name;
    }
    public void setPlayerBattleMap(int[][] playerBattleMap) {
        this.playerBattleMap = playerBattleMap;
    }
    public int[][] getPlayerBattleMap() { return playerBattleMap; }
    public void setBattleMapEngagedZones(int[][] battleMapEngagedZones) { this.battleMapEngagedZones = battleMapEngagedZones; }

    public void battleMapPrint() {
        for (int[] battleMapTEMP : this.playerBattleMap) { //вывод карты кораблей
            for (int batlleMapShipPosition : battleMapTEMP) {
                System.out.print(batlleMapShipPosition + "\t");
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

    public void playerShoot() throws IOException { setShoot(new BattleShootInput()); }
    public String getShoot() { return shoot; }
    public void setShoot(BattleShootInput shoot) {
        this.shoot = shoot.getShoot();
    }
}
