public class bitwise {
    public static void main(String args[]){
        int a = 20;
        if(isodd(a)){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }


    }

    private static boolean isodd(int a) {
        return (a&1)==1;
    }
    
}
