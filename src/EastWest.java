
public class EastWest implements TrafficLight {
	public static Queue ns_queue = new QueueImpl();

	@Override
	
	public void turnGreen() {
		// TODO Auto-generated method stub
		
		ns_queue.enque(new Car());
		System.out.println(ns_queue.size());
		ns_queue.enque(new Car());
		ns_queue.deque();
		System.out.println(ns_queue.size());
		ns_queue.enque(new Car());
		ns_queue.deque();
		System.out.println(ns_queue.size());
		changeLight();
	}

	@Override
	public void turnRed() {
		// TODO Auto-generated method stub

		ns_queue.enque(new Car());
		System.out.println(ns_queue.size());
		ns_queue.enque(new Car());
		System.out.println(ns_queue.size());
		ns_queue.enque(new Car());
		System.out.println(ns_queue.size());

		changeLight();
		

	}

	@Override
	public void waitingCars() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeLight() {
		// TODO Auto-generated method stub
		ns_queue.enque(new Car());
		System.out.println(ns_queue.size());
		System.out.println("change Light");
	}

}
