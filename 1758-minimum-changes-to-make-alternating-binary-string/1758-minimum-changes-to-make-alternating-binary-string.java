class Solution {
    public int minOperations(String s) {
        int c1 = 0, c2 = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch != (i%2==0 ? '0':'1')) c1++;
            if(ch != (i%2==0 ? '1':'0')) c2++;
        }
        return Math.min(c1,c2);
    }
}