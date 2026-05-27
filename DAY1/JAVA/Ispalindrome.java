import java.util.Arrays;


public class Ispalindrome{

public static boolean number(int[] array){
  
int count = 0;
int [] reversed = new int[array.length];

for(int index = array.length - 1; index >= 0; index--){
reversed[count++] = array[index];
if (Arrays.equals(reversed, array)) {

}
}
return Arrays.equals(reversed, array);
}




}


