package restart;
import java.util.LinkedList;

public class Relanch4 {
	public static void main(String[] args) {
		LinkedList<String> color = new LinkedList<String>();
		color.add("black");
		color.add("pink");
		color.add("white");
		color.add("yellow");
		color.add("red");
		color.remove(1);
		color.set(3,"purple");
		System.out.println(color);
		System.out.println(color.get(3));
	}

}
