public class peak_index_in_mountain_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,7,6,5};
        System.out.println(goo(arr));
    }
    static int goo(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else  {
                end = mid-1;
            }
        }
        return end ;
    }
}
