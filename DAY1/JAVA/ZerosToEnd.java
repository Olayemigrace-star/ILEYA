public class ZerosToEnd{

public static int[] result(int[] aray){

int count = 0;
int[] derivedaray = new int[aray.length];
for (int index = 0; index < aray.length; index++){
if (aray[index] != 0){
 derivedaray[count++] = aray[index];
}
}
return derivedaray;

}
}
