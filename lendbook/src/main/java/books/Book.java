package books;

public class Book {
    String title;
    int quantity;
    int id;
    String genre;
    int loandate;
    int returndate;
    boolean available;

    public Book(String title, int quantity, int id, String genre) {
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre;
        this.available = true;
    }
    
    public void lendthebook(){
       this.available = false;
    }
    public void returnbook(){
        this.available =true;
    }

    public boolean isAvailable() {
        return available;
    }
    
    
}
