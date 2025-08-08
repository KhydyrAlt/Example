public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Ошибка: этаж должен быть между " + minFloor + " и " + maxFloor);
        } else if (floor == currentFloor) {
            System.out.println("Лифт уже на этом этаже");
        } else if (currentFloor < floor) {
            System.out.println("Лифт поднимается...");
            while (currentFloor < floor) {
                moveUp();
                System.out.println("Текущий этаж: " + currentFloor);
            }
        } else {
            System.out.println("Лифт опускается...");
            while (currentFloor > floor) {
                moveDown();
                System.out.println("Текущий этаж: " + currentFloor);
            }
        }
    }
}