import lib.Queue;

public class Test {

    public static void main(String[] args) {

        Road snellRoad = new Road(new Queue());

        Road weaverRoad = new Road(new Queue());

        snellRoad.turnLightGreen();

        weaverRoad.turnLightRed();

        System.out.println(" 0. S =  0; N =  0; E =  0; W =  0");

        // For each seconds until twenty
        for (int i = 0; i < 20; i++) {

            System.out.printf("%2d. ", i + 1);

            snellRoad.moveOneSecond();

            System.out.printf("S = %2d; N = %2d;", snellRoad.cars.count(), snellRoad.cars.count());

            weaverRoad.moveOneSecond();

            System.out.printf(" E = %2d; w = %2d\n", weaverRoad.cars.count(), weaverRoad.cars.count());
        }
    }
}
