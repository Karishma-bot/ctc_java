package vector;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> ob=new Stack<Integer>();
		ob.push(2);
		ob.push(21);
		ob.push(22);
		ob.push(25);
		ob.add(3);
		System.out.println("stack elements:"+ob);
		ob.pop();
		ob.pop();
		System.out.println("stack elements:"+ob);
		System.out.println("last elements:"+ob.peek());
		if(ob.isEmpty()) {
			System.out.println("stack is empty");
		}
			else {
				System.out.println("stack is not empty");
			}
		System.out.println(ob.search(22));
		System.out.println(ob.search(222));
		}
	}


