import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlattensArrayTest{
        @Test
        public void testThatTheTwoDimensionalArrayReturnsASingleArray(){
        int[][] number ={{9, 0, 7}, {3, 5, 1}, {8, 1, 7}, {9, 9, 6}};
        int[] expected = {9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6};
        int[] actual = FlattensArray.flattenArray(number);
        assertArrayEquals(expected, actual);
        
        }
}
