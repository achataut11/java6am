package array;

import java.util.Arrays;

public class arraySortTest {
public static void main(String[] args) {
	int [] data= {1,21,43,42,53,45,43,52,35,6,8,76,56,76,54};
	Arrays.sort(data);
	System.out.println(Arrays.toString(data));
	for (int i=data.length-1;i>=0;i--) {
		System.out.print(data[i]+" ");
	}
}
}
