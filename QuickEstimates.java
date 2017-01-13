//https://open.kattis.com/problems/quickestimate
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class QuickEstimates{
	public static void main(String[] args) throws Exception {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		String thisLine=null;
		in.readLine();
		while((thisLine=in.readLine())!=null){
			System.out.println(thisLine.length());

		}
	}
}