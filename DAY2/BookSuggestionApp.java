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
                
                scanner.nextLine();
                switch(task){
                
                    case 1:
                        BookCollection suggestions = randomSuggestion();
                        System.out.print("Book for the day");
                        System.out.print("Book Title: ");
                        System.out.print(suggestions.randomBook());
                        System.out.println(suggestions.page());
                        System.out.println();
                        break;
                        
                    case 2:
                        
                        System.out.print("Enter the book title: ");
                        String bookTitle = scanner.nextLine();
                        System.out.println(addBook(bookTitle));
                        System.out.println();
                        break;
                        
                     case 3:
                        
                        System.out.print("Enter the book title to remove: ");
                        String removeTitle = scanner.nextLine();
                        System.out.println(removeBook(removeTitle));
                        System.out.println();
                        break;
                      
                       case 4:
                        
                        System.out.print("Enter the old title: ");
                        String oldbook = scanner.nextLine();
                        System.out.print("Enter the new title: ");
                        String updateTitle = scanner.nextLine();
                        System.out.println(updateBook(oldbook, updateTitle));
                        System.out.println();
                        break;
                    
                      
                        case 5:
                        
                        System.out.println("All books: ");
                        System.out.println(showBook());
                        System.out.println();
                        break;
                
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
                names.append((index + 1) + ". " + bookStore.get(index) + "\n");
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
    
    
    
    
    
    
    
    
    
    
    
    
    

