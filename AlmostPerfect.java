//https://open.kattis.com/problems/almostperfect
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class AlmostPerfect{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int number,i,sum,max;
		while((line=in.readLine())!=null){
			sum=1;
			number=Integer.parseInt(line);
			max=(int)Math.sqrt(number)-1;
			for(i=2;i<=max;i++){
				if(number%i==0){
					sum+=i;
					sum+=number/i;
				}
			}
			if(number%(max+1)==0&&max>0){
				sum+=max+1;
				if((max+1)!=number/(max+1)){
					sum+=number/(max+1);
				}
			}
			if(sum==number){
				System.out.println(number + " perfect");
			}
			else if(Math.abs(sum-number)<=2){
				System.out.println(number+ " almost perfect");
			}
			else{
				System.out.println(number + " not perfect");
			}
		}
	}

}