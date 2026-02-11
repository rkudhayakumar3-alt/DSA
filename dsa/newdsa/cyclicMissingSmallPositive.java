public class cyclicMissingSmallPositive {
    public static void main(String args[]){
        int[] arr = {3,4,1,2};
        System.out.println(cyclic(arr));
    }
    static void swap(int[] arr , int f  ,int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
    static int cyclic(int[] arr){
        int i =0;
        while(i<arr.length){
            int cor = arr[i] - 1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[cor]){
                swap(arr, i, cor);
            }else{
                i++;
            }
        }
        for(int j=0; j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
}
