package tasktest1;

public class Inface1 implements Taskinterface{
	public void salary() {
	  System.out.println("salary");
	}
	public void savings() {
		System.out.println("savings");
	}
	public void amount () {
		System.out.println("amount");
	}
	public static void main (String[]args) {
		Inface1 obj = new Inface1();
		obj.salary();
		obj.savings();
		obj.amount();
	}
}
