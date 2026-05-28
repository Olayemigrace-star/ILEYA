import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookSuggestionAppTest{
    @Test
    public void testThatBookIsAddedSuccessfully(){
        String title = "atomic habits";
        String expected = "Book added successfully";
        String actual = BookSuggestionApp.addBook(title);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatBookAlreadyExist(){
        String title = "atomic habits";
        String expected = "Book already exist";
        String actual = BookSuggestionApp.addBook(title);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToRemoveABookFromCollection(){
        String title = "atomic habits";
        String expected = "book removed successfully";
        
        BookSuggestionApp.bookStore.add(title.toLowerCase());
        
        String actual = BookSuggestionApp.removeBook(title);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNotToRemoveBookIfDoesntExist(){
        BookSuggestionApp.bookStore.clear();
    
        String title = "atomic habits";
        String expected = "book does not exist";
        String actual = BookSuggestionApp.removeBook(title);
        assertEquals(expected, actual);
    }
    
    @Test
    public void tesToUpdateANameOfBookThatAlreadyExists(){

    
        String title = "atomic habits";
        String newbook = "Little habits";
        String expected = "Book updated successfully!";
        
        BookSuggestionApp.bookStore.add(title.toLowerCase());
        
        String actual = BookSuggestionApp.updateBook(title, newbook);
        assertEquals(expected, actual);
    }
    
    
    
    @Test
    public void testNotToUpdateANameOfBookThatDoesNotExist(){

    
        String title = "Little jimmy";
        String newbook = "Little habits";
        String expected = "Book does not Exist";
        String actual = BookSuggestionApp.updateBook(title, newbook);
        assertEquals(expected, actual);
    }
    
    
     @Test
    public void testToDisplayAllBooksAvailableInTheStore(){

        BookSuggestionApp.bookStore.clear();
        String title = "Little jimmy";
        
         BookSuggestionApp.bookStore.add(title.toLowerCase());
         
        String expected = "1. little jimmy";
        String actual = BookSuggestionApp.showBook();
        assertEquals(expected, actual);
    }
    
    
    
    
    
    
    
    
    
    
    
}
