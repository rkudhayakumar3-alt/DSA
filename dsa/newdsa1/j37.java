import java.util.*;
public class j37 {
    public static void main(String args[]){
        char[] arr = {'a','b','c','f','e'};
        char target = 'c';
        Arrays.sort(arr);
        String ans = Arrays.toString(arr);
        System.out.println(ans);
        System.out.println(goo(arr, target));
        

    }
    static char goo(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        
       return arr[start % arr.length];
    }
        
    
}


