class Solution {
    public boolean isPalindrome(int x) {

        // 회문 알고리즘
        String strX = String.valueOf(x);
        StringBuilder sb = new StringBuilder(strX);
        String reverseStrX = sb.reverse().toString();

        if(strX.equals(reverseStrX)){
            return true;
        }else{
            return false;
        }        
    }
}