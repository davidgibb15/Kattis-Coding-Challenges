//https://open.kattis.com/problems/flexible
import java.util.Scanner;
import java.util.*;
public class FlexibleSpaces{
	public static void main(String[] args) {
		ArrayList<Integer> possibles=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int width=sc.nextInt();
		int numPartitions=sc.nextInt();
		int [] partitions=new int [numPartitions+2];
		for(int i=1;i<=numPartitions;i++){
			partitions[i]=sc.nextInt();
		}
		partitions[0]=0;
		partitions[numPartitions+1]=width;
		for(int i=0;i<numPartitions+1;i++){
			for (int j=i+1;j<numPartitions+2;j++){
				possibles.add(partitions[j]-partitions[i]);
			}
		}
		Collections.sort(possibles);
		int prev=-1;
		for(int i=0;i<possibles.size();i++){
			if(possibles.get(i)!=prev){
				System.out.print(possibles.get(i)+" ");
			}
			prev=possibles.get(i);
		}
	}
}