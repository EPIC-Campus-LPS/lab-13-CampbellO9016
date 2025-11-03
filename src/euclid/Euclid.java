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
		int mid = arr[high/2];
		
		if(target == mid) {
			return high/2;
		}
		if(target> mid) {
			low = mid+1;
			return binarySearchHelp(arr, target, low, high);
		}
		return -1;
	}
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length;
		return binarySearchHelp(arr, target, low, high);
	}
	

}
