package ua.com.seaBattle;

/**
 * Created by Mykhailo on 19/09/2017.
 */
public class SeaBattle {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship();

        field.init();
//        field.show();
        field.setShip(player.shipPosition(ship));
//        field.show();
////        field.setShip(ship1);
////        field.show();
//
//        System.out.println();
//
        do {
            field.show();
            int xShoot = player.getXShoot();
            int yShoot = player.getYShoot();
            field.doShoot(xShoot, yShoot);
        } while (field.isNotGameOver());
        field.show();
    }
}
