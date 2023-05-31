package media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    public static int nbBooks = 0;

    public Book(String title, String category, float cost) {
        super(title, category, cost);
        this.id = nbBooks;
        nbBooks++;
    }

    public void addAuthors(String author){
        if(authors.contains(author)){
            System.out.println("The author already exist");
            return;
        }
        authors.add(author);
    }
    
    public void removeAuthors(String author){
        int index = authors.indexOf(author);

        if(index == -1){
            System.out.println("The author does not exist");
        }else{
            authors.remove(index);
        }
    }
}
