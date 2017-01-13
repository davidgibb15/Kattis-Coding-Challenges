//https://open.kattis.com/problems/ceiling
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ceiling{
	public static void main(String[] args) throws Exception {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		String [] thisLine;
		String [] howMany=in.readLine().split(" ");
		int num_cases=Integer.parseInt(howMany[0]);
		int num_each_case=Integer.parseInt(howMany[1]);
		int tree_size=(int)Math.pow(2,num_each_case)-1;
		int [][] shapes=new int[num_cases][tree_size];
		int i,j,x,index,k;
		for(i=0;i<num_cases;i++){
			thisLine=in.readLine().split(" ");
			for(j=0;j<num_each_case;j++){
				index=0;
				x=Integer.parseInt(thisLine[j]);
				while(shapes[i][index]!=0){
					if(x>shapes[i][index]){
						index=index*2+2;
					}
					else{
						index=index*2+1;
					}
				}
				shapes[i][index]=x;
			}

		}
		int [] grouped=new int[num_cases];
		boolean same=true; 
		int count=0;
		for(i=0;i<num_cases-1;i++){
			if(grouped[i]==0){
				for(j=i+1;j<num_cases;j++){
					for(k=0;k<tree_size;k++){
						if((shapes[i][k]!=0&&shapes[j][k]==0)||(shapes[i][k]==0&&shapes[j][k]!=0)){
							same=false;
							break;
						}
					}
					if(same==true){
						count++;
						grouped[j]=1;
					}
					same=true;
				}
			}
		}
		System.out.println(num_cases-count);

	}

}