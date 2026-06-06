questionA = [

    "A. expand energy, enjoy groups",
    "A. interpret literally",
    "A. logical, thinking, questioning",
    "A. organized, orderly",
    "A. more outgoing, think out loud",
    "A. practical, realistic",
    "A. candid, straight forward, frank",
    "A. plan schedule",
    "A. seek many task",
    "A. standard, usual, conventional",    
    "A. firm, tend to criticize",
    "A. regulated, structured",
    "A. external, communicative",
    "A. focus on here-and-now",
    "A. tough-minded, just",
    "A. preparation, plan ahead",
    "A. active, initiate",
    "A. facts, things, what is",
    "A. matter of fact",
    "A. control, govern"
  ]

questionB = [

    "B. conserve energy, enjoy one-on-one",
    "B. look for meaning and posibilities",
    "B. empathetic, feeling, accommodating",
    "B. flexible, adaptable",
    "B. more reserved, think to yourself",
    "B. imaginative, innovative",
    "B. tactful, kind, encouraging",
    "B. unplanned, spontaneous",
    "B. seek private, solitary activities",
    "B. different, novel, unique" ,
    "B. gentle, tend to appriciate",
    "B. easy-going, live and let live",
    "B. internal, retcent",
    "B. look to the future, big picture",
    "B. tender-hearted, merciful",
    "B. go with the flow",
    "B. reflective, deliberate",
    "B. ideas, dreams, what could be",
    "B. sensitive, people-oriented",
    "B. latitude, freedom",
 ]


response = []

name = input("what is your name ?:")

print("Enter Option A or B for the following questions that best describes You: ")
for count in range (20):
    print(questionA[count] + "            " + questionB[count])
    answer = input()
    print()
    answer = answer.upper()
    
    
    while answer != "A" and answer != "B":

        print("Enter the Right option")
        print("This is an error, please Try again")

        answer = input("Choose A or B: \n")
        answer = answer.upper()
        
    response.append(answer)

count_e = 0
count_i = 0

count_s = 0
count_n = 0

count_t = 0
count_f = 0

count_j = 0
count_p = 0

print("\nHello " + name + " you selected; ");
for count in range (20):
    if (count == 0 or count == 4 or count == 8 or count == 12 or count == 16):
        if response[count] == "A":
            print(questionA[count]) 
            count_e = count_e + 1; 
            
        
        else :
            count_i = count_i + 1;

    elif (count == 1 or count == 5 or count == 9 or count == 13 or count == 17):
        if response[count] == "A":
            print(questionA[count]) 
            count_s = count_s + 1;
        
        else :
            print(questionB[count])
            count_n = count_n + 1;    
  
    elif (count == 2 or count == 6 or count == 10 or count == 14 or count == 18):
        if response[count] == "A":
            print(questionA[count]) 
            count_t = count_t + 1;    
       
        else: 
            print(questionB[count])
            count_f = count_f + 1;
   
    elif (count == 3 or count == 7 or count == 11 or count == 15 or count == 19):
        if response[count] == "A":
            print(questionA[count]) 
            count_j = count_j + 1    
       
        else: 
            print(questionB[count])
            count_p = count_p + 1
            
            
print("Number Of A Selected ", count_e)
print("Number Of B Selected ", count_i, "\n")
        
print("Number Of A Selected ", count_s)
print("Number Of B Selected ", count_n, "\n")

print("Number Of A Selected ", count_t)
print("Number Of B Selected ", count_f, "\n")
        
print("Number Of A Selected ", count_j)
print("Number Of B Selected ", count_p, "\n")
        
       

        
     

personality_type = ""

if count_e > count_i:
    personality_type = personality_type + "E"

else:
    personality_type = personality_type + "I"


if count_s > count_n:
    personality_type = personality_type + "S"

else :
    personality_type = personality_type + "N"


if count_t > count_f:
    personality_type = personality_type + "T"

else:
    personality_type = personality_type + "F"


if count_j < count_p:
    personality_type = personality_type + "J"

else :
    personality_type = personality_type + "P"


print("\nHello " + name);
print("Your personality Type is: " + personality_type)

