import lib.Queue;

public class Test {

    public static void main(String[] args) {

        Road snellRoad = new Road(new Queue());

        Road weaverRoad = new Road(new Queue());

        snellRoad.turnLightGreen();

        weaverRoad.turnLightRed();

        // For each seconds until twenty
        for (int i = 0; i < 20; i++) {
        	System.out.print(i + ". " );
        	snellRoad.moveOneSecond();
            System.out.print("S -> " + snellRoad.cars.count() + "N -> " + snellRoad.cars.count());
            weaverRoad.moveOneSecond();
            System.out.println("E  ->"+weaverRoad.cars.count() + " W ->" + weaverRoad.cars.count());
            
        }
    }
}
