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
        setShoot(reader.readLine());
        //добавить проверку строки на правильность формата
        }
    }