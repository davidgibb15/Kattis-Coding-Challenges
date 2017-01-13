//https://open.kattis.com/problems/easiest
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Easiest{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int [] numberArray;
		int number,i,sum;
		while((number=Integer.parseInt(in.readLine()))!=0){
			sum=sumint(number);
			for(i=11;i<=100;i++){
				if(sumint(number*i)==sum){
					System.out.println(i);
					break;
				}
			}
		}
	}
	public static int sumint(int x){
		int mod=10;
		int sum=0;
		int remain;
		for(int i=0;i<8;i++){
			remain=x%mod/(mod/10);
			sum+=remain;
			x-=remain;
			mod=mod*10;
		}
		return sum;
	}
}