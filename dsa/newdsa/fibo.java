import java.util.*;
public class fibo {
    public static void main(String args[]){
        
        
        Scanner sc  = new Scanner(System.in);
        
        int n = sc.nextInt(); //taking index value//
        int a = 0;
    int b = 1;
    int count = 2;
    if(n==0){
        System.out.println(a);
    }
    if(n==1){
        System.out.println(b);
    }
    while(count<=n){
        int temp = b;
        b = b+a;
        a=temp;
        count++;
    }
    System.out.println(b);
    
     }

}