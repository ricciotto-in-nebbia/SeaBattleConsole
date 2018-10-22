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

//        new PlayGame(player1, player2);

        //ЦИКЛ


        while (PlayerShootCheck.isHit()) { //пока на поле первого игрока есть 1 или пока на поле второго игрока есть единицы
            player1.playerShoot();
            new PlayerShootCheck(player1.getShoot(), player2.getPlayerBattleMap());
            player2.battleMapPrint();
        }

//обратиться к методу в Плейрс - который обращется к методу ввода хода первого игрока, заполняет переменную внутри Плейрес
        //вызвать метод ПРОВЕРКА где идет проверка введеных координат с координатами БАТТЛ МАП
        //  -- если координаты не совпали - БРЕК
        // -- если координаты совпали- превращаем содержимое в 0
        // -- проверяем ккой именно корабль был подбит и меняем его палубу на ноль
        // проверяем этот корабль - если все ноли - пишем, что УБИЛ корабль (или что корабль РАНЕН)
        // если корабль был УБИТ то проверяем весь баттл мап на наличие единиц и и если их нет - пишем что победа
        //возврат в стартгейм и вторая часть цикла - ввод хода второго игрока


    }
}
