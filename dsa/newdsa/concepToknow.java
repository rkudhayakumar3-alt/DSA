public class concepToknow {
    public static void main(String args[]){
        int n = 5;
        System.out.println(con(n));
    }
    static int con(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return con(n--);

    }
}
