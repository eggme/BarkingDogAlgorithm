import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try {
		// 백준 10871 : X보다 작은 수
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int[] N = new int[A];
			st = new StringTokenizer(br.readLine(), " ");
			StringBuilder builder = new StringBuilder();
			for(int i=0;i<A;i++) 
				N[i] = Integer.parseInt(st.nextToken());
			
			for(int i=0;i<N.length;i++)
				if(N[i] < X) builder.append(N[i] + " ");
			
			System.out.println(builder.toString().substring(0, builder.length()-1));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
