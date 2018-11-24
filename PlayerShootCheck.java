public class PlayerShootCheck {
    public static boolean isWin() {
        return PlayerShootCheck.win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    private static boolean win = false;
    private String playerShoot;

    public void setAnotherPlayerBattleMap(int y, int x) {
        this.anotherPlayerBattleMap[y][x] = 5;
    }

    private int[][] anotherPlayerBattleMap;

    public static boolean isHit() {
        return PlayerShootCheck.hit;
    }

    public void setHit(boolean hit) {
        PlayerShootCheck.hit = hit;
    }

    private static boolean hit = true;

    public PlayerShootCheck(String playerShoot, int[][] anotherPlayerBattleMap) {
        this.playerShoot = playerShoot;
        this.anotherPlayerBattleMap = anotherPlayerBattleMap;
        shootCheck();
    }

    private void shootCheck(){
        char[] shootChars = this.playerShoot.toCharArray();
        int x = -1;
        int y = -1;
        if (shootChars[0]=='A' || shootChars[0]=='a' || shootChars[0]=='А' || shootChars[0]=='а') x = 0;
        if (shootChars[0]=='B' || shootChars[0]=='b' || shootChars[0]=='Б' || shootChars[0]=='б') x = 1;
        if (shootChars[0]=='C' || shootChars[0]=='c' || shootChars[0]=='В' || shootChars[0]=='в') x = 2;
        if (shootChars[0]=='D' || shootChars[0]=='d' || shootChars[0]=='Г' || shootChars[0]=='г') x = 3;
        if (shootChars[0]=='E' || shootChars[0]=='e' || shootChars[0]=='Д' || shootChars[0]=='д') x = 4;
        if (shootChars[0]=='F' || shootChars[0]=='f' || shootChars[0]=='Е' || shootChars[0]=='е') x = 5;
        if (shootChars[0]=='G' || shootChars[0]=='g' || shootChars[0]=='Ж' || shootChars[0]=='ж') x = 6;
        if (shootChars[0]=='H' || shootChars[0]=='h' || shootChars[0]=='З' || shootChars[0]=='з') x = 7;
        if (shootChars[0]=='I' || shootChars[0]=='i' || shootChars[0]=='И' || shootChars[0]=='и') x = 8;
        if (shootChars[0]=='J' || shootChars[0]=='j' || shootChars[0]=='К' || shootChars[0]=='к') x = 9;

        if (shootChars.length == 2) {
            if (shootChars[1] == '1') y = 0;
            if (shootChars[1] == '2') y = 1;
            if (shootChars[1] == '3') y = 2;
            if (shootChars[1] == '4') y = 3;
            if (shootChars[1] == '5') y = 4;
            if (shootChars[1] == '6') y = 5;
            if (shootChars[1] == '7') y = 6;
            if (shootChars[1] == '8') y = 7;
            if (shootChars[1] == '9') y = 8;
        }
        else if (shootChars[1] == '1' && shootChars[2] == '0') y = 9;

        if (anotherPlayerBattleMap[y][x] != 1) {
            System.out.print("Мимо! ");
            setHit(false);
        }
        else {
            setHit(true);
            System.out.println("Попал!");
            setAnotherPlayerBattleMap(y, x);
            if (playerWin(this.anotherPlayerBattleMap)) {
                System.out.println("Поздравляю, вы - победили!");

                System.out.println("Расположение кораблей первого игрока\t\tРасположение кораблей второго игрока");
                System.out.println("a\tb\tc\td\te\tf\tg\th\ti\tj\t\ta\tb\tc\td\te\tf\tg\th\ti\tj");
                for(int i = 0; i < Players.playerOneMap.length; i++) {
                    for(int j = 0; j < Players.playerOneMap.length; j++) { System.out.print(Players.playerOneMap[i][j] + "\t"); }
                    System.out.print("\t");
                    for(int j = 0; j < Players.playerTwoMap.length; j++) { System.out.print(Players.playerTwoMap[i][j] + "\t"); }
                    System.out.println();
                }
            }
        }
    }
    private boolean playerWin(int[][] anotherPlayerBattleMap){
        boolean win = false;
        int x = 8;
        for (int i = 0; i < anotherPlayerBattleMap.length; i++) {
            for (int j = 0; j < anotherPlayerBattleMap.length; j++) {
                if (anotherPlayerBattleMap[i][j] == 1) x = 0;
                if (i == 9 && j == 9 && x != 0) {
                    win = true;
                    break;
                }
            }
        }
        setWin(win);
        return win;
    }
}
