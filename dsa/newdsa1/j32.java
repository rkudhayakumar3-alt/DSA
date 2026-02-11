import java.util.*;

public class j32 {
    public static void main(String[] args) {
        int[] num2= {1,5,7,10};
        int[] num1 = {4,2,6,3,8,11};
        
        System.out.println(  (goo(num1, num2)));
    }
    static double goo(int[] num1,int[] num2){
        int[] num3 = new int[num1.length + num2.length];

        //    combine in arr2
        for(int i=0;i<num1.length;i++){
            num3[i]=num1[i];
        }
        for(int i=0; i<num2.length;i++){
            num3[num1.length + i]=num2[i];
        }
        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));
        // return num3;
        int n = num3.length;
        
        if(n%2==1){
            return num3[n/2];
        }else{
            return (num3[n/2-1]+num3[n/2])/2.0;

        }

    }
        
}
