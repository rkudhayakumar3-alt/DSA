public class j29 {
    public static void main(String args[]){
        int[] arr = {12,3,1234,4,234,56};
        
        System.out.println(gol(arr));
        
        
    }
    static int gol(int[] arr){
        int dc = 0;
        for(int i = 0; i<arr.length; i++){
            int key = arr[i];
            int count = 0;
            
            while(key>0){
                key=key/10;
                count++;
            }
            if(count%2==0){
                dc++;
                
            }

        }
        return dc;
     }
    
}
