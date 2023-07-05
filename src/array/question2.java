package array;

import java.util.Scanner;

public class question2 {
public static void main(String[] args) {
	Double sub[] = new Double[10];
	Scanner sc = new Scanner(System.in);
	for(int x=0;x<sub.length;x++) {
		System.out.print("enter marks: ");
		sub[x]=sc.nextDouble();
	}
	Double total=0.0,percentage=0.0;
	for (Double y : sub) {
		total+=y;
	}
	percentage=total/1000*100;
	System.out.println("total: "+total+"percentage: "+percentage);
	
}
}
