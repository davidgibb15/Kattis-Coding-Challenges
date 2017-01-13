//https://open.kattis.com/problems/aaah
import java.util.Scanner;
public class Aaah{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jon=sc.nextLine();
		String doc=sc.nextLine();
		if(doc.length()<=jon.length()){
			System.out.println("go");
		}
		else{
			System.out.println("no");
		}
	}
}