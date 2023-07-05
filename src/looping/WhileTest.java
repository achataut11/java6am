package looping;

public class WhileTest {
/*
 * syntax:
 * while(condition) {statement}
 */
	public static void main(String[] args) {
		int x=1;
		int n = 5;
		while(n>1) {
			x*=n;
			n--;
			System.out.println(x);
		}
		
	}
}
