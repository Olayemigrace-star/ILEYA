import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DuplicateTest{
        @Test
        public void testThatDuplicateNumbersAreReturned(){
        int[] number = {1, 2, 3, 2, 4, 3};
        int[] expected = {2, 3};
        int[] actual = Duplicate.duplicate(number);
        assertArrayEquals(expected, actual);
        
        }
}
