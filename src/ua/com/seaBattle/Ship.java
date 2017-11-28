package ua.com.seaBattle;

/**
 * Created by Mykhailo on 19/09/2017.
 */
public class Ship {
//    int position;
//    int size;
    int xCoordinate;
    int yCoordinate;
    int size;
    boolean isHorizontal;

    public Ship() {
    }

    public Ship(int xCoordinate, int yCoordinate, int size, boolean isHorizontal) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.size = size;
        this.isHorizontal = isHorizontal;
    }

    public Ship(int xCoordinate, int yCoordinate, int size) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.size = size;
    }

    //    public Ship(int position) {
//        this.position = position;
//    }

//    public Ship(int position, int size) {
//        this.position = position;
//        this.size = size;
//    }
}
