package task2;
import java.util.*;
public class sales_comm {

	public static void main(String[] args) {
		String name,address;
		int phn,sales_at;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter name:");
		name=obj.next();
		System.out.println("enter address:");
		address=obj.next();
		System.out.println("enter phone number:");
		phn=obj.nextInt();
		System.out.println("enter sales amount:");
		sales_at=obj.nextInt();
		
		commision a=new commision();
		a.setName(name);
		a.setAddress(address);
		a.setPh(phn);
		a.setSales_amt(sales_at);
		
		calc_comm b=new calc_comm();
		b.calc(a);

	}

}
