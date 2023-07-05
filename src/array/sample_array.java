package array;
import java.util.Scanner;

public class sample_array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int []arr = new int[5];
	for (int x =0; x<arr.length;x++) {
		System.out.print("Enter a no.: ");
		arr[x]=sc.nextInt();
	}
	
	for (int y=0;y<arr.length;y++) {
		System.out.println(arr[y]);
	}
	
}
}
