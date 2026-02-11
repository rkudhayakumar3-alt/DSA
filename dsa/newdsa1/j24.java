public class j24 {
    public static void main(String args[]){

        String name ="udhaya";
        char ch = 'y';
        
        //  System.out.println(name.indexOf(ch)!=-1);
        //  System.out.println(name.indexOf(ch));
        //  System.out.println(name.contains(ch));
        //  System.out.println(go(name,ch));
               
    }


    static boolean lol(string name , char ch){
        if(name.length == 0){
            return false;
        }
        for(char c : name.toCharArray()){        
            if(c == ch){
                return true;

            }
        }
        return false;
    }



    static boolean go(String name,char ch){
        if(name.length()==0){
            return false;
        }
     
        for(int i=0; i<name.length(); i++){
            if(ch==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
}
