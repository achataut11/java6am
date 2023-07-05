package method;

public class method_test {
	
public static void main(String[] args) {
	sum();
	area();
	printTable(6);
	System.out.println(getSumof1to100());
	System.out.println("Smallest value : "+findSmallestValue(5,9));
}
//1,no return type with no arguments
public static void sum() {
	int a =9000;
	int b= 90890;
	int c=a+b;
	System.out.println(c);
}
public static void area() {
	int l=5;
	int b=10;
	int area= l*b;
	System.out.println(area);
}
//2.no-return type with argu
static void printTable(int n) {
	for (int i = 1; i<=10; i++) {
		System.out.println(n+"*"+i+"="+n*i);
	}
}
//3.return type with no arguments
static int getSumof1to100() {
	int s =0;
	for (int i=0;i<=100;i++) {
		s+=i;
	}
	return s;
}
//4. return type with arguments
static int findSmallestValue(int x, int y) {
	if (x<y) {
		return x;
	}
	return y;
}
}
