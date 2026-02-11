public class position_of_an_element_in_an_infinite_array {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        System.out.println(gon(arr,12));
    }
    static int gon(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            end = end +(end-start+1)*2;
            start = temp;
        }
        return goo(arr,target,start,end);
    }
    static int goo(int[] arr , int target ,int start , int end ){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if (target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
