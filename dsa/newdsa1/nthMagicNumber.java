public class nthMagicNumber {
    public static void main(String args[]){
        int n =4;
        System.out.println(magic(n));
    
    }
    static int magic(int n){
        int base = 5;
        int ans =0;
        int count =0;
        while(n>0){
            int last = n&1;
            ans = ans + (last*base);
            base = base*5;
            n = n>>1;
            count++;
        }
        System.out.print(count+ " digits  and the ans is ");
        return ans;
    }

}
