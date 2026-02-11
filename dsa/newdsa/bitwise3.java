import java.util.Arrays;

public class sortTheDublicate {
    public static void main(String args[]){
        int[] arr = {2,3,4,1,2,1,3};
        System.out.println(noDubli(arr));
    }
    static int noDubli(int[] arr){
        int uniq = 0;
        for(int i=0;i<arr.length;i++){
            uniq = uniq ^ arr[i];
        }

        return uniq;
    }
}
