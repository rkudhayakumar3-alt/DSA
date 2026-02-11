public class nearValue {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,8,9,11,14};
        int target = 7;
         
        System.out.println(search(arr, target));
    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if(target > arr[arr.length-1]) return -1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
