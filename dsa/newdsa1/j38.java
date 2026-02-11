import java.util.*;
public class j38 {
    public static void main(String[] args) {
        int[] arr= {5,2,3,4,6,4,9,4};
        int target = 4;
        Arrays.sort(arr);
         String ans =Arrays.toString(arr);
         System.out.println(ans);

        System.out.println(Arrays.toString(goo(arr, target)));

    }
    static int[] goo(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-i-1;j>=0;j--){

                if(arr[i]==target && arr[j]==target){
                    // System.out.println(arr[i]);
                    return new int[] {i,j} ;
                }
            }

        }
        return new int[] {-1,-1};
        
    }
}
