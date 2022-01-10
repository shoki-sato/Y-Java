import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample14_8 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("text1.txt"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("ファイルに書き込まれている2つの文字列は");
			System.out.println(str1 + "です");
			System.out.println(str2 + "です");
			br.close();
		} catch (IOException e){
			System.out.println("入出力エラーです");
		}
	}

}
