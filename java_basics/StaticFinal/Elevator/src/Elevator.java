import java.net.SocketOption;

public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor || floor == currentFloor) {
            System.out.println("Лифт не может проехать на данный этаж:");
        } else if (currentFloor < floor) {
            while (currentFloor < floor) {
                moveUp();
                System.out.println("Вы сейчас на:" + currentFloor + "этаже.");

            }
        } else while (currentFloor > floor)
            moveDown();
        System.out.println("Вы сейчас на: " + currentFloor + "этаже.");

    }
}

