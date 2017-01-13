//https://open.kattis.com/problems/estimatingtheareaofacircle
import java.util.Scanner;
public class jprogram{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble(), m =sc.nextDouble();
        int c=sc.nextInt();
        double trueArea, estArea;
        while(r !=0 || m!=0 || c!=0){
            trueArea=Math.PI * r * r;
            estArea= 4*r*r *c/m;
            System.out.println(trueArea + " "+ estArea);
            r= sc.nextDouble(); 
            m =sc.nextDouble();
            c=sc.nextInt();
        }
    }
}