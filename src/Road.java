import lib.Queueable;

public class Road {

    public Queueable<Car> cars;

    public int sinceGreen = 0;

    public int sinceRed = 0;

    public boolean turnedRed = false;

    Road(Queueable<Car> cars) {
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
        turnedRed = true;
    }

    public void moveOneSecond() {
        cars.enqueue(new Car());
        if (trafficLightColor == TrafficLightColor.GREEN && sinceGreen > 2) {
            turnLightRed();
        }

        if (trafficLightColor == TrafficLightColor.RED && sinceRed > 4) {
            turnLightGreen();
        }

        if(trafficLightColor == TrafficLightColor.GREEN) {
            if(sinceGreen > 0 || sinceRed == 0) { // sinceRed == 0 test if the car has never been red so far. The green light is just beginning
                cars.dequeue();
            }
            sinceGreen++;
        } else {
            sinceRed++;
        }
    }

    public TrafficLightColor getTrafficLightColor() {
        return trafficLightColor;
    }
}
