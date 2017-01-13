//https://open.kattis.com/problems/dicecup
import java.util.Scanner;
public class DiceCup{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt();
		if(b<=a){
			for(int i=b+1;i<=a+1;i++){
				System.out.println(i);
			}
		}
		else{
			for(int i=a+1;i<=b+1;i++){
				System.out.println(i);
			}
		}
	}
}