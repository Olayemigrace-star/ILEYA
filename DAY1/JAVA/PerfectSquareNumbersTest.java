import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PerfectSquareNumbersTest{
    @Test
    public void testToCheckForPerfectSquares(){
    int[] number = {4, 7, 9, 10, 16, 18};
    int[] expectednumber = {4, 9, 16};
    int[] actual = PerfectSquareNumbers.squareNumber(number);
    assertArrayEquals(expectednumber, actual);


    }

    }
