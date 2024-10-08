import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SolutionUnitTest {
    @Test
    public void testPalindromeFound() {
        assertEquals(1, PalindromeSteps.findPalindrome(47));
        assertEquals(2, PalindromeSteps.findPalindrome(49));
    }

    @Test
    public void testPalindromeNotFound() {
        assertEquals(-1, PalindromeSteps.findPalindrome(196));  // Сложное число, для которого палиндром может не находиться
    }
}
