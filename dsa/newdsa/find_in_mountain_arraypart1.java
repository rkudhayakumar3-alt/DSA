public class find_in_mountain_arraypart1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 12, 9, 4, 2};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end - start)/2;
            if(arr[mid]>arr[mid+1]  ){
                end = mid;
            }else  {
                start = mid+1;
            } 
        }
        return end;
    }
}
