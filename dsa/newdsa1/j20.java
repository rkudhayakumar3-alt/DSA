import java.util.*;
public class j20 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        while(true){
            String a = sc.nextLine();
            if(a.equalsIgnoreCase("exit")){
                System.out.println("goodbii");
                break;
            }

            String ans = goo(a);
            System.out.println(ans);
        }
        
            
        sc.close();
        
    }
    static String goo(String name){
        String mes = "hello "+ name;
        return mes;
    }
}
