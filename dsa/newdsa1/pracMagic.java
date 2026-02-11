public class pracMagic{
    public static void main(String[] args) {
        int n = 6;
        int base = 5;
        int ans = 0;
        int count =0;
        int a;
        while(n>0){
            a = n&1;
            n=n>>1;
            ans+=a*base;
            base*=5;
            count++;

        }
        System.out.println(ans + ","+count);
    }
}