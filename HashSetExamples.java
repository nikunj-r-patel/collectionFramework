package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExamples {
	
	
	public static void main(String[] args) {
	
		HashSet<ArrayList> set1=new HashSet<>();
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		set1.add(list1);
		set1.add(list2);
		
		System.out.println(set1);
		
		list2.set(0, 1);
		list2.set(1, 2);
		list2.set(2, 3);
		
		System.out.println(set1);
		
		Set<Integer>hset2=new HashSet<>();
		hset2.add(1);
		hset2.add(2);
		hset2.add(1);
		System.out.println(hset2);
		
		HashSet<Integer>clonedSet=new HashSet<>();
		clonedSet=(HashSet<Integer>)set1.clone();
		System.out.println(clonedSet);
		
		HashSet<String>hset3=new HashSet<>();
		hset3.add("honda");
		hset3.add("yamaha");
		hset3.add("hero");
		hset3.add("bulet");
		System.out.println(hset3);
		hset3.removeIf(strA->strA.contains("hero"));
		System.out.println(hset3);
		hset3.add("hero");
		System.out.println(hset3);
		Object [] hashArr= hset3.toArray();
		for (int i = 0; i < hashArr.length; i++) {
			System.out.println(hashArr[i]);
			
		}
		String hashStr= hset3.toString();
		System.out.println(hashStr.substring(0, 15));
		System.out.println("this hash set has: "+hset3.size());
		
		
		
		
		
		
	}
	

}
	