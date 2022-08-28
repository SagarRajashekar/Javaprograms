package javaprograms;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][]a=new int[4][4];
		System.out.println(a);
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		a[0][3]=8;
		a[1][0]=7;
		a[1][1]=8;
		a[1][2]=9;
		a[1][3]=8;
		a[2][0]=4;
		a[2][1]=5;
		a[2][2]=6;
		a[2][3]=7;
		a[3][0]=1;
		a[3][1]=2;
		a[3][2]=4;
		a[3][3]=8;
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
		System.out.print(a[i][j]);		
		System.out.print(" "); 
		}
		System.out.println("");
	}
	}
}
