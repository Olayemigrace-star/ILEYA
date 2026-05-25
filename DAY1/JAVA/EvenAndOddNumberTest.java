import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenAndOddNumberTest{
    @Test
    public void testThatTheArrayReturnsEvenNumberAndOddNumber(){
    int[] number = {45, 60, 3, 10, 9, 22};
    int [][]expectednumber = {{60, 10, 22}, {45, 3, 9}};
    int[][] actual = EvenAndOddNumber.evenAndOddNumbers(number);
    assertArrayEquals(expectednumber, actual);


    }

    }
