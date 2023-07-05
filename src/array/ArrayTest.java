package array;

import java.util.Scanner;

public class ArrayTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int age[]= new int[5];
	for (int x=0;x<5;x++) {
		System.out.println("enter age: ");
		age[x]=sc.nextInt();
	}
	for (int i=0 ;i<age.length;i++) {
		System.out.println(age[i]);
	}
}
}