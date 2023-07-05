package array;

import java.util.Scanner;

public class question1 {
public static void main(String[] args) {
	int arr[]=new int[10];
	int total=0;
	double avg=0;
	Scanner sc = new Scanner(System.in);
	for (int x=0;x<arr.length;x++) {
		System.out.println("Enter price of book no. "+x+":");
		arr[x]=sc.nextInt();
	}
	for (int i : arr) {
		total+=i;
	}
	avg=total/arr.length;
	System.out.println("total: "+total+" Avg: "+avg);
}
}
