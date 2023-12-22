import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Practice1Test {

    @Test
    void isPalindromeTest() {
        int testPalendrome1 = 121;
        int testPalendrome2 = 345;
        int testPalendrome3 = -121;
        int testPalendrome4 = 32123;
        int testPalendrome5 = 0;

        assertTrue(Practice1.isPalindrome(testPalendrome1));
        assertFalse(Practice1.isPalindrome(testPalendrome2));
        assertFalse(Practice1.isPalindrome(testPalendrome3));
        assertTrue(Practice1.isPalindrome(testPalendrome4));
        assertTrue(Practice1.isPalindrome(testPalendrome5));
    }

    @Test
    void twoSumTest(){
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {1, 7, 11, 15};
        int target3 = 9;

        int[] nums4 = {4, 3, 15, 5};
        int target4 = 8;

        assertEquals("[0, 1]", Arrays.toString(Practice1.twoSum(nums1, target1)) );
        assertEquals("[1, 2]", Arrays.toString(Practice1.twoSum(nums2, target2)) );
        assertEquals("[0, 0]", Arrays.toString(Practice1.twoSum(nums3, target3)) );
        assertEquals("[1, 3]", Arrays.toString(Practice1.twoSum(nums4, target4)) );
    }

    @Test
    void longestPrefixTest(){
        String[] array1 = {"flower","flow","flight"};
        String[] array2 = {"dog","racecar","car"};
        String[] array3 = {"apple"};
        String[] array4 = {""};
        String[] array5 = {"", "flea"};

        assertEquals("fl", Practice1.longestCommonPrefix(array1));
        assertEquals("", Practice1.longestCommonPrefix(array2));
        assertEquals("apple", Practice1.longestCommonPrefix(array3));
        assertEquals("", Practice1.longestCommonPrefix(array4));
        assertEquals("", Practice1.longestCommonPrefix(array5));

    }

}