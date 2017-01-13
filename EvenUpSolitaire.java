//https://open.kattis.com/problems/evenup
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class EvenUpSolitaire{
	public static void main(String[] args)throws Exception {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		int howMany=Integer.parseInt(in.readLine());
		String [] string_numbers=in.readLine().split(" ");
		int i,num;
		boolean last_num_even=!(Integer.parseInt(string_numbers[0])%2==0);
		boolean this_num_even;
		for(i=0;i<howMany;i++){
			num=Integer.parseInt(string_numbers[i]);
			numbers.add(num);
			this_num_even=(num%2==0);
			if(this_num_even&&last_num_even){
				numbers.remove(numbers.size()-1);
				numbers.remove(numbers.size()-1);
				if(numbers.size()!=0){
					last_num_even=(numbers.get(numbers.size()-1)%2==0);
				}
				else if (i<howMany-1){
					last_num_even=!(Integer.parseInt(string_numbers[i+1])%2==0);
				}

			}
			else if(!this_num_even&&!last_num_even){
				numbers.remove(numbers.size()-1);
				numbers.remove(numbers.size()-1);
				if(numbers.size()!=0){
					last_num_even=(numbers.get(numbers.size()-1)%2==0);
				}
				else if (i<howMany-1){
					last_num_even=!(Integer.parseInt(string_numbers[i+1])%2==0);
				}
			}
			else{
				last_num_even=this_num_even;
			}
		}

		System.out.println(numbers.size());
	}
}