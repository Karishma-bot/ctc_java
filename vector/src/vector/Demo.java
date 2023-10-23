package vector;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>obj1=new HashSet<Integer>();
		HashSet<Integer>obj2=new HashSet<Integer>();
		obj1.add(20);
		obj1.add(3);
		obj1.add(10);
		obj1.add(120);
		System.out.println("set 1:"+obj1);
		obj2.add(20);
		obj2.add(34);
		obj2.add(45);
		obj2.add(66);
		obj2.add(120);
		System.out.println("set 2:"+obj2);
		
		
		
		//intersection
		obj1.retainAll(obj2);
		System.out.println("intersection:"+obj1);
		
		//union
		obj2.addAll(obj1);
		System.out.println("set 2:"+obj2);
		
		//difference
		obj2.removeAll(obj1);
		System.out.println("set 2:"+obj2);
		

	}

}
