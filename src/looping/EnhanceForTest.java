package looping;

public class EnhanceForTest {
/*enhance for loop
 * syntax:
 * for (datatype  var: collection){ statements}
 * 
 * 
 * 
 * 
 */
	
	public static void main(String[] args) {
		int [] values= {1,3,2,4,5,3,4,3};
		int s=0;
		for (int x : values) {
			s+=x;
			System.out.println(x);
		}
		System.out.println("sum"+s);
	}
}
