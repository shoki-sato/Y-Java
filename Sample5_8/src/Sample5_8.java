import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5_8 {
	public static void main(String[] args) throws IOException {
		System.out.println("何番目のコースにしますか？");
		System.out.println("整数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans = (res == 1) ? 'A':'B';
		System.out.println(ans + "コースを選択しました。");
	}

}
