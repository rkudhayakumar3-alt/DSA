import java.util.*;
public class j23A {
    public static void main(String[] args) {
        String name = "udhaya";
        char ch = 'h';
        int[] run = {1,2,3,4,5};
        int key = 3;
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(run));
        // for(char c : name.toCharArray()){
        //     // System.out.println(c);
        //     if(c==ch){
        //         System.out.println(name.indexOf(c));
        //     }
        // }
         for(int i = 0;i<run.length;i++){
            if(key==run[i]){
                System.out.println(i);
            }
         }
    }
    
}
