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
        String[] array6 = {"", ""};
        String[] array7 = {"apple", "apple", "apple", "apple"};

        assertEquals("fl", Practice1.longestCommonPrefix(array1));
        assertEquals("", Practice1.longestCommonPrefix(array2));
        assertEquals("apple", Practice1.longestCommonPrefix(array3));
        assertEquals("", Practice1.longestCommonPrefix(array4));
        assertEquals("", Practice1.longestCommonPrefix(array5));
        assertEquals("", Practice1.longestCommonPrefix(array6));
        assertEquals("apple", Practice1.longestCommonPrefix(array7));
    }

    @Test
    void getConcatTest(){
        int[] input1 = {1,2,1};
        int[] input2 = {1,3,2,1};
        int[] input3 = {};
        int[] input4 = {5};

        assertEquals("[1, 2, 1, 1, 2, 1]", Arrays.toString(Practice1.getConcatenation(input1)) );
        assertEquals("[1, 3, 2, 1, 1, 3, 2, 1]", Arrays.toString(Practice1.getConcatenation(input2)) );
        assertEquals("[]", Arrays.toString(Practice1.getConcatenation(input3)) );
        assertEquals("[5, 5]", Arrays.toString(Practice1.getConcatenation(input4)) );
    }
    @Test
    void differenceOfSumsTest(){
        assertEquals(19, Practice1.differenceOfSums(10, 3));
        assertEquals(15, Practice1.differenceOfSums(5, 6));
        assertEquals(-15, Practice1.differenceOfSums(5, 1));
    }

    @Test
    void plusOneTest(){
        int[] input1 = {1,2,3};
        int[] input2 = {4,3,2,1};
        int[] input3 = {9};

        assertEquals("[1, 2, 4]", Arrays.toString(Practice1.plusOne(input1)) );
        assertEquals("[4, 3, 2, 2]", Arrays.toString(Practice1.plusOne(input2)) );
        assertEquals("[1, 0]", Arrays.toString(Practice1.plusOne(input3)) );
    }

    @Test
    void findWordsTest(){
        String[] input1 = {"leet", "code"};
        String[] input2 = {"abc", "bcd", "aaaa", "cbc"};

        assertEquals(Arrays.asList(0, 1), Practice1.findWordsContaining(input1, 'e'));
        assertEquals(Arrays.asList(0, 2), Practice1.findWordsContaining(input2, 'a'));
        assertEquals(Arrays.asList(), Practice1.findWordsContaining(input2, 'z'));

    }

    @Test
    void subtractProdAndSumTest(){
        assertEquals(15, Practice1.subtractProductAndSum(234));
        assertEquals(21, Practice1.subtractProductAndSum(4421));
        assertEquals(-15, 960);

    }

    @Test
    void minimumSumTest(){
        assertEquals(52, Practice1.minimumSum(2932));
        assertEquals(13, Practice1.minimumSum(4009));
        assertEquals(27, Practice1.minimumSum(1098));
    }

    @Test
    void numberOfMatchesTest(){
        assertEquals(13, Practice1.numberOfMatches(14));
        assertEquals(6, Practice1.numberOfMatches(7));
    }

    @Test
    void numGameTest(){
        int[] input1 = {5, 4, 2, 3};
        int[] input2 = {2, 5};
        int[] input3 = {1, 2, 3, 4, 5, 6};

        assertEquals("[3, 2, 5, 4]", Arrays.toString(Practice1.numberGame(input1)) );
        assertEquals("[5, 2]", Arrays.toString(Practice1.numberGame(input2)) );
        assertEquals("[2, 1, 4, 3, 6, 5]", Arrays.toString(Practice1.numberGame(input3)) );
    }

    @Test
    void equalStringsTest(){
        String[] string1 = {"a", "bc"};
        String[] string2 = {"ab", "c"};
        String[] string3 = {"a", "bc"};
        String[] string4 = {"a", "cb"};
        String[] string5 = {"abc", "d", "defg"};
        String[] string6 = {"abcddefg"};

        assertTrue(Practice1.arrayStringsAreEqual(string1, string2));
        assertFalse(Practice1.arrayStringsAreEqual(string3, string4));
        assertTrue(Practice1.arrayStringsAreEqual(string5, string6));
    }
}