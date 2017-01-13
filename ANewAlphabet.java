//https://open.kattis.com/problems/anewalphabet
import java.util.Scanner;
public class ANewAlphabet{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();;
		int length=str.length();
		int i;
		String output="";
		for (i=0;i<length;i++){
			output+=convert(Character.toString(str.charAt(i)));
		}
		System.out.println(output);
	}
	public static String convert(String c){
		String ret="";
		switch(c){
			case "a": ret= "@";
				break;
			case "b": ret= "8";
				break;
			case "c": ret= "(";
				break;
			case "d": ret= "|)";
				break;
			case "e": ret= "3";
				break;
			case "f": ret= "#";
				break;
			case "g": ret= "6";
				break;
			case "h": ret= "[-]";
				break;
			case "i": ret= "|";
				break;
			case "j": ret= "_|";
				break;
			case "k": ret= "|<";
				break;
			case "l": ret= "1";
				break;
			case "m": ret= "[]\\/[]";
				break;
			case "n": ret= "[]\\[]";
				break;
			case "o": ret= "0";
				break;
			case "p": ret= "|D";
				break;
			case "q": ret= "(,)";
				break;
			case "r": ret= "|Z";
				break;
			case "s": ret= "$";
				break;
			case "t": ret= "']['";
				break;
			case "u": ret= "|_|";
				break;
			case "v": ret= "\\/";
				break;
			case "w": ret= "\\/\\/";
				break;
			case "x": ret= "}{";
				break;
			case "y": ret= "`/";
				break;
			case "z": ret= "2";
				break;
			default: ret= c;
				break;

		}
		return ret;
	}
}