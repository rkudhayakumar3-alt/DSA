import java.util.*;

public class j7{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // int b = sc.nextInt();
        
        int num[] = new int[size];
        // System.out.println("total values :" + size);

        for(int i =0; i<size; i++){
            System.out.println("values : " );
            num[i] = sc.nextInt();

        }
         int x = sc.nextInt();
         for(int i = 0; i<num.length; i++){
            if(num[i] == x){
                System.out.println("key is found at the index location of :" + i);
            }
         }


    }
}