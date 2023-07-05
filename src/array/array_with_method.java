package array;

public class array_with_method {
	/*
	 *=================Array with method========== 
	 * 1> Array as arguments/parameter:
	 * 	void sum(int [] arr){
	 * 		//statements
	 * 	}
	 * 2> Arrray as a return type:
	 *   int[] getvalue(){
	 *   int arrar[]={22,44,55,35,32,54};
	 *   return array;
	 *   }
	 */
	public static void main(String[] args) {
		int data[]= {55,56,13,45,12};
		add(data);
		int getOdd[]=getOdd();
		//print(Arrys.toString(getOdd));
		for (int x : getOdd) {
			System.out.println(x);
		}
	}
	//==============array as arguments===========
	static void add(int values[]) {
		int s=0;
		for (int x : values) {
			s+=x;
		}
		System.out.println("total is: "+s);
	}
	//==============array as return type===========
	static int [] getOdd() {
		int []arr=new int[50];
		int i=0;
		for (int x=1;x<100;x++) {
			
			if (x%2!=0) {
				arr[i]=x;
				i++;
			}
			
		}
		return (arr);
	}
	
}
