package javaprograms;

public class FindTheSumOfPrimeNumbersInAnArray {
	public static void main(String[] args) {
		int[] a= {2,3,4,5,7,11,13,17,19,23,29};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			int b=a[i];
			int n=2;
			System.out.println(n);
			while(n<=b/2) {
				if(b%n!=0) {
					sum=sum+a[i];
					System.out.println("sum :"+sum);
					break;
				}
				n++;
			}
		}
		System.out.println("The sum of prime numbers in the array is :"+sum);
	}
}
