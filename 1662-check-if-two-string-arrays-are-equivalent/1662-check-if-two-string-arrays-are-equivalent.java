class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb = new StringBuilder();
        for(String s : word1){
            sb.append(s);
        }
        String firstword = sb.toString();

        sb.setLength(0);
        for(String s : word2){
            sb.append(s);
        }
        String secondword = sb.toString();

        if(firstword.equals(secondword)){
            return true;
        }else{
            return false;
        } 
    }
}