//https://open.kattis.com/problems/anotherbrick
import java.util.Scanner;
public class BrickWall{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int height=sc.nextInt()-1;
		int width=sc.nextInt();
		int num=sc.nextInt();
		int [] bricks=new int [num];
		boolean yes=false;
		for(int i=0;i<num;i++){
			bricks[i]=sc.nextInt();
		}
		int currentHeight=0;
		int currentWidth=0;
		for(int i=0;i<num;i++){
			currentWidth=currentWidth+bricks[i];
			if(currentWidth>width){
				System.out.println("NO");
				yes=true;
				break;
			}
			else if(currentWidth==width){
				if(currentHeight==height){
					System.out.println("YES");
					yes=true;
					break;
				}
				currentHeight++;
				currentWidth=0;
			}

		}
		if(!yes){
			System.out.println("NO");
		}
	}
}