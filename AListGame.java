//https://open.kattis.com/problems/listgame
import java.util.Scanner;
import java.util.*;
public class AListGame{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean divisible=true;
		int x=sc.nextInt();
		int count=0;
		int i,j;
		int max=(int)Math.sqrt((double)x)+1;
		if(x%2==0){
			while(divisible){
				if(x%2==0){
					count++;
					x=x/2;
				}
				else{
					divisible=false;
				}
			}
		}
		for(i=3;i<=x;i+=2){
			divisible=true;
			while(divisible){
				if(x%i==0){
					count++;
					x=x/i;
				}
				else{
					divisible=false;
				}
			}
			if(i>max){
				count++;
				break;
			}
		}
		System.out.println(count);
	}
}
