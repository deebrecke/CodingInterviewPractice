import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Practice1Test {

    @Test
    void isPalindrome() {
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
}