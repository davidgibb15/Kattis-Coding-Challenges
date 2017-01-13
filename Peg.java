//https://open.kattis.com/problems/peg
import java.util.Scanner;
public class Peg{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] board= new int[7][7];
		String line0=sc.next();
		String line1=sc.next();
		for(int i=2;i<5;i++){
			char l0=line0.charAt(i-2);
			char l1=line1.charAt(i-2);
			if(l0=='o'){
				board[0][i]=1;	
			}
			else{
				board[0][i]=2;
			}
			if(l1=='o'){
				board[1][i]=1;
			}
			else{
				board[1][i]=2;
			}
			
		}
		String line2=sc.next();
		String line3=sc.next();
		String line4=sc.next();
		for(int i=0;i<7;i++){
			char l2=line2.charAt(i);
			char l3=line3.charAt(i);
			char l4=line4.charAt(i);
			if(l2=='o'){
				board[2][i]=1;	
			}
			else{
				board[2][i]=2;
			}
			if(l3=='o'){
				board[3][i]=1;
			}
			else{
				board[3][i]=2;
			}
			if(l4=='o'){
				board[4][i]=1;
			}
			else{
				board[4][i]=2;
			}			
		}

		String line5=sc.next();
		String line6=sc.next();
		for(int i=2;i<5;i++){
			char l5=line5.charAt(i-2);
			char l6=line6.charAt(i-2);
			if(l5=='o'){
				board[5][i]=1;	
			}
			else{
				board[5][i]=2;
			}
			if(l6=='o'){
				board[6][i]=1;
			}
			else{
				board[6][i]=2;
			}
			
		}
		int count=0;
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				if(board[i][j]==2){
					if(i>=2){
						if(board[i-2][j]==1 && board[i-1][j]==1){
							count++;
						}
					}
					if(i<=4){
						if(board[i+2][j]==1 && board[i+1][j]==1){
							count++;
						}
					}
					if(j>=2){
						if(board[i][j-2]==1&& board[i][j-1]==1){
							count++;
						}
					}
					if(j<=4){
						if(board[i][j+2]==1&& board[i][j+1]==1){
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);		
	}
}