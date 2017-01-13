//https://open.kattis.com/problems/spavanac
import java.util.Scanner;
public class Spavanac{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hour=sc.nextInt();
		int min=sc.nextInt();
		if(min<45){
			hour=(hour+23)%24;
		}
		min=(min+15)%60;
		System.out.println(hour +" "+min);
	}
}