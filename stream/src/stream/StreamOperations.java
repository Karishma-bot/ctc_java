package stream;

import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating stream from set of values
		int a=args.length;
		System.out.println(a);
			Stream <Integer>st=Stream.of(10,20,30,40,50,60,70);
			System.out.println("no of elements:"+st.count());
			st.forEach(System.out::println);
			
			//creating stream from array
			Integer[]values=new Integer[] {10,20,304,30,24};
			//Stream <Integer>stream=
	}

}
