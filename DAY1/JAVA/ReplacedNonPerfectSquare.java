import java.util.Arrays;

public class ReplacedNonPerfectSquare{
public static int[] nonSquare(int[] numbers){

int[] nonSquareNumbers = new int[numbers.length];

for(int index = 0; index < numbers.length; index++){
int squareRoot = (int)Math.sqrt(numbers[index]);
if (squareRoot * squareRoot != numbers[index]) nonSquareNumbers[index] = -1;
else {
nonSquareNumbers[index] = numbers[index];
}

}
return Arrays.copyOf(nonSquareNumbers, nonSquareNumbers.length);
}
}
