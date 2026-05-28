import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReplacedNonPerfectSquareTest{



        @Test
        public void testThatNonPerfectSquaresAreReplacedWithMinusOne(){
        
        int[] number = {4, 7, 9, 10, 49, 6};
        int[] expected = {4, -1, 9, -1, 49, -1};
        int[] actual = ReplacedNonPerfectSquare.nonSquare(number);
        assertArrayEquals(expected, actual);
        

}

}
