package method;

import java.util.Scanner;

public class Questions {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter length and breadth: ");
	int l = sc.nextInt();
	int b = sc.nextInt();
	int area = findArea(l,b);
	System.out.println("Enter height: ");
	int h=sc.nextInt();
	volume(area,h);
}
static int findArea(int l, int b) {
	return (l*b);
}
static void volume(int a, int h) {
	System.out.println("Area: "+a);
	System.out.println("Volume: "+a*h);
}
}
