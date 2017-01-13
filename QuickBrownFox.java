//https://open.kattis.com/problems/quickbrownfox
import java.util.Scanner;
public class QuickBrownFox{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.nextLine();
		int i;
		int j;
		int ival;
		int len;
		String str;
		String missing;
		Boolean pangram;
		Boolean [] appears;
		String [] chars={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(i=0;i<num;i++){
			pangram=true;
			appears=new Boolean [26];
			for(j=0;j<26;j++){
				appears[j]=false;
			}
			str=sc.nextLine().toLowerCase();
			len=str.length();
			for(j=0;j<len;j++){
				ival=char_to_int(str.charAt(j));
				if(ival!=-1){
					appears[ival]=true;
				}
			}
			for(j=0;j<26;j++){
				if(!appears[j]){
					pangram=false;
				}
			}
			if(pangram){
				System.out.println("pangram");
			}
			else{
				missing="missing ";
				for(j=0;j<26;j++){
					if(!appears[j]){
						missing=missing+chars[j];
					}
				}
				System.out.println(missing);
			}

		}
	}
	public static int char_to_int(char c){
		int ret=-1;
		switch(c){
			case 'a': ret= 0;
				break;
			case 'b': ret= 1;
				break;
			case 'c': ret= 2;
				break;
			case 'd': ret= 3;
				break;
			case 'e': ret= 4;
				break;
			case 'f': ret= 5;
				break;
			case 'g': ret= 6;
				break;
			case 'h': ret= 7;
				break;
			case 'i': ret= 8;
				break;
			case 'j': ret= 9;
				break;
			case 'k': ret= 10;
				break;
			case 'l': ret= 11;
				break;
			case 'm': ret= 12;
				break;
			case 'n': ret= 13;
				break;
			case 'o': ret= 14;
				break;
			case 'p': ret= 15;
				break;
			case 'q': ret= 16;
				break;
			case 'r': ret= 17;
				break;
			case 's': ret= 18;
				break;
			case 't': ret= 19;
				break;
			case 'u': ret= 20;
				break;
			case 'v': ret= 21;
				break;
			case 'w': ret= 22;
				break;
			case 'x': ret= 23;
				break;
			case 'y': ret= 24;
				break;
			case 'z': ret= 25;
				break;
			default: ret= -1;
				break;
		}
		return ret;
	}
}