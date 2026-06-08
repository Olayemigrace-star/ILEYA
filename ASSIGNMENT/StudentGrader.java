import java.util.Scanner;
//import java.util.Arrays;
public class StudentGrader{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter the Number of students: ");
    int studentNumber = input.nextInt();
    System.out.print("Enter the Number of Subjects: ");
    int subjects = input.nextInt();
    System.out.println();
    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>> ");
    System.out.println("Saved Successfullyy\n");
   
   
    int [][] studentGrade = new int[studentNumber][subjects];
    
    
     for (int index = 0; index < studentNumber; index++){
      
        for (int count = 0; count < subjects; count++){
        
        
            System.out.println("<<< Entering Score For Student " + (index + 1) + ">>>");
            System.out.println("Enter score for subject " + (count + 1));
            studentGrade[index][count] = input.nextInt();
            if (studentGrade[index][count] < 0 || studentGrade[index][count] > 100){
            System.out.println("Enter the Valid Score: ");
            count--;
            continue;
            }
            //studentGrade[index][count] = studentTotals;
           }
            
            
    }
    
    
     System.out.println("=======================================================================================");
      System.out.print("STUDENT\t\t" + "");
        for (int number = 1; number <= subjects; number++){
             System.out.print("SUB" +  number + "\t");
        }
        System.out.println("TOTAL\tAVG\tPOS");
        System.out.println("=======================================================================================");
    
    
  
    
    
     for (int index = 0; index < studentNumber; index++){
     double studentTotal = 0;
     double studentsAverage = 1;
     int gradePosition = 0;
     int highest = 0;
     int counter = 0;
     System.out.print("Student " + (index + 1) + "\t");
        for (int count = 0; count < subjects; count++){
             System.out.print(studentGrade[index][count] + "\t");
            studentTotal += studentGrade[index][count];
            
        }
            System.out.print(studentTotal + "\t");
            studentsAverage = studentTotal / subjects;
            System.out.print(studentsAverage);
           
       
            if (highest > studentsAverage) studentsAverage = highest;
            System.out.print(counter + 1);
            System.out.println();
            counter++;
    }
    
   
    
    
    
    
    
    }
    
    }

