import java.io.IOException;

public class PlayGame {
    private Players player1;
    private Players player2;
    private int[][] player1BattleMap;
    private int[][] player2BattleMap;

    public PlayGame(Players player1, Players player2, int[][] player1BattleMap, int[][] player2BattleMap) throws IOException {
        this.player1 = player1;
        this.player2 = player2;
        this.player1BattleMap = player1BattleMap;
        this.player2BattleMap = player2BattleMap;
        playGame();
    }

    public void playGame() throws IOException {
        while (!PlayerShootCheck.isWin()) {
            while (true) {
                System.out.println("Ход первого игрока");
                player1.playerShoot();
                new PlayerShootCheck(player1.getShoot(), player2BattleMap);
                if (PlayerShootCheck.isWin()) break;
                if (!PlayerShootCheck.isHit()) break;
//                player2.battleMapPrint();
            }
            if (PlayerShootCheck.isWin()) break;
            while (true) {
                System.out.println("Ход второго игрока");
                player2.playerShoot();
                new PlayerShootCheck(player2.getShoot(), player1BattleMap);
                if (PlayerShootCheck.isWin()) break;
                if (!PlayerShootCheck.isHit()) break;
//                player1.battleMapPrint();
            }
        }
    }
}
