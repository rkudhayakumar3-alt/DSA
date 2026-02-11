public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "fl", "flight"};
        System.out.println(goo(strs));
    }
    static String goo(String[] strs){
        if(strs==null || strs.length == 0)return "" ;
        for(int i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                 if(i>=strs[j].length() || c!=strs[j].charAt(i) ){
                    return strs[0].substring(0, i);
                 }
            }
        }
        return strs[0];
    }
}
