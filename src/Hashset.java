import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Hashset {

	public static void main(String[] args) {
		HashSet <String> hs= new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		System.out.println("Hashlist is: "+ hs);
		
		List<String> arl = new ArrayList<String>(hs);
		System.out.println("Arraylist is: "+ arl);
		Object[] ar= hs.toArray();
		System.out.println("Array is: " + Arrays.toString(ar));

	}

}
