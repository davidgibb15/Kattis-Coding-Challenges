//https://open.kattis.com/problems/guess
import java.util.Scanner;
public class GuessTheNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int min=1;
		int max=1001;
		String answer=makeGuess(min,max,sc);
		while(!answer.equals("correct")){
			if(answer.equals("lower")){
				max=(min+max)/2;
			}
			else if(answer.equals("higher")){
				min=(min+max)/2;
			}
			answer=makeGuess(min,max,sc);
		}
	}
	public static String makeGuess(int min,int max,Scanner sc){
		System.out.println((min+max)/2);
		return sc.nextLine();
	}
}