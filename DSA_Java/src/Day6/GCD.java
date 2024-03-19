package Day6;

public class GCD {

	public static void main(String[] args) {
		bruteForce_1(9 , 12);
		bruteForce_2(9 , 12);
		mediumOptimal(9 , 12);
		optimal_euclidian(9,12);

	}

	static void bruteForce_1(int n , int m) {
		int gcd = 1;
		for(int i=1;i<=Math.min(n,m);i++) {
			if(n%i ==0 && m%i==0) {
				gcd = i;
			}
			System.out.println("Loop brute-1");
		}
		System.out.println("GCD = " + gcd);
	}
	static void bruteForce_2(int n , int m) {
		int gcd = 1;
		for(int i=Math.min(n,m);i>=1;i--) {
			if(n%i ==0 && m%i==0) {
				gcd = i;
				break;
			}
			System.out.println("Loop brute - 2");
		}
		System.out.println("GCD = " + gcd);
	}
	static void mediumOptimal(int n , int m) {
		while(n>0 && m>0) {
			if(n>m) {
				n = n-m;
			} else {
				m = m-n;
			}
			System.out.println("Loop medium");
		}
		if(n==0) {
			System.out.println("GCD = "+ m);
		} else {
			System.out.println("GCD = "+ n);
		}
	}
	static void optimal_euclidian(int n , int m) {
	
		while(n>0 && m>0) {
			if(n>m) {
				n = n%m;
			} else {
				m = m%n;
			}
			System.out.println("Loop euclidien");
		}
		if(n==0) {
			System.out.println("GCD = "+ m);
		} else {
			System.out.println("GCD = "+ n);
		}

	}
}
