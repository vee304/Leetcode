class Solution {
    public String restoreString(String s, int[] indices) {

        int len = s.length();
        StringBuilder ck = new StringBuilder();
        char[] newarr = new char[len];

        for(int i = 0; i<len; i++){
            newarr[indices[i]] = s.charAt(i);
        }

        ck.append(newarr);
        return ck.toString();
        
        
    }
}