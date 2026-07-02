package Junior;

import com.github.TebogoP.Junior.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void reverseWordHello(){
        String word = "hello";
        StringUtils stringUtilsObj = new StringUtils();
        String result  = stringUtilsObj.reverse(word);
        assertEquals("olleh", result);
    }

    @Test
    public void reverseEmptyString(){
        String word = " ";
        StringUtils stringUtilsObj = new StringUtils();
        String result  = stringUtilsObj.reverse(word);
        assertEquals(" ", result);
    }

    @Test
    public void reverseSingleChar(){
        String word = "a";
        StringUtils stringUtilsObj = new StringUtils();
        String result  = stringUtilsObj.reverse(word);
        assertEquals("a", result);

    }

    @Test
    public void isHelloPalindrome(){
        String word = "hello";
        StringUtils stringUtilsObj = new StringUtils();
        String result  = stringUtilsObj.reverse(word);
        assertFalse(stringUtilsObj.isPalindrome(word,result));
    }

    @Test
    public void isRacecarPalindrome(){
        String word = "racecar";
        StringUtils stringUtilsObj = new StringUtils();
        assertEquals("racecar", stringUtilsObj.reverse(word));
        assertTrue(stringUtilsObj.isPalindrome(word,stringUtilsObj.reverse(word)));
    }

    @ParameterizedTest
    @CsvSource({
            "hello, olleh", //reverseWord
            "world, dlrow", //reverseWord
            "a,     a", //single char
            "racecar, racecar", //Palindrome
            " \" \", \" \" "      // reverseEmptyString
    })
    public void reverseVariousInputs(String input, String expected) {
        StringUtils stringUtilsObj = new StringUtils();
        assertEquals(expected, stringUtilsObj.reverse(input));
    }
}
