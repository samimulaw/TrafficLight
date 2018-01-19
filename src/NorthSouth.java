import java.util.ArrayList;
import java.util.List;

public class NorthSouth implements TrafficLight {
	public static Queue queue = new QueueImpl();

	@Override
	public void turnGreen() {
		// TODO Auto-generated method stub
		if (queue.size() != 0)
			queue.enque(new Car());
//		else
//			System.out.println(queue.size());
		System.out.println(queue.size());
		queue.enque(new Car());
		queue.deque();
		System.out.println(queue.size());
		queue.enque(new Car());
		queue.deque();
		System.out.println(queue.size());
		changeLight();
	}

	@Override
	public void turnRed() {
		// TODO Auto-generated method stub
		queue.enque(new Car());
		System.out.println(queue.size());
		queue.enque(new Car());
		System.out.println(queue.size());
		queue.enque(new Car());
		System.out.println(queue.size());
		changeLight();
	}

	@Override
	public void waitingCars() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeLight() {
		// TODO Auto-generated method stub
		queue.enque(new Car());
		System.out.println(queue.size());
		System.out.println("change Light");
	}

}
