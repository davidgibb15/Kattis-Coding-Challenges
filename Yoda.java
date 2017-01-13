//https://open.kattis.com/problems/yoda
//This must have been late at night
import java.util.Scanner;
public class Yoda{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		String stra=Integer.toString(a);
		String strb=Integer.toString(b);
		int [] aarray=int_to_array(a);
		int [] barray=int_to_array(b);
		int alen=aarray.length;
		int blen=barray.length;
		boolean acheck=false;
		boolean bcheck=false;
		if(aarray.length<barray.length){
			bcheck=true;
			int dif=blen-alen;
			int atens=1;
			int btens=1;
			int atotal=0;
			int btotal=0;
			for(int i=0;i<alen;i++){
				if(aarray[alen-1-i]>barray[blen-1-i]){
					atotal=atotal+atens*aarray[alen-1-i];
					atens=atens*10;
					acheck=true;
				}
				else if(aarray[alen-1-i]<barray[blen-1-i]){
					btotal=btotal+btens*barray[blen-1-i];
					btens=btens*10;
				}
				else{
					acheck=true;
					atotal=atotal+atens*aarray[alen-1-i];
					atens=atens*10;
					btotal=btotal+btens*barray[blen-1-i];
					btens=btens*10;
				}
			}
			for(int i=alen;i<blen;i++){
				btotal=btotal+btens*barray[blen-1-i];
				btens=btens*10;
			}
			System.out.println(atotal);
			System.out.println(btotal);

		}
		else{
			int dif=alen-blen;
			int atens=1;
			int btens=1;
			int atotal=0;
			int btotal=0;
			for(int i=0;i<blen;i++){
				if(aarray[alen-1-i]>barray[blen-1-i]){
					acheck=true;
					atotal=atotal+atens*aarray[alen-1-i];
					atens=atens*10;
				}
				else if(aarray[alen-1-i]<barray[blen-1-i]){
					bcheck=true;
					btotal=btotal+btens*barray[blen-1-i];
					btens=btens*10;
				}
				else{
					acheck=true;
					bcheck=true;
					atotal=atotal+atens*aarray[alen-1-i];
					atens=atens*10;
					btotal=btotal+btens*barray[blen-1-i];
					btens=btens*10;
				}
			}
			for(int i=blen;i<alen;i++){
				bcheck=true;
				atotal=atotal+atens*aarray[alen-1-i];
				atens=atens*10;
			}
			if(acheck){
				System.out.println(atotal);
			}
			else{
				System.out.println("YODA");
			}
			if(bcheck){
				System.out.println(btotal);
			}
			else{
				System.out.println("YODA");
			}						
		}




	}
	public static int[] int_to_array(int a){
		String num=Integer.toString(a);
		int[] ret=new int[num.length()];
		for(int i=0;i<num.length();i++){
			ret[i]=num.charAt(i)-'0';
		}
		return ret;
	}
	
}