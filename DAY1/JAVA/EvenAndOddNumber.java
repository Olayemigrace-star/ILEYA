public class EvenAndOddNumber{

public static int[][] evenAndOddNumbers(int[] array){
int evencount = 0;
int oddcount = 0;

for(int index = 0; index < array.length; index++){
  if (array[index] % 2 == 0) evencount++;
  else oddcount++;
  
  }
  
int[] evenNumber = new int [evencount];
int[] oddNumber = new int [oddcount];

int evenCounter = 0;
int oddCounter = 0;
  for(int index = 0; index < array.length; index++){
  if (array[index] % 2 == 0) evenNumber[evenCounter++] = array[index];
   else oddNumber[oddCounter++] = array[index];
  
  } 

int[][] evenAndOddNumbers = {evenNumber, oddNumber};

return evenAndOddNumbers;
}



}
