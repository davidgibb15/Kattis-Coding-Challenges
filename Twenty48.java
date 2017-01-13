import java.util.Scanner;
public class Twenty48{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][] board = new int [4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				board[i][j]=sc.nextInt();
			}
		}
		int move=sc.nextInt();
		if(move==0){
			left(board);
		}
		else if (move==1){
			up(board);
		}
		else if(move==2){
			right(board);
		}
		else{
			down(board);
		}
	}
	public static void left(int [][] board){
		boolean [][] empty=new boolean [4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(board[i][j]==0){
					empty[i][j]=true;
				}
				else{
					empty[i][j]=false;
				}
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				if(empty[i][j]){
					for(int k=j+1;k<4;k++){
						if(!empty[i][k]){
							empty[i][j]=false;
							empty[i][k]=true;
							board[i][j]=board[i][k];
							j=k;
							board[i][k]=0;
						}
					}
				}
			}
		}
		for(int i=0;i<4;i++){
			for (int j=0;j<3;j++){
				if(board[i][j]==board[i][j+1]){
					board[i][j]=board[i][j]*2;
					for(int k=j+1;k<3;k++){
						board[i][k]=board[i][k+1];
					}
					board[i][3]=0;
				}
			}
		}
		printBoard(board);
	}
	public static void up(int[][] board){
		boolean [][] empty=new boolean [4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(board[i][j]==0){
					empty[i][j]=true;
				}
				else{
					empty[i][j]=false;
				}
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				if(empty[j][i]){
					for(int k=j+1;k<4;k++){
						if(!empty[k][i]){
							empty[j][i]=false;
							empty[k][i]=true;
							board[j][i]=board[k][i];
							j=k;
							board[k][i]=0;
						}
					}
				}
			}
		}
		for(int i=0;i<4;i++){
			for (int j=0;j<3;j++){
				if(board[j][i]==board[j+1][i]){
					board[j][i]=board[j][i]*2;
					for(int k=j+1;k<3;k++){
						board[k][i]=board[k+1][i];
					}
					board[3][i]=0;
				}
			}
		}
		printBoard(board);
	}
	public static void right(int [][] board){
		boolean [][] empty=new boolean [4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(board[i][j]==0){
					empty[i][j]=true;
				}
				else{
					empty[i][j]=false;
				}
			}
		}
		for(int i=3;i>=0;i--){
			for(int j=3;j>0;j--){
				if(empty[i][j]){
					for(int k=j-1;k>=0;k--){
						if(!empty[i][k]){
							empty[i][j]=false;
							empty[i][k]=true;
							board[i][j]=board[i][k];
							j=k;
							board[i][k]=0;
						}
					}
				}
			}
		}
		for(int i=3;i>=0;i--){
			for (int j=3;j>0;j--){
				if(board[i][j]==board[i][j-1]){
					board[i][j]=board[i][j]*2;
					for(int k=j-1;k>0;k--){
						board[i][k]=board[i][k-1];
					}
					board[i][0]=0;
				}
			}
		}
		printBoard(board);
	}
	public static void down(int [][] board){
		boolean [][] empty=new boolean [4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(board[i][j]==0){
					empty[i][j]=true;
				}
				else{
					empty[i][j]=false;
				}
			}
		}
		for(int i=3;i>=0;i--){
			for(int j=3;j>0;j--){
				if(empty[j][i]){
					for(int k=j-1;k>=0;k--){
						if(!empty[k][i]){
							empty[j][i]=false;
							empty[k][i]=true;
							board[j][i]=board[k][i];
							j=k;
							board[k][i]=0;
						}
					}
				}
			}
		}
		for(int i=3;i>=0;i--){
			for (int j=3;j>0;j--){
				if(board[j][i]==board[j-1][i]){
					board[j][i]=board[j][i]*2;
					for(int k=j-1;k>0;k--){
						board[k][i]=board[k-1][i];
					}
					board[0][i]=0;
				}
			}
		}
		printBoard(board);
	}
	public static void printBoard(int [][] board){
		for(int i=0;i<4;i++){
			for(int k=0;k<4;k++){
				System.out.print(board[i][k]+ " ");
			}
			System.out.println("");
		}
	}
}