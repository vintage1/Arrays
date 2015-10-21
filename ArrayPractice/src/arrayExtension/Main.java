package arrayExtension;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] names = new String[] {"a","b","c"};
		String[] extended = new String[5];
		extended[3] = "d";
		extended[4] = "e";
		System.out.println(Arrays.toString(names));
	
		System.arraycopy(names,2,extended,2,1);
		for(String str : extended){
			System.out.println(str);
		}
	}

}
