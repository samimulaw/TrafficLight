import java.util.ArrayList;
import java.util.List;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> cars= new ArrayList<>();
		cars.add(1);
		cars.add(2);
		cars.add(3);
		cars.add(4);
		cars.remove(0);
		System.out.println(cars.get(0));
		cars.forEach(a->System.out.println(a));
		
	}

}
