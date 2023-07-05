package method;

import java.util.Scanner;

public class Question2 {
public static void main(String[] args) {
	input();
}
static void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter P R T : ");
	int p =sc.nextInt();
	int r = sc.nextInt();
	int t=sc.nextInt();
	process (p,r,t);
}
static void process(int p, int r, int t) {
	int si=(p*r*t)/100;
	int a=p+si;
	output(si,a);
}
static void output(int si, int a) {
	System.out.println("SI: "+si);
	System.out.println("Amount: "+a);
}
}
