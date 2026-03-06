class Solution {
    public static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }

    public static void main(String[] args) {
        System.out.println(checkOnesSegment("1001")); // false
        System.out.println(checkOnesSegment("110"));  // true
    }
}