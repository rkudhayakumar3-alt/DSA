import java.util.*;
public class j25 {
    public static void main(String args[]){
        String name = "udhaya";
        char ch = 'y';
        
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(lol(name,ch));
        
    }
    static boolean lol(String name , char ch){
        if(name.length() == 0){
            return false;
        }
        for(char c : name.toCharArray()){        
            if(c == ch){
                return true;

            }
        }
        return false;
    }

}
