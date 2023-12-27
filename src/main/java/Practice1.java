import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


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
    }//end of isPalendrome method

    /*
        Given an array of integers nums and an integer target, return indices of the two numbers
        such that they add up to target. You may assume that each input would have exactly one solution,
        and you may not use the same element twice. You can return the answer in any order.
     */

    /*
       This was my first attempt using a map. I didn't like that the time complexity was O(n^2)
     */
//
//    public static int[] twoSum(int[] nums, int target) {
//        int[] solution = new int[2];
//        Map<Integer, Integer> map = new HashMap<>();
//        //put the array and indices into a map
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            //take the target, subtract the number at the index
//            int complement = target - nums[i];
//            //check to see if it's anywhere else in the map
//            if(map.containsKey(complement) && map.get(complement) != i){
//                solution[0] = map.get(complement);
//                solution[1] = i;
//            }
//        }
//        //if there is no solution, it will return [0, 0]
//        return solution;
//    }

    /*
        So I refactored it to make it a linear time complexity
     */

    /**
     * This method takes in an array of integers and a target number (integer) and returns the indices
     * of the two numbers that add up to the target, assuming that there is no more than one solution
     * and that one element cannot be used twice.
     *
     * @param nums integer array to check for two numbers adding up to target
     * @param target int number that two numbers in  array should add up to
     * @return int[] the two indices of the two numbers that add up to the target
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //take the target, subtract the number at the index
            int complement = target - nums[i];
            //check to see if it's anywhere else in the map
            //and check that it's not just double one number like if target = 8 and the complement is 4
            if(map.containsKey(complement) && map.get(complement) != i){
                solution[0] = map.get(complement);
                solution[1] = i;
            }else{
                //if it's not in the map, put it there
                map.put(nums[i], i);
            }
        }
        //if there is no solution, it will return [0, 0]
        //(I added this caveat even though the problem specified "Exactly One Solution")
            return solution;
    }

    /*
        This approach passed all test cases given plus a few others I considered
        But there was an edge case I hadn't considered before submitting it which threw a runtime
        error. I tried refactoring it and adding that edge case to my test base and it passed.

        This test should not have passed. Strings cannot be compared using ==. I fixed the code to use
        the .equals() method, but now there's a new edge case to consider. To use this approach, I would
        need to use a nested for-loop, but that's too high of a time complexity.

     */

    /**
     * This function should find the longest common prefix string amongst an array of strings.
     * This first approach left out some edge cases. In order to use this approach and consider
     * those edge cases, the time complexity would be too high
     *
     * @param strs String array to check
     * @return String of the longest prefix or empty String ("") if no common prefix exists
     */

    public static String longestCommonPrefixFirstApproach(String[] strs) {
        if(strs.length == 0 || strs[0].equals("")){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String longestPrefix = "";
        String firstWord = strs[0];
        int index = 0;

        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];
            if(firstWord.charAt(index) == word.charAt(index)){
                longestPrefix += word.charAt(index);
                index ++;
            }
        }
        return longestPrefix;
    }

    /**
     * This function finds the longest common prefix string amongst an array of strings.
     *
     * By sorting the array (arrays.sort will sort a string array alphabetically) and
     * only comparing the first and last word, we can save time complexity since any word
     * alphabetically between the first and last one will not contain less of the same characters.
     *
     * @param strs String array to check
     * @return String of the longest prefix or empty String ("") if no common prefix exists
     */
    public static String longestCommonPrefix(String[] strs) {
        //quick checks for constant time cases:
        if(strs.length == 0 || strs[0].equals("")){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        //assign array to temp array so that original array doesn't change due to
        //arrays being passed by reference
        String[] temp = strs;
        Arrays.sort(temp);

        //local variables to make code easier to read
        String longestPrefix = "";
        String firstWord = temp[0];
        int lastIndex = temp.length -1;
        String lastWord = temp[lastIndex];
        int checkWord = Math.min(firstWord.length(), lastWord.length());

        //check each character in order, if it is the same, add it
        for (int i = 0; i < checkWord; i++) {
            if(firstWord.charAt(i) == lastWord.charAt(i)){
                longestPrefix+= firstWord.charAt(i);
            }
            //otherwise, stop and return what we have so far
            else{
                return longestPrefix;
            }
        }
        return longestPrefix;
    }

    /**
     * LeetCode "Easy" problem # 1929: Concatenation of Array
     *
     * Given an integer array nums of length "initialLength", this method creates an array "concatenated" of length
     * 2*initialLength where the input array is concatenated to the end of itself.
     *
     * @param nums integer input array
     * @return integer output array
     */
    public static int[] getConcatenation(int[] nums) {
        int initialLength = nums.length;
        int[] concatenated = new int[2 * initialLength];
        //iterate through once
        for (int i = 0; i < nums.length; i++) {
            //put same int in both spots in the new array
            concatenated[i] = nums[i];
            concatenated[i + initialLength] = nums[i];
        }
        return concatenated;
    }

    /**
     * LeetCode easy problem # 2894: Divisible and Non-divisible Sums Difference
     *
     * This method takes in two ints, n and m. For each number in the range [1, n],
     * it checks to see if that number is divisible by m. The sums of numbers divisible by m is
     * then subtracted from the sum of numbers that are not divisible by m.
     *
     * @param n int upper bound of range
     * @param m int what to divide each number by
     * @return int difference between not divisible and divisible
     */
    public static int differenceOfSums(int n, int m) {
        int divisible = 0;
        int notDivisible = 0;
        for (int i = 1; i <= n; i++) {
            //not divisible
            if(i % m != 0){
                notDivisible += i;
            }else{
                divisible += i;
            }
        }
        return notDivisible - divisible;
    }


}//end of Practice1 class
