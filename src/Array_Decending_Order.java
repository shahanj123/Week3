import java.util.Arrays;
import java.util.Collections;


public class Array_Decending_Order {

	public static void main(String[] args) {
		Integer[] rno= {1,4,10,5,6};
		//Ascending order
		Arrays.sort(rno);
		System.out.println(Arrays.toString(rno));
		//Descending Order
		Arrays.sort(rno,Collections.reverseOrder());
		System.out.println(Arrays.toString(rno));

		
	}

}
