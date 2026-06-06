import java.util.Scanner;

public class MBTI{
public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your name: ");
        String name = input.nextLine();
        System.out.println("Enter Option A or B for the following questions that best describes You: ");
        
        String[] questionA = {  "A. expend energy, enjoy groups",
                                "A. Interpret literally",
                                "A. logical, thinking, questioning",
                                "A. organized, orderly",
                                "A. more outgoing, think out loud",
                                "A. practical, realistic, experiential",
                                "A. candid, straight forward, frank",
                                "A. plan, schedule",
                                "A. seek many tasks, public activities, interaction with others",
                                "A. standard, usual, conventional",
                                "A. firm, tend to criticize, hold the line",
                                "A. regulated, structured", 
                                "A. external, communicative, express yourself",
                                "A. focus on here-and-now",
                                "A. tough-minded, just",
                                "A. preparation, plan ahead",
                                "A. active, initiate",
                                "A. facts, things, what is",
                                "A. matter of fact, issue-oriented",
                                "A. control, govern"
                              };

              String[] questionB = {  "B. conserve energy, enjoy one-on-one",
                                      "B. look for meaning and possibilities",
                                      "B. empathetic, feeling, accommodating",
                                      "B. flexible, adaptable",
                                      "B. more reserved, think to yourself",
                                      "B. imaginative, innovative, theoretical",
                                      "B. tactful, kind, encouraging",
                                      "B. unplanned, spontaneous",
                                      "B. seek private, solitary activities with quiet to concentrate",
                                      "B. different, novel, unique",
                                      "B. gentle, tend to appreciate, conciliate",
                                      "B. easy-going, live and let live",
                                      "B. internal, reticent, keep to yourself",
                                      "B. look to the future, global perspective,big picture",
                                      "B. tender-hearted, merciful",
                                      "B. go with the flow, adapt as you go",
                                      "B. reflective, deliberate",
                                      "B. ideas, dreams, what could be, philosophical",
                                      "B. sensitive, people-oriented, compassionate",
                                      "B. latitude, freedom"
                                      
                                    };
        


        String[] answer = new String[20];
        boolean active = true;
        while (active){
        for(int counter = 0; counter < questionA.length; counter++){

            System.out.print(questionA[counter] + "  " + questionB[counter] + ":  ");
            String choice = input.nextLine();
            answer[counter] = choice;
            
        if (!choice.equals("A") && !choice.equals("B")){

        System.out.print("Enter Option A or B \nPlease Try again\n");
        System.out.println();
        

        }
         else {
            answer[counter] = choice.toUpperCase(); 
            active = false; 
            
          String choice = input.nextLine();            
        }
    }
}
       
   
        System.out.println("Hello " + name + " You selected" );

        int counterA = 0;
        int counterB = 0;
        for(int counter = 0; counter < questionA.length; counter++){

            if(counter == 0 || counter == 4 || counter == 8 || counter == 12 || counter == 16){
                if(answer[counter].equalsIgnoreCase("A")){
                    System.out.println(questionA[counter]);
                    counterA++; 
                }else if(answer[counter].equalsIgnoreCase("B")){
                    System.out.println(questionB[counter]);
                    counterB++;
                }
            }

        }
        System.out.printf("Numbers of A selected: %d%nNumbers of B Selected: %d%n",counterA, counterB);
        System.out.println();


        int countA2 = 0;
        int countB2 = 0;
        for(int counter = 0; counter < questionA.length; counter++){

            if(counter == 1 || counter == 5 || counter == 9 || counter == 13 || counter == 17){
                if(answer[counter].equals("A")){
                    System.out.println(questionA[counter]);
                    countA2++; 
                }else if(answer[counter].equals("B")){
                    System.out.println(questionB[counter]);
                    countB2++;
                }
            }

        }
        System.out.printf("Numbers of A selected: %d%nNumbers of B Selected: %d%n",countA2,countB2);
        System.out.println();



        int countA3 = 0;
        int countB3 = 0;
        for(int counter = 0; counter < questionA.length; counter++){

            if(counter == 2 || counter == 6 || counter == 10 || counter == 14 || counter == 18){
                if(answer[counter].equals("A")){
                    System.out.println(questionA[counter]);
                    countA3++; 
                }else if(answer[counter].equals("B")){
                    System.out.println(questionB[counter]);
                    countB3++;
                }
            }

        }
        System.out.printf("Numbers of A selected: %d%nNumbers of B Selected: %d%n",countA3,countB3);
        System.out.println();


//        For judging vs Perceptive: Questions 4,8,12,16,20
        int countA4 = 0;
        int countB4 = 0;
        for(int counter = 0; counter < questionA.length; counter++){

            if(counter == 3 || counter == 7 || counter == 11 || counter == 15 || counter == 19){
                if(answer[counter].equals("A")){
                    System.out.println(questionA[counter]);
                    countA4++; 
                }else if(answer[counter].equals("B")){
                    System.out.println(questionB[counter]);
                    countB4++;
                }
            }

        }
        System.out.printf("Numbers of A selected: %d%nNumbers of B Selected: %d%n",countA4,countB4);
        System.out.println();

//        highest count between A and B for each category behavior

        String highest1;
        String highest2;
        String highest3;
        String highest4;
        if(counterA > counterB){

            highest1 = "E";
        }
        else{
            highest1 = "I";
        }

        if(countA2 > countB2){

            highest2 = "S";
        }
        else{
            highest2 = "N";
        }

        if(countA3 > countB3){

            highest3 = "T";
        }
        else{
            highest3 = "F";
        }

        if(countA4 > countB4){

            highest4 = "J";
        }
        else{
            highest4 = "P";
        }

//    Combination formed

        String personality = highest1 + highest2 + highest3 + highest4;
        System.out.printf("Personality is: %s%n", personality);
        
        
}
}

