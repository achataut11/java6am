package array;
import java.util.Scanner;
public class str_arr {
public static void main(String[] args) {
	String arr[]= new String[5];
	Scanner sc = new Scanner(System.in);
	for (int x =0; x<arr.length;x++) {
		System.out.println("enter country name: ");
		arr[x]=sc.next();
	}
	for (String y : arr ) {
		System.out.println(y);
	}
}
}