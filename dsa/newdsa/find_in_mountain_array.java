public class find_in_mountain_array {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,9,8,7,6};
        int target = 7;
        int peak = goo(arr);
        int bin = gon(arr,target,peak);
        System.out.println(bin);

    }
    static int goo(int[] arr ){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid +1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    static int gon(int[] arr, int target,int peak ){
        int start = 0;
        int end = peak;
        while(start<=end){
         int mid = start +(end-start)/2;
         if(target == arr[mid]){
            return mid;
         }else if(target<arr[mid]){
            end = mid-1;
         }else{
            start = mid +1;
         }
        }
        return goo(arr,target,peak);
    }
    static int goo(int[] arr , int target, int peak){
        int start = peak;
        int end = arr.length-1;
        while(start<=end){
         int mid = start +(end-start)/2;
         if(target == arr[mid]){
            return mid;
         }else if(target<arr[mid]){
            start = mid+1;
         }else{
            end = mid -1;
         }
        }
        return -1;
    }
}
