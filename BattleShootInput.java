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
        String s = reader.readLine();
        if (s.equals("showMaps")) {
            for(int i = 0; i < Players.playerOneMap.length; i++) {
                for(int j = 0; j < Players.playerOneMap.length; j++) {
                    System.out.print(Players.playerOneMap[i][j] + "\t");
                }

                System.out.print("\t");

                for(int j = 0; j < Players.playerTwoMap.length; j++) {
                    System.out.print(Players.playerTwoMap[i][j] + "\t");
                }
                System.out.println();
            }
            seaBattle();
        }
        else if (validateInputShoot(s)) setShoot(s);
        else {
            System.out.println("Повторите ваш ход. \nМожно использовать русский или английский алфавит (прописные или строчные буквы). \nABCDEFGHIJK или АБВГДЕЖЗИК");
            seaBattle();
        }
    }

        private boolean validateInputShoot(String s){
        return s.matches("^[A-Ja-jА-Еа-еЖ-Иж-иКк]{1}[0-9]{1,2}$");
        }
    }