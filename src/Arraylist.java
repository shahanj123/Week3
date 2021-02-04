import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		String[] list = {"test1","test2","test3"};
		ArrayList<String> alist= new ArrayList<String>();
		List<String> alist1 = Arrays.asList(list);
		alist.add("john");
		alist.add("phil");
		alist.add("bill");
		alist.addAll(alist1);
		System.out.println(alist);
	}

}
