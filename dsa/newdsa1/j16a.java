import java.util.*;
public class j16a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){

            System.out.print("choose operator : ");
            char op = sc.next().trim().charAt(0);
        
            
            if(op=='-'||op=='*'||op=='+'||op=='%'||op=='/'){
                System.out.println("enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(op=='-'){
                     ans=a-b;
                }
                if(op=='+'){
                     ans=a+b;
                    
                }
                if(op=='*'){
                     ans=a*b;
                }
                if(op=='%'){
                     ans=a%b;
                }
                if(op=='/'){
                     ans=a/b;
                }
                    
            }else{
                System.out.println("invalid ");
            }
            System.out.println("the answer is : " + ans);
                    

        }

    }
}
