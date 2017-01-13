//https://open.kattis.com/problems/akcija
import java.util.Scanner;
import java.util.Arrays;
public class Akcija{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int [] prices=new int [num];
		for(int i=0;i<num;i++){
			prices[i]=sc.nextInt();
		}
		Arrays.sort(prices);
		int sum=0;
		for(int i=1;i<=num;i++){
			if(i%3!=0){
				sum+=prices[num-i];
			}
		}
		System.out.println(sum);

	}
}