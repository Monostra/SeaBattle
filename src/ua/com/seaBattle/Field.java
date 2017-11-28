package ua.com.seaBattle;

/**
 * Created by Mykhailo on 19/09/2017.
 */
public class Field {
    public static final int SIZE = 10;
    char[][] cells = new char[SIZE][SIZE];
    Ship ship;

    public void init() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = '.';
            }
        }
    }

    public void show() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }
//        System.out.println(cells);
    }

    public void setShip(Ship ship) {
        this.ship = ship;

        if (ship.isHorizontal) {
            if (ship.size == 1) {
                cells[ship.xCoordinate][ship.yCoordinate] = 'X';
            }
            if (ship.size == 2) {
                cells[ship.xCoordinate][ship.yCoordinate] = 'X';
                cells[ship.xCoordinate][ship.yCoordinate + 1] = 'X';
            }
            if (ship.size == 3) {
                cells[ship.xCoordinate][ship.yCoordinate] = 'X';
                cells[ship.xCoordinate][ship.yCoordinate + 1] = 'X';
                cells[ship.xCoordinate][ship.yCoordinate + 2] = 'X';
            }
            if (ship.size == 4) {
                cells[ship.xCoordinate][ship.yCoordinate] = 'X';
                cells[ship.xCoordinate][ship.yCoordinate + 1] = 'X';
                cells[ship.xCoordinate][ship.yCoordinate + 2] = 'X';
                cells[ship.xCoordinate][ship.yCoordinate + 3] = 'X';
            }
        } else {
            if (ship.size == 1) {
                cells[ship.xCoordinate][ship.yCoordinate] = 'X';
            }
            if (ship.size == 2) {
                cells[ship.xCoordinate][ship.yCoordinate] = 'X';
                cells[ship.xCoordinate + 1][ship.yCoordinate] = 'X';
            }
            if (ship.size == 3) {
                cells[ship.xCoordinate][ship.yCoordinate] = 'X';
                cells[ship.xCoordinate + 1][ship.yCoordinate] = 'X';
                cells[ship.xCoordinate + 2][ship.yCoordinate] = 'X';
            }
            if (ship.size == 4) {
                cells[ship.xCoordinate][ship.yCoordinate] = 'X';
                cells[ship.xCoordinate + 1][ship.yCoordinate] = 'X';
                cells[ship.xCoordinate + 2][ship.yCoordinate] = 'X';
                cells[ship.xCoordinate + 3][ship.yCoordinate] = 'X';
            }
        }
    }
//    public void setShip(Ship ship) {
//        this.ship = ship;
//        cells[ship.position] = 'X';
//    }

//    public void setShip(Ship ship) {
//        this.ship = ship;
//        if (ship.size == 1) {
//            cells[ship.position] = 'X';
//        } else if (ship.size == 2) {
//            cells[ship.position] = 'X';
//            cells[ship.position + 1] = 'X';
//        } else if (ship.size == 3) {
//            cells[ship.position] = 'X';
//            cells[ship.position + 1] = 'X';
//            cells[ship.position + 2] = 'X';
//        } else if (ship.size == 4) {
//            cells[ship.position] = 'X';
//            cells[ship.position + 1] = 'X';
//            cells[ship.position + 2] = 'X';
//            cells[ship.position + 3] = 'X';
//        }
//    }
//

    public void doShoot(int xShoot, int yShoot) {
        switch (cells[xShoot][yShoot]) {
            case '.':
                System.out.println("Miss");
                cells[xShoot][yShoot] = '*';
                break;
            case 'X':
                System.out.println("Hit");
                cells[xShoot][yShoot] = '-';
                break;
            case '*':
                System.out.println("Already shot");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }

//    public void doShoot(int shoot) {
//        switch (cells[shoot]) {
//            case '.':
//                System.out.println("Miss");
//                cells[shoot] = '*';
//                break;
//            case 'X':
//                System.out.println("Hit");
//                cells[shoot] = '-';
//                break;
//            case '*':
//                System.out.println("Already shot");
//                break;
//            default:
//                System.out.println("Error!");
//                break;
//        }
//    }
//
//    public boolean isNotGameOver() {
//        for (int i = 0; i < cells.length; i++) {
//            if (cells[i] == 'X') {
//                return true;
//            }
//        }
//        System.out.println("YOU WIN");
//        return false;
////        return cells[ship.position] == 'X';
//    }

    public boolean isNotGameOver() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == 'X') {
                    return true;
                }
            }
        }
        System.out.println("YOU WIN");
        return false;
    }



    
}
