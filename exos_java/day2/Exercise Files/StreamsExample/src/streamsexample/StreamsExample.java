
package streamsexample;

import java.util.ArrayList;
import java.util.List;


public class StreamsExample {

    public static void main(String[] args) {
        
        List<Book> books = populateLibrary();
        
        List<Book> result = new ArrayList<>();
        for(Book b : books) {
            if(b.getAuthor().startsWith("J")) {
                result.add(b);
                System.out.println(b);
            }
        }
        
        System.out.println();
        
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).forEach(book -> {
            System.out.println(book);
        });
        
        System.out.println();
        
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).forEach(System.out::println);
        
        System.out.println();
        
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).filter(book -> {
            return book.getTitle().startsWith("E");
        }).forEach(System.out::println);
        
        System.out.println();
        
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).filter(book -> {
            return book.getTitle().startsWith("E");
        }).forEach(System.out::println);
        
    }

    
    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("John Steinbeck", "East of Eden"));
        books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Persuasion"));
        books.add(new Book("Jane Austen", "Mansfield Park"));
        books.add(new Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));
        return books;
    }
    
}
