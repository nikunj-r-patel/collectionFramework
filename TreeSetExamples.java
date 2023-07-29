package collectionFramework;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExamples {
	public static void main(String[] args) {
		
		
		SortedSet<String> srtSet1=new TreeSet<>();
		srtSet1.add("ferari");
		srtSet1.add("pagani");
		srtSet1.add("bugati");
		srtSet1.add("amg");
		srtSet1.add("tesla");
		
		System.out.println(srtSet1);
		System.err.println("the elements between a and f: "+ srtSet1.subSet("a", "g"));
		
		TreeSet<String> srtSet2=new TreeSet<String>(new Helper());
		srtSet2.add("ferari");
		srtSet2.add("pagani");
		srtSet2.add("bugati");
		srtSet2.add("amg");
		srtSet2.add("tesla");
		
		System.out.println(srtSet2);
		System.out.println("the first element in reversed: "+ srtSet2.first());
		System.out.println("the last element in reversed: "+ srtSet2.last());
		
		
		
		
	
	
		
	}

}
