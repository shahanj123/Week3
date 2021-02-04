import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class List_to_Array {

	public static void main(String[] args) {
		List<String> ar =  new ArrayList<String>();
		ar.add("Buy");
		ar.add("Sell");
		ar.add("Eat");
		System.out.println(ar);
		
		String[] Array = new String[ar.size()];
		Array = ar.toArray(Array);
		System.out.println(Arrays.toString(Array));
		
		
	}

}
