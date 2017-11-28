package ua.com.seaBattle;

import java.util.Scanner;

/**
 * Created by Mykhailo on 19/09/2017.
 */
public class Player {
    Scanner scanner = new Scanner(System.in);

//    public int countShips() {
//        System.out.println("Enter the ship count: ");
//        int countShips = scanner.nextInt();
//        System.out.println();
//        return countShips;
//    }

    public Ship shipPosition(Ship ship) {
        System.out.print("Enter ship x coordinate: ");
        int xCoordinate = scanner.nextInt();
        ship.xCoordinate = xCoordinate;
        System.out.print("Enter ship y coordinate: ");
        int yCoordinate = scanner.nextInt();
        ship.yCoordinate = yCoordinate;
        System.out.print("Enter ship size: ");
        int size = scanner.nextInt();
        ship.size = size;
        System.out.print("Enter 1 if ship horizontal and 0 if not :");
        int isHorizontal = scanner.nextInt();
        if (isHorizontal == 1){
            ship.isHorizontal = true;
        } else if (isHorizontal == 0) {
            ship.isHorizontal = false;
        } else {
            System.out.println("Error!");
        }
        return ship;
    }

    public int getXShoot() {
        System.out.print("Where is your x shoot: ");
        int shoot = scanner.nextInt();
//        System.out.print("\nYour Enter: " + shoot + "\n");
        return shoot;
    }

    public int getYShoot() {
        System.out.print("Where is your y shoot: ");
        int shoot = scanner.nextInt();
//        System.out.print("\nYour Enter: " + shoot + "\n");
        return shoot;
    }

}
