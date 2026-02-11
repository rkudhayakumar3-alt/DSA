public class rbsPivot {
    public static void main(String args[]){
        // int[] arr = {4,5,6,7,0,1,2,3};
        // System.out.println(search(arr, 3));
        int[] arr = {4,5,5,6,1,2,3};
        System.out.println(pivotDublicate(arr));

        

    }
    static int pivotDublicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid] == arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }

                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;

            }else if(arr[start]<arr[mid]||(arr[start]==arr[mid]&& arr[mid]>arr[end])){
                start = mid+1;

            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    static int search(int[] arr , int target){
       int pivot = findPivot(arr);
        if(pivot == -1){
            return goo(arr,target, 0, arr.length-1);
        }

        if(arr[pivot]==target){
            return pivot;
        }

        if(arr[0]<=target){
            return goo(arr, target, 0, pivot-1);
        }else{
            return goo(arr, target, pivot+1,arr.length-1);
        }
           
       
       
       
    }
    static int goo(int[] arr , int target,int start,int end){
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;

            }else if(target>arr[mid]){
                start = mid+1;
                
            }else{
                
                end = mid-1;
            }


        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]<= arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

}
