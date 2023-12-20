public class Practice1 {
    /**
     * Given an integer, check to see if it's a palindrome (reads the same forward and backward)
     *
     * @param x integer to check if it's a palindrome
     * @return true if it is, false if not
     */
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;

        int forward = x;
        int backward = 0;
        while(forward > 0){
            backward = (forward % 10) + (backward * 10);
            forward/= 10;
        }
        return backward == x;
    }
}
