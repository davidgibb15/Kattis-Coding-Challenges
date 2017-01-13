//https://open.kattis.com/problems/apaxiaaans
import java.util.Scanner;
public class Apaxia{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int length=name.length();
		char current;
		char previous=name.charAt(0);
		String output=(String.valueOf(previous));
		for(int i=1;i<length;i++){
			current=name.charAt(i);
			if(current!=previous){
				output=output+current;
			}
			previous=current;

		}
		System.out.println(output);
	}
}
