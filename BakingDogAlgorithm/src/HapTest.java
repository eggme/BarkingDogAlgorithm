
public class HapTest {

	public static void main(String[] args) {
		
		System.out.println(func2(new int[]{1, 52, 48}, 3));
		System.out.println(func2(new int[]{50, 42}, 2));
		System.out.println(func2(new int[]{4, 13, 63, 87}, 4));
		
	}
	
	private static int func2(int[] arr, int length) {
		int[] temp = new int[100];
		for(int i=0;i<length;i++) {
			temp[100-arr[i]] = arr[i];
			if(temp[arr[i]] == 100-arr[i] && arr[i] != 100-arr[i]) {
				return 1;
			}
		}
		return 0;
	}
}
