package array;

public class Calculation {
public static void main(String[] args) {
	int mat1[][]= {{13,23},{332,233}};
	int mat2[][]= {{22,32},{121,43}};
	int mat3[][]=new int[2][2];
	for (int i=0;i<2;i++) {
		for (int j=0;j<2;j++) {
			mat3[i][j]=mat1[i][j]+mat2[i][j];
			System.out.println(mat3[i][j]);
		}
	}
	
}
}
