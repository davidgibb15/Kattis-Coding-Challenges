//https://open.kattis.com/problems/longincsubseq
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LongestIncSub{
	public static void main(String[] args)throws Exception {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		String nextLine=null;
		int [] path,lengths,currentIndex,previous;
		int min,max,x,currentLength,howMany,i,tempIndex;
		String [] str_seq;
		while((nextLine=in.readLine())!=null){
			howMany=Integer.parseInt(nextLine);
			str_seq=in.readLine().split(" ");
			currentIndex=new int [howMany];
			lengths=new int [howMany];
			previous=new int [howMany];
			currentLength=0;
			lengths[0]=Integer.parseInt(str_seq[0]);
			previous[0]=-1;
			currentIndex[0]=0;
			x=0;
			for(i=1;i<howMany;i++){
				min=0;
				max=currentLength+1;
				x=Integer.parseInt(str_seq[i]);
				while(min!=max){
					if(lengths[(min+max)/2]<x){
						min=(min+max)/2+1;
					}
					else{
						max=(min+max)/2;
					}
				}
				if(min==0){
					if(x<lengths[0]){
						lengths[0]=x;
						currentIndex[0]=i;
					}
					previous[i]=-1;
				}
				else if(min<=currentLength){
					lengths[min]=x;
					previous[i]=currentIndex[min-1];
					currentIndex[min]=i;
				}
				else{
					currentLength++;
					lengths[min]=x;
					previous[i]=currentIndex[min-1];
					currentIndex[min]=i;
				}
			}
			System.out.println(currentLength+1);
			path=new int [currentLength+1];
			tempIndex=currentIndex[currentLength];
			for(i=currentLength;i>=0;i--){
				path[i]=tempIndex;
				tempIndex=previous[tempIndex];
			}
			for(i=0;i<currentLength+1;i++){
				System.out.print(path[i]+ " ");
			}
			System.out.println("");

		}
	}
}