import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test14 {
	public static void main(String[] args) throws IOException {
	
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
			
			pw.println("A long time ago,");
			pw.println("There was a little girl.");
			pw.close();
			
			
			if(args.length !=1) {
				System.out.println("ファイル名を正しく指定してください");
				System.exit(1);
			}
			try {
				BufferedReader br = new BufferedReader(new FileReader(args[0]));
				
				String str;
				while((str = br.readLine()) != null) {
					System.out.println(str);
				}
				br.close();
			}
			catch(IOException e) {
				System.out.println("入出力エラーです");
			}
			
		
}
	
}
