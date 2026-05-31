import java.util.Arrays;
public class Duplicate{

public static int[] duplicate(int[] array){

int count = 0;
int[] appearedNum = new int[array.length];
    for (int index = 0; index < array.length; index++){
        for(int counter = 0; counter < index; counter++){
if (array[index] == array[counter]){
 appearedNum[count++] = array[index];
}
}
}
return Arrays.copyOf(appearedNum, count);

}
}
