import java.util.Arrays;
public class PerfectSquareNumbers{

public static int [] squareNumber(int[] aray){
  
int count = 0;
int[] squareNum = new int[aray.length];
for(int index = 0; index < aray.length; index++){
int squareRoot = (int)Math.sqrt(aray[index]);
    if (squareRoot * squareRoot == aray[index]) squareNum[count++] = aray[index];

}
return  Arrays.copyOf(squareNum, count); 
}



}
