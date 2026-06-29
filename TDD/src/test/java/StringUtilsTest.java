import com.github.TebogoP.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {
    @Test
    public void reverseWordHello(){
        String word = "hello";
        StringUtils stringUtilsObj = new StringUtils();
        String result  = stringUtilsObj.reverse(word);
        assertEquals("olleh", result);
    }
}
