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
        secondsSinceGreen=1;
        
    }

    public void turnLightRed() {
        this.trafficLightColor = TrafficLightColor.RED;
    }

    public void moveOneSecond() {

    	secondsSinceGreen += 1;

        if(secondsSinceGreen == 3) {
        	if(this.trafficLightColor==TrafficLightColor.GREEN)
        		this.trafficLightColor = TrafficLightColor.RED;
        	else 
        		this.trafficLightColor = TrafficLightColor.GREEN;
        	
            secondsSinceGreen = 0;
        }

        // cars move into the road all the time
        cars.enqueue(new Car());

        // take one car out only if secondsSinceGreen >= 1
        if(this.trafficLightColor == TrafficLightColor.GREEN && this.secondsSinceGreen >= 1) {
            cars.dequeue();
        }
        
        
    }
}
