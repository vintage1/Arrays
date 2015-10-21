package removearrayfromanother;

import java.util.ArrayList;

public class RemoveArray {

	public static void main(String[] args) {
		
		ArrayList objArray = new ArrayList();
	      ArrayList objArray2 = new ArrayList();
	      objArray2.add(0,"1");
	      objArray2.add(1,"2");
	      objArray2.add(2,"3");
	      objArray2.add(3,"4");
	      objArray2.add(4,"0");
	      objArray2.add(5,"7");
	      objArray.add(0,"1");
	      objArray.add(1,"2");
	      objArray.add(2,"6");
	      System.out.println("Array elements of array1" +objArray);
	      System.out.println("Array elements of array2" +objArray2);
	      objArray2.retainAll(objArray);
	      System.out.println("The common elements in the two arrays are:   "+objArray);
	      System.out.println("Does objArray2 contains objArray :   " + objArray2.contains("2"));
	}

}
