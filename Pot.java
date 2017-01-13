//https://open.kattis.com/problems/pot
import java.util.Scanner;
public class Pot{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int total=0;
		int x;
		int exp=0;
		int base;
		for(int i=0;i<num;i++){
			x=sc.nextInt();
			exp=x%10;
			base=(x-exp)/10;
			total+=Math.pow(base,exp);
		}
		System.out.println(total);
	}
}