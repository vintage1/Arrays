package arrayRemove;

import java.util.ArrayList;

public class ArrayRemove {

	public static void main(String[] args) {
		ArrayList  array = new ArrayList();
		array.clear();
		array.add("0th element");
		array.add("1st element");
		array.add("2nd element");
		System.out.println("Array before removinfg an element "+ array);
		array.remove(1);
		System.out.println("array after removing an element" + array);
		
	}

}
