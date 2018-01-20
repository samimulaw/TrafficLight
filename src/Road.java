import lib.Queueable;

public class Road {

    Queueable<Car> cars;

    private int secondsSinceChange = 0;

    public Road(Queueable cars) {
        this.cars = cars;
    }

    private TrafficLightColor trafficLightColor;

    public void turnLightGreen() {
        this.trafficLightColor = TrafficLightColor.GREEN;
    }

    public void turnLightRed() {
        this.trafficLightColor = TrafficLightColor.RED;
    }

    public void moveOneSecond() {

        secondsSinceChange += 1;

        if(trafficLightColor == TrafficLightColor.RED && secondsSinceChange == 5 ||
                trafficLightColor == TrafficLightColor.GREEN && secondsSinceChange == 4) {

            trafficLightColor = trafficLightColor == TrafficLightColor.GREEN ? TrafficLightColor.RED : TrafficLightColor.GREEN;

            secondsSinceChange = 0;
        }

        // cars move into the road all the time
        cars.enqueue(new Car());

        // take one car out only if secondsSinceChange >= 1
        if(this.trafficLightColor == TrafficLightColor.GREEN && this.secondsSinceChange >= 1) {
            cars.dequeue();
        }
    }
}
