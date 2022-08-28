package javaprograms;

import java.util.Scanner;

public class ToFindLargestAndSmallestNumberInATwoDimensionalArray {
	
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the value of row :");
			int row=s.nextInt();
			System.out.println("Enter the value of column :");
			int col=s.nextInt();
			int[][]a=new int[row][col];
			System.out.println("Enter the elements in to the Matrix :");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					a[i][j]=s.nextInt();
				}
			}
			System.out.println("The elements of the Matrix are :");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
			int lar=0;
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(lar<a[i][j]) {
						lar=a[i][j];
					}
				}
			}
			System.out.println("The largest number in the Matrix is:"+lar);
			int sml=a[0][0];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(sml>a[i][j]) {
						sml=a[i][j];
					}
				}
			}
			System.out.println("The smallest number in the Matrix is:"+sml);
		}
	}
}