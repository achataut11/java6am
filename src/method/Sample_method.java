package method;
import java.util.*;
public class Sample_method {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=9;
	int b=10;
	int c=sum(a,b);
	System.out.println(c);
	System.out.println("hello world");
}
 static  int sum(int a , int b) {
//	 int a = 8;
//	 int b=9;
// System.out.println("sum: "+(a+b));
	 int sum = a+b;
	 return sum;
 }
}
