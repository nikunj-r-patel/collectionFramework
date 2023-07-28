package collectionFramework;

import java.util.Comparator;

public class SortByIdNo implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getIdNo()-o2.getIdNo();
	}
	
	

}
