import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BattleShootInput {
    private String shoot;

    public String getShoot() {
        return shoot;
    }

    public void setShoot(String shoot) {
        this.shoot = shoot;
    }

    public BattleShootInput() throws IOException {
        seaBattle();
    }

    private void seaBattle() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String shoot = reader.readLine();
        if (shoot.equals("showMaps")) {
            System.out.println("\t\tРасположение кораблей первого игрока\t\t\t\tРасположение кораблей второго игрока");
//            System.out.println("A\tB\tC\tD\tE\tF\tG\tH\tI\tJ\t\tA\tB\tC\tD\tE\tF\tG\tH\tI\tJ");
            System.out.println("    \tA___B___C___D___E___F___G___H___I___J\t\t\t    A___B___C___D___E___F___G___H___I___J");
            for(int i = 0; i < Players.playerOneMap.length; i++) {
                System.out.print((i+1) + "\t|\t");
                for(int j = 0; j < Players.playerOneMap.length; j++) {
                    System.out.print(Players.playerOneMap[i][j] + "\t");
                }

                System.out.print("\t" + (i+1) + "\t|\t");

                for(int j = 0; j < Players.playerTwoMap.length; j++) {
                    System.out.print(Players.playerTwoMap[i][j] + "\t");
                }
                System.out.println();
            }
            seaBattle();
        }
        else if (validateInputShoot(shoot)) {
            setShoot(shoot);
        }
        else {
            System.out.println("Повторите ваш ход. \nМожно использовать русский или английский алфавит (прописные или строчные буквы). \nABCDEFGHIJ или АБВГДЕЖЗИК");
            seaBattle();
        }
    }

        private boolean validateInputShoot(String s){
        return s.matches("^[A-Ja-jА-Еа-еЖ-Иж-иКк]{1}[0-9]{1,2}$");
        }
    }