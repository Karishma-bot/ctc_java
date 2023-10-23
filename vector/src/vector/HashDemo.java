package vector;

import java.util.HashSet;

public class HashDemo {
	static void addElements(HashSet<Integer>numberHashSet) {
		numberHashSet.add(61);
		numberHashSet.add(41);
		numberHashSet.add(51);
		numberHashSet.add(91);
		numberHashSet.add(11);
		
		System.out.println(numberHashSet.add(51));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>numberHashSet=new HashSet<Integer>();
		//addElements(numberHashSet);
		
		HashSet<Integer>numberHashSet1=new HashSet<Integer>();
		HashSet<Integer>numberHashSet2=new HashSet<Integer>();
		//addElements(numberHashSet2);
		
		numberHashSet1.add(20);
		numberHashSet1.add(80);
		numberHashSet1.add(11);
		System.out.println(numberHashSet);
		System.out.println(numberHashSet1);
		
		numberHashSet2.add(11);
		numberHashSet2.add(12);
		numberHashSet2.add(13);
		System.out.println("resultset2:"+numberHashSet2);
		numberHashSet2.addAll(numberHashSet1);
		
		System.out.println("resultset:"+numberHashSet2);
		//numberHashSet2.clear();
		System.out.println("resultset:"+numberHashSet2);
		
		//intersection of 2 sets
		numberHashSet2.retainAll(numberHashSet1);
		System.out.println("resultset:"+numberHashSet2);
		
		
		//set difference
		numberHashSet2.removeAll(numberHashSet1);
		System.out.println("resultset:"+numberHashSet2);
	}

}
