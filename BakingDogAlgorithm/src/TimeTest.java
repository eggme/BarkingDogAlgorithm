import java.util.Date;

public class TimeTest {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(func1(16));
		System.out.println(func1(34567));
		System.out.println(func1(27639));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		System.out.println("===================");
		System.out.println(func2(new int[] {1, 52, 48}, 3));
		System.out.println(func2(new int[] {50, 42}, 2));
		System.out.println(func2(new int[] {4, 13, 63, 87}, 4));
		System.out.println("===================");
		System.out.println(func3(9));
		System.out.println(func3(693953651));
		System.out.println(func3(756580036));
		System.out.println("===================");
		System.out.println(func4(5));
		System.out.println(func4(97615282));
		System.out.println(func4(1024));
		System.out.println("===================");
		System.out.println(2000000000 * 2);
	}
	
	private static int func1(int n) {
		int result = 0;
		for(int i=0;i<=n;i++) {
			if(i%3 == 0) {
				result += i;
				continue;
			}
			if(i%5 == 0) result += i;
		}
		return result;
	}
	
	private static int func2(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] + arr[j] == 100) return 1;
			}
		}
		return 0;
	}
	
	private static int func3(int n) {
		for(int i=2; i*i<=n; i++) {
			if(i*i == n) return 1;
		}
		return 0;
	}
	
	private static int func4(int n) {
		
		int max = 1;
		for(int i=1;i<=n;i++) {
			if(2*max <= n) max *= 2; 
		}
		return max;
		 
		/*
		 * int val = 1; while(2*val <= n) val *= 2; return val;
		 */
	}

}