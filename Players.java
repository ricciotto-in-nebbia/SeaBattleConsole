import java.io.IOException;

public class Players {
    static int[][] playerOne = new int[10][10];
    static int[][] playerTwo = new int[10][10];

    public void setPlayerBattleMap(int[][] playerBattleMap) {
        this.playerBattleMap = playerBattleMap;
    }

    public int[][] getPlayerBattleMap() { return playerBattleMap; }

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

    private String shoot;
}
