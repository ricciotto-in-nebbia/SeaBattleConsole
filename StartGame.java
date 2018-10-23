import java.io.IOException;

public class StartGame {
    public static void main(String[] args) throws IOException {
        Players player1 = new Players("Первый игрок");
        player1.setPlayerBattleMap(BattleField10x10.getShipPositionOnBattleMap());
        player1.setBattleMapEngagedZones(BattleField10x10.getBattleMapEngagedZones());
        System.out.println(player1.getName());
        player1.battleMapPrint();
        System.out.println();
        player1.battleMapEngagedZonesPrint();

        Players player2 = new Players("Второй игрок");
        player2.setPlayerBattleMap(BattleField10x10.getShipPositionOnBattleMap());
        player2.setBattleMapEngagedZones(BattleField10x10.getBattleMapEngagedZones());
        System.out.println();
        System.out.println(player2.getName());
        player2.battleMapPrint();
        System.out.println();
        player2.battleMapEngagedZonesPrint();

        new PlayGame(player1, player2, player1.getPlayerBattleMap(), player2.getPlayerBattleMap());
    }
}
