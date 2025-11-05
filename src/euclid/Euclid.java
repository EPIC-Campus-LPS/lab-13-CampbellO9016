package euclid;

public class Euclid {

	public static void main(String[] args) {
		System.out.println(gcd(5,10)); // 5
		System.out.println(gcd(35,7)); // 7
		System.out.println(gcd(1071,462)); // 21
		System.out.println(gcd(1386,3213)); // 63
		
		System.out.println();
		
		System.out.println(sumDigits(123)); // 6
		System.out.println(sumDigits(12345)); // 15
		System.out.println(sumDigits(954736163)); // 44
		
		System.out.println();
		
		System.out.println(binarySearch(new int[]{1, 3, 5, 7, 9, 11, 13}, 7)); // 3
		System.out.println(binarySearch(new int[]{2, 4, 6, 8, 10}, 6)); // 2
		System.out.println(binarySearch(new int[]{42}, 42)); // 0
		System.out.println(binarySearch(new int[]{10, 100, 1000, 10000, 100000}, 500)); // -1
		
		System.out.println(); 
		
		System.out.println(toBinary(0)); // 0
		System.out.println(toBinary(1)); // 1
		System.out.println(toBinary(5)); // 101
		System.out.println(toBinary(10)); // 1010
		System.out.println(toBinary(42)); // 101010

	}
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	public static int sumDigits(int n) {
		if(n%10 == n) {
			return n;
		}
		return sumDigits(n/10) + n%10;
	}
	public static int binarySearchHelp(int[] arr, int target, int low, int high) {
		int tar = arr[(high+low)/2];
		int mid = (high+low)/2;
		
		if(target == tar) {
			return (high+low)/2;
		}
		else if(high - low == 0) {
			return -1;
		}
		if(target> tar) {
			low = mid+1;
			return binarySearchHelp(arr, target, low, high);
		}
		if(target< tar) {
			high = mid-1;
			return binarySearchHelp(arr, target, low, high);
		}
		else 
			return -1;
		
	}
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length;
		return binarySearchHelp(arr, target, low, high);
	}
	public static String toBinary(int n) {
		if(n==0)
			return "0";
		if(n == 1) {
			return "1";
		}
		else
			return(toBinary(n/2)) + (n%2);
	}
	
	

}
