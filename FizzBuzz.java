//https://open.kattis.com/submissions/1601296
import java.util.Scanner;
public class FizzBuzz{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt(), y=sc.nextInt(), n=sc.nextInt();
        int i;
        for (i=1;i<=n;i++){
            if(i%x==0){
                if(i%y==0){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else if(i%y==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
}
}