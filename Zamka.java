//https://open.kattis.com/problems/zamka
import java.util.Scanner;
public class Zamka{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt(), D=sc.nextInt(),X=sc.nextInt();
        int i;
        for(i=L;i<=D;i++){
            if(sumdigits(i)==X){
                System.out.println(i);
                break;
            }
        }
        for(i=D;i>=L;i--){
            if(sumdigits(i)==X){
                System.out.println(i);
                break;
            }
        }
    }
    public static int sumdigits(int i){
        int first=i%10;
        int second=(i-first)%100/10;
        int third=(i-first-second)%1000/100;
        int fourth=(i-first-second-third)%10000/1000;
        int fifth=(i-first-second-third-fourth)/10000;
        return first+second+third+fourth+fifth;
    }
}