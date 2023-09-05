package day21;

public class B extends A {
int rollno;
String dept;
public B(String name, long aadhaar, String address, int rollno, String dept) {
	super(name, aadhaar, address);
	this.rollno = rollno;
	this.dept = dept;
}
@Override
public String toString() {
	return "B [rollno=" + rollno + ", dept=" + dept + ", name=" + name + ", aadhaar=" + aadhaar + ", address=" + address
			+ "]";
}

}
