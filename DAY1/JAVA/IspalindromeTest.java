import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IspalindromeTest{
    @Test
    public void testToCheckThatTheArrayIsPalindrome(){
    int[] array = {45, 0, 8, 0, 45};
    boolean actual = Ispalindrome.number(array);
    assertTrue(actual);


    }

    }
