
public class immutableexample {
		private final String coursename;
		immutableexample(final String coursename) {
		this.coursename = coursename;
		}
		public final String getName() {
		return coursename;
		}
		public static void main(String[] args) {
		immutableexample obj = new immutableexample("Machine Learning");
		System.out.println(obj.getName());
		immutableexample obj1= new immutableexample("Machine Learning vhjhbj");
		System.out.println(obj1.getName());
		}
	}

