//https://open.kattis.com/problems/plantingtrees
import java.util.Scanner;
import java.util.Arrays;
public class PlantingTrees{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int [] days= new int [num];
		for(int i=0;i<num;i++){
			days[i]=sc.nextInt()*-1;
		}
		Arrays.sort(days);
		int min=0;
		for(int i=0;i<num;i++){
			if(days[i]*-1+2+i>min){
				min=days[i]*-1+2+i;
			}
		}
		System.out.println(min);

	}
}