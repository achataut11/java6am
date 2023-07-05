package looping;

public class fortest {
	public static void main(String[] args) {
		int sum =0;
		int es=0,os=0;
		for (int x =1; x<=100; x++) {
			if(x%2==0) {
				es+=x;
			}
			else {
				os+=x;
			}
		}
		System.out.println(es);
		System.out.println(os);
		System.out.println(es+os);
	}
}
