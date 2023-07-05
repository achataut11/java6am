package looping;
import java.util.Scanner;
public class DoWhileTest4 {
/*
 * syntax:
 * do{
 *  //statement
 * }while(condition)
 * 
 */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number: ");
		int x = s.nextInt();
		int n = 1;
		do {
			System.out.println(x+"*"+n+"="+(x*n));
			n++;
		}while(n<=10);
	}
}
