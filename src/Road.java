import lib.Queueable;

public class Road {

    Queueable<Car> cars;

    public int sinceGreen = 0;

    public int sinceRed = 0;

    private boolean justStarting = true;

    public Road(Queueable<Car> cars) {
        this.cars = cars;
    }

    private TrafficLightColor trafficLightColor;

    public void turnLightGreen() {
        this.trafficLightColor = TrafficLightColor.GREEN;
        sinceGreen = 0;
    }

    public void turnLightRed() {
        this.trafficLightColor = TrafficLightColor.RED;
        sinceRed = 0;
    }

    public void moveOneSecond() {

        cars.enqueue(new Car());

        if(trafficLightColor == TrafficLightColor.GREEN && (sinceGreen > 0 || justStarting)) {

            cars.dequeue();

            justStarting = false;
        }

        if(trafficLightColor == TrafficLightColor.GREEN) {

            sinceGreen++;

            if(sinceGreen > 2) {

                turnLightRed();
            }

        } else {

            sinceRed++;

            if(sinceRed > 4) {

                turnLightGreen();
            }
        }
    }

    public TrafficLightColor getTrafficLightColor() {
        return trafficLightColor;
    }
}
