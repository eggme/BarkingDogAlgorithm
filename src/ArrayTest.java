import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {10, 50, 40, 30, 70, 20};
		insert(3, 60, arr, arr.length);
		delete(4, arr, arr.length);
	}
	
	private static void delete(int idx, int[] arr, int length) {
		int[] tempArr = new int[length-1];
		for(int i=0;i<length;i++) {
			if(i < idx) 
				tempArr[i] = arr[i]; 
			else if(i == idx)
				continue;
			else
				tempArr[i-1] = arr[i];
		}
		arr = tempArr;
		System.out.println(Arrays.stream(arr).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining(", ")));
	}
	
	private static void insert(int idx, int val, int[] arr, int length) {
		int[] tempArr = new int[length+1];
		for(int i = 0; i < length; i++) {
			if(i < idx)
				tempArr[i] = arr[i];
			else if(i == idx) {
				tempArr[i] = val;
				tempArr[i+1] = arr[i];
			}
			else
				tempArr[i+1] = arr[i];
					
		}
		arr = tempArr;
		System.out.println(Arrays.stream(arr).mapToObj(i-> String.valueOf(i)).collect(Collectors.joining(", ")));
	}
}
