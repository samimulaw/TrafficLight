import lib.Queueable;

public class Road {

    Queueable<Car> cars;

    private int secondsSinceGreen = 0;

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

        secondsSinceGreen += 1;

        if(secondsSinceGreen == 3) {
            this.trafficLightColor = TrafficLightColor.RED;
            secondsSinceGreen = 0;
        }

        // cars move into the road all the time
        cars.enqueue();

        // take one car out only if secondsSinceGreen >= 1
        if(this.trafficLightColor == TrafficLightColor.GREEN && this.secondsSinceGreen >= 1) {
            cars.dequeue();
        }
    }
}
