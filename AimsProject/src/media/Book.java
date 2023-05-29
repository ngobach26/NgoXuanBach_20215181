package media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

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
