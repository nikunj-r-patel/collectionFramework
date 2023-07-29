package collectionFramework;

import java.util.Comparator;

public class Helper implements Comparator<String> {

	@Override
	public int compare(String car1, String car2) {
		// TODO Auto-generated method stub
		String first_car,second_car;
		
		first_car=car1;
		second_car=car2;
		return second_car.compareTo(first_car);
		//return first_car.compareTo(second_car);
	}

}
