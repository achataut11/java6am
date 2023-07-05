package array;

import java.util.Scanner;

public class MultiDarray {
/*=========================Multi Dimension Array==========================
 * used to store and processing datas in rows ad column form/MAtrix /table form
 * 
 *Syntax: 
 *	data_type array_name[][]= new data_type[row][col];
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mat[][]=new int[2][2];
		for (int x=0; x<2;x++) {
			for (int y=0;y<2;y++) {
				System.out.print("Enter val: ");
				mat[x][y]=sc.nextInt();
			}
		}
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
