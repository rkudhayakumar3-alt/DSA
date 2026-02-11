public class recursion1{
    public static void main(String[] args) {
        p1(1);
    }
    static void p1(int n){
        if(n==7){
            System.out.print(7);
            return;
        }
        System.out.print(n+" ");
        p1(n +1);
    }
}