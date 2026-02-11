import java.util.*;

public class j35 {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("want to exit just write it then or say anything unless u want to continue");
            String a = sc.next();
            if(a.equalsIgnoreCase("exit")){
                System.out.println("now ur exit from this ");
                break;
            }

            System.out.println("number of elements: ");
        int n = sc.nextInt();
        System.out.println("elments of arrays : ");
        Integer[] arr = new Integer[n];
        for(int i=0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("number of target: ");
        int target = sc.nextInt();
        boolean asc = arr[0]<arr[n-1];
        if(asc){
            Arrays.sort(arr);
        }else{
            Arrays.sort(arr,Collections.reverseOrder());
        }
        System.out.println(Arrays.toString(arr));
        int ans = goo(arr, target, asc);
        System.out.println(ans);
    }


    }
    static int goo(Integer[] arr,int target,boolean asc ){
        int start =0;
        int end = arr.length-1;
        if(asc){
            while(start<=end){
                int mid = start+(end-start)/2;
                if(target==arr[mid]){
                    return mid;
                }else if(target<arr[mid]){
                    end = mid-1;

                }else{
                    start = mid +1;
                }
            }
        }else{
            while(start<=end){
                int mid = start+(end-start)/2;
                if(target==arr[mid]){
                    return mid;
                }else if(target>arr[mid]){
                    end = mid-1;

                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
