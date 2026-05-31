import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZerosToEndTest{

        @Test
        public void testThatTheNewArayArrangesZerosToTheEnd(){
        int[] number = {5, 0, 3, 0, 2, 0};
        int[] expected = {5, 3, 2, 0, 0, 0};
        int[] actual = ZerosToEnd.result(number);
        assertArrayEquals(expected, actual);
        
        }
}
