public class cyclic4A {
    public static void main(String args[]){
        int[] arr = {3,1,1,2};
        
        System.out.println(dublicate(arr));
    }
    static void swap(int[] arr , int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
    static int dublicate(int[] arr){
        int i=0;
        while(i<arr.length){
            int cor = arr[i]-1;
            if(arr[i]!=arr[cor]){
                swap(arr,i,cor);
                
            }else{
                i++;
            }
        }
        for(int j=0; j<arr.length;j++){
            if(arr[j]!=j+1){
                return arr[arr.length-1];
            }
        }
        return -1;
    }
}
