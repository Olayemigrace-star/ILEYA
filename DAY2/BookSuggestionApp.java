import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class BookSuggestionApp{
    public static void main(String[] grace){

        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;
        while (isActive){
        
            System.out.print("Welcome To The Book Suggestion System ");
            System.out.print("""
            
                                    ==========================================
                                        What Would You Like To Do today...
                                    ==========================================
                                        Enter any Number To Perform any of the operations ;
                                       1. Get Suggestions
                                       2. Add Book
                                       3. Remove Book
                                       4. Update Book
                                       5. Show All Book
                                      
                              """);
                System.out.print("Enter Operation: ");
                int task = scanner.nextInt();
                switch(task){
                
                    case 1:
                        BookCollection suggestions = randomSuggestion();
                        System.out.print("Book for the day");
                        System.out.print("Book Tittle: ");
                        System.out.print(suggestions.randomBook());
                        
                    case 2:
                        
                        System.out.print("Enter the book tittle");
                        String bookTittle = scanner.nextLine();
                        System.out.print(bookStore.addBook());
                    
                
                }
                if (task == 4){
                System.out.print("Enter The Old Tittle Of The Book: ");
                

                System.out.print("Enter New Tittle Of The Book: ");
                String newbook = scanner.nextLine();


        
        }
    
    }

}
    
public static ArrayList<String> bookStore = new ArrayList<>();
    
    public static String addBook(String title){
        
        for (String book : bookStore){
            if(title.equalsIgnoreCase(book)){
                 return "Book already exist";
            }
        } 
        bookStore.add(title);
        return "Book added successfully";
    }
    
    public static String removeBook(String title){
        
            if (bookStore.contains(title.toLowerCase())){
                bookStore.remove(title.toLowerCase());
                return "book removed successfully";
            }
        return "book does not exist";
    }
    
    public static String updateBook(String title, String newbook){
            for(int i = 0; i < bookStore.size(); i++){
            if (bookStore.get(i).equalsIgnoreCase(title)){
                bookStore.set(i, newbook);
                return "Book updated successfully!";
            }
    }
    return "Book does not Exist";
    }
    
    
    public static String showBook(){
    StringBuilder names = new StringBuilder();
       int value = 0;
            for(int index = 0; index < bookStore.size(); index++){
                names.append((index + 1) + ". " + bookStore.get(index));
            }
      return names.toString();      
    }
    
    
    public record BookCollection(String randomBook, int page){}
    public static BookCollection randomSuggestion(){
    
    Random num = new Random();
    int random = num.nextInt(0, bookStore.size());
    int page = num.nextInt(1, 101);
    String randomBook = bookStore.get(random);
    
    return new BookCollection(randomBook, page);
     
    }
    
   
    
    
    }
    
    
    
    
    
    
    
    
    
    
    

