//https://open.kattis.com/problems/cold
import java.util.Scanner;
public class Coldputer{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for (int i=0;i<num;i++){
			int x=sc.nextInt();
			if(x<0){
				count++;
			}
		}
		System.out.println(count);
	}
}