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

        assertEquals("[0, 1]", Arrays.toString(Practice1.twoSum(nums1, target1)) );
        assertEquals("[1, 2]", Arrays.toString(Practice1.twoSum(nums2, target2)) );
        assertEquals("[0, 0]", Arrays.toString(Practice1.twoSum(nums3, target3)) );
    }

}