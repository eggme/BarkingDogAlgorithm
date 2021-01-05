import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AlphaTest {

	public static void main(String[] args) {
		// 10808번 알파벳 개수
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			char[] arr = s.toCharArray();
			int[] alphabet = new int[26];
			for(int i=0;i<arr.length;i++) {
				int character = arr[i];
				alphabet[character-97]++;
			}
			
			System.out.println(Arrays.stream(alphabet).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
