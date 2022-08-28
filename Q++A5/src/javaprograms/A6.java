package javaprograms;

public class A6 {
public static void main(String[] args) {
	int[][]a= {{1,2,3,4},{5,6,7,8}};
	int l=0;
	int s=a[0][0];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if(l<a[i][j]) {
			l=a[i][j];
			}
			else if(s>a[i][j]) {
				s=a[i][j];
			}
		}
	}
	System.out.println(l);
	System.out.println(s);
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
}
}
