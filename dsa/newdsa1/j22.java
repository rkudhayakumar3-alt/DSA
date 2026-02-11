import java.util.*;

public class j22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            String a= sc.next();
            if(a.equalsIgnoreCase("exit")){
                System.out.println("got it");
                break;
            }
            // int[] arr = { 2,3,4,6,5,3};
            System.out.print("search key :");
            int key = sc.nextInt();
            System.out.print("total Array no.:");
            int n = sc.nextInt();
            System.out.println("writa an array no.:");

            int[] arr = new int[n];
            boolean found = false;
            
        
        for(int i = 0; i<arr.length;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length;i++){
            if(key == arr[i]){
                found = true;
        }
        }
        if(found){
            System.out.println("key found");
        }else{
            System.out.println("not found");
        }

    }
    }
}
