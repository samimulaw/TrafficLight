import java.util.ArrayList;
import java.util.List;

public class QueueImpl implements Queue
{
	
	 List<Car> cars= new ArrayList<>();

	@Override
	public void enque(Car c) {
		// TODO Auto-generated method stub
		cars.add(c);
	}

	@Override
	public void deque() {
		// TODO Auto-generated method stub
		cars.remove(0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return cars.size();
	}

}
