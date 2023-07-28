package collectionFramework;

import java.util.*;

public class ListInterface {

	public static void main(String[] args) {

		Collection<Integer> list1 = new ArrayList<Integer>(5);
		list1.add(50);
		list1.add(60);
		list1.add(85);
		list1.add(88);
		System.out.println(list1);// printing list in [] format

		Collection<Integer> list2 = new ArrayList<>();
		list2.add(40);
		list2.add(45);
		System.out.println(list2);

		list2.addAll(list1);
		System.out.println(list2);

		Iterator<Integer> i = list1.iterator();
		while (i.hasNext()) {
			// Integer integer = (Integer) i.next();
			System.out.println(i.next());
		}
		List<Integer> l1 = new ArrayList<>();
		l1.add(0, 25);//Adding element
		l1.add(1, 20);
		System.out.println(l1);
		
		l1.set(1, 28);//updating element
		
		List<String> l2=new ArrayList<>();
		l2.add("nikunj");
		l2.add("mayank");
		l2.add("tejas");
		l2.add("niraj");
		l2.add("nikunj");
		
		System.out.println(l2);
		l2.set(3, "ravi");
		System.out.println(l2);
		System.out.println(l2.indexOf("nikunj"));
		System.out.println(l2.lastIndexOf("nikunj"));
		l2.remove(4);
		System.out.println(l2);
		System.out.println(l2.get(2));
		boolean isIn=l2.contains("nikunj");
		System.out.println("is nikunj in list?"+isIn);
		l2.add("nikunj");
		
		for (int j = 0; j < l2.size(); j++) {
			
			System.out.println(l2.get(j));
			
		}
		for (String str1 : l2) {
			System.out.println(str1);
		}
		
		List<Employee> empColl=new ArrayList<>();
		empColl.add(new Employee(105, "nikunj", "Surat"));
		empColl.add(new Employee(102, "mayank", "gnagar"));
		empColl.add(new Employee(101, "divyes", "bharuch"));
		empColl.add(new Employee(104, "ravi", "abad"));
		empColl.add(new Employee(103, "kisan", "rajkot"));
		System.out.println(empColl);
		
		Collections.sort(empColl, new SortByName());
		Iterator<Employee>itr1= empColl.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next()); 
			
		}
		
		
		Collections.sort(empColl, new SortByIdNo());
		Iterator<Employee>itr2= empColl.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next()); 
			
		}
		
		List<Student> stud1=new ArrayList<>();
		stud1.add(new Student(101, "nikunj", 36));
		stud1.add(new Student(103, "manish", 37));
		stud1.add(new Student(105, "nikunj", 26));
		stud1.add(new Student(102, "sandeep", 44));
		stud1.add(new Student(104, "nikunj", 35));
		
		Iterator<Student>itr3=stud1.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
			
		}
		
		Collections.sort(stud1, new TwoVaribleComparing());
		Iterator<Student>itr4=stud1.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next());
			
		}
		
	}

}
