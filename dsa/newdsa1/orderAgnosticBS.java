public class orderAgnosticBS {                                               //BIOTOMIC ARRAY
    public static void main(String args[]){
        int[] arr = {6,5,4,3,2,1};
        int target = 2;
        System.out.println(search(arr,target));

    }
    static int search(int[] arr,int target){

        // if(arr[0]<arr[arr.length-1]){
        //      return  orderbs(arr, target,true) ;
        // }else{
        //      return orderbs(arr, target, false) ;
        // }
        boolean goo = arr[0]<arr[arr.length-1];
        return orderbs(arr, target, goo);
     
    }



    static int orderbs(int[] arr, int target,boolean goo){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }else if(goo){
                if(target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
