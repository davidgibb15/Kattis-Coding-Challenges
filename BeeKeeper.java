//https://open.kattis.com/problems/beekeeper
import java.util.Scanner;
public class BeeKeeper{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numWords=sc.nextInt();
		sc.nextLine();
		String word,bestWord;
		int i,amount_doubles;
		while(numWords!=0){
			bestWord="";
			int most=0;
			for(i=0;i<numWords;i++){
				word=sc.nextLine();
				amount_doubles=get_amount_doubles(word);
				if(amount_doubles>=most){
					bestWord=word;
					most=amount_doubles;
				}
			}
			System.out.println(bestWord);
			numWords=sc.nextInt();
			sc.nextLine();				
		}
	}
	public static int get_amount_doubles(String word){
		int length=word.length();
		int count=0;
		for(int i=0;i<length-1;i++){

			if(vowel(word.charAt(i))&&word.charAt(i)==word.charAt(i+1)){
				count++;
			}
		}
		return count;
	}
	public static boolean vowel(char a){
		return(a=='e'||a=='a'||a=='i'||a=='o'||a=='u'||a=='y');
	}
}