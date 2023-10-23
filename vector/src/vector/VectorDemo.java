package vector;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		int size=v.size();
		System.out.println("size of vector:"+size);
		v.add("red");
		v.add("green");
		v.add("yellow");
		v.add("white");
		System.out.println("vector elements:"+v);
	 size=v.size();
		System.out.println("size of vector:"+size);
		int capacity=v.capacity();
		System.out.println("capacity of vector:"+capacity);
		v.addElement(null);
		v.add(5,"pink");
		size=v.size();
		System.out.println("size of vector:"+size);
		v.add("white");
		System.out.println("vector elements:"+v);
		
		//create an arraylist with initial capacity 10
		ArrayList<String> al=new ArrayList<String>();
		al.add("black");
		al.add("red");
		//call addall() method to add collections of elements into vector
		v.addAll(al);
		System.out.println("vector elements:"+v);
		capacity=v.capacity();
		System.out.println("capacity of vector:"+capacity);
		al.add("black");
		al.add("red");
		System.out.println("vector elements:"+v);
		capacity=v.capacity();
		System.out.println("capacity of vector:"+capacity);
		al.add("black");
		al.add("red");
		al.add("black");
		al.add("red");
		System.out.println("vector elements:"+v);
		capacity=v.capacity();
		System.out.println("capacity of vector:"+capacity);
	}

}
