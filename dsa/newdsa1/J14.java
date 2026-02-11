import java.util.*;
public class J14 {
    public static void main(String args[]){


                                                    // 1st question which is counting occurenece


        // int count = 0;
        // for(int n = 13453; n>0; n=n/10){
        //     int rem = n%10;
        //     if(rem==3){
        //      count++;
        //     }
            
        // }
        // System.out.println(count); 
                                                    //  2nd question which is reverse the number
        while(true){

            Scanner sc = new Scanner (System.in);
            int a = sc.nextInt();
            int count = 0;
            for(int n = a; n>0; n=n/10){
                int rem = n%10;
                System.out.print(rem);
            }                                            
        }

    }
    
}
