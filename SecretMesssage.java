//https://open.kattis.com/problems/secretmessage
import java.util.Scanner;
public class SecretMessage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String message;
        double m;
        double k;
        double length;
        int newk;
        int i;
        char [][] table;
        for(i=0;i<num;i++){
            message=sc.next();
            length=message.length();
            k=Math.ceil(Math.sqrt(length));
            m=k*k;
            for(int j=(int)length;j<m;j++){
                message=message+"*";
            }
            newk=(int)k;
            table=new char[newk][newk];
            for(int j=0;j<newk;j++){
                for(int l=0;l<newk;l++){
                    table[j][l]=message.charAt(j*newk +l);
                } 
            }
            String newmessage="";
            for(int j=0;j<newk;j++){
                for(int l=newk-1;l>=0;l--){
                    char c=table[l][j];
                    if(c!='*'){
                        newmessage+=c;
                    }
                } 
            }
            System.out.println(newmessage);
        }

    }
}