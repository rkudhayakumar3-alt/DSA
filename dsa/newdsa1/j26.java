public class j26 {
    public static void main(String args[]){
        int[] arr = {2,3,4,-6,1};
        int min ;
        System.out.println(goo(arr,arr[0]));
    }
    static int goo(int[] arr, int min){
        for(int i=1;i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
                
            }
        }
        return min;
    }
}
