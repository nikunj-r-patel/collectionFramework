package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetExamples {
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs1=new LinkedHashSet<>();
		lhs1.add("hundai");
		lhs1.add("toyota");
		lhs1.add("suzuki");
		lhs1.add("mahindra");
		lhs1.add("tata");
		
		System.out.println(lhs1);
		String[] arr1=new String[10];
		arr1=lhs1.toArray(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			
		}
		
		
		
	}

}
