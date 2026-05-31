public class FlattensArray{

public static int[] flattenArray(int[][] twod){

int[] flatAray = new int[twod.length * twod[0].length];
int count = 0;
for (int[] flatArray : twod){
    for (int values : flatArray){
    flatAray[count++] = values;

}
}
return flatAray;

}
}
