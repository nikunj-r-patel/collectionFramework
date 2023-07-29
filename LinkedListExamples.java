package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class LinkedListExamples {
	
	public static void main(String[] args) {
		
		LinkedList<String> llist1=new LinkedList<>();
		llist1.add("mango");
		llist1.add("banana");
		llist1.add("apple");
		llist1.add("strowberry");
		llist1.add("kiwi");
		
		System.out.println(llist1);
		
		llist1.addFirst("jackfruit");
		llist1.addLast("peach");
		System.out.println("--------adding at first and last-------");
		System.out.println(llist1);
		
		llist1.add(3, "leachy");
		llist1.add(2, "mango");
		System.out.println(llist1);
		System.out.println("--------after removing first occurrence-------");
		llist1.removeFirstOccurrence("mango");
		System.out.println(llist1);
		System.out.println("--------reversing using decending itertator-------");
		Iterator<String> itrlist=llist1.descendingIterator();
		itrlist.forEachRemaining(fruit1->{System.out.println(fruit1);});
		llist1.push("orange");
		System.out.println(llist1);
		String s=llist1.pop();
		System.out.println(s);
		System.out.println(llist1);
		
		LinkedList<Shapes> sList=new LinkedList<>();
		
		sList.add(new Shapes("Squre", 500));
		sList.add(new Shapes("Circle", 400));
		sList.add(new Shapes("Rectangle", 800));
		sList.add(new Shapes("Cone", 252));
		sList.add(new Shapes("Triangle", 180));
		Spliterator<Shapes> split1=sList.spliterator();
		split1.forEachRemaining(obj->{System.out.println("**********"); System.out.println("Shape name: "+obj.getShapeName());System.out.println("Shape area: "+obj.getArea());});
		
		
		
		
		
		
	}

}
