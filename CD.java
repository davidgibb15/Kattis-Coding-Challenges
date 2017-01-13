//https://open.kattis.com/problems/cd
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class CD{
	public static void main(String[] args) throws Exception {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		String thisLine=null;
		String [] howMany=in.readLine().split(" ");
		int numJack=Integer.parseInt(howMany[0]);
		int [] cds;
		int numJill=Integer.parseInt(howMany[1]);
		int i,x;
		while(numJack!=0||numJill!=0){
			cds=new int[numJack];
			for(i=0;i<numJack;i++){
				thisLine=in.readLine();
				cds[i]=Integer.parseInt(thisLine);
			}
			int count=0;
			for(i=0;i<numJill;i++){
				thisLine=in.readLine();
				x=Integer.parseInt(thisLine);
				if(Arrays.binarySearch(cds,x)>=0){
					count++;
				}
			}
			howMany=in.readLine().split(" ");
			numJack=Integer.parseInt(howMany[0]);
			numJill=Integer.parseInt(howMany[1]);
			System.out.println(count);
		}
	}

}