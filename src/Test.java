import lib.Queue;

public class Test {

    public static void main(String[] args) {

        Road snellRoad = new Road(new Queue());

        Road weaverRoad = new Road(new Queue());

        snellRoad.turnLightGreen();

        weaverRoad.turnLightRed();

        // For each seconds until twenty
        for (int i = 0; i < 20; i++) {

            weaverRoad.moveOneSecond();

            snellRoad.moveOneSecond();
        }
    }
}
