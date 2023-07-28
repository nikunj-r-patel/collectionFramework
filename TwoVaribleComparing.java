package collectionFramework;

import java.util.Comparator;

public class TwoVaribleComparing  implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		// TODO Auto-generated method stub
		int nameComp=obj1.getName().compareTo(obj2.getName());
		int ageComp= obj1.getAge().compareTo(obj2.getAge());
		return (nameComp==0)?ageComp:nameComp;
	}
	

}
