package books;

public class Book {
    String title;
    int quantity;
    int id;
    String genre;
    String color;
    int loandate;
    int returndate;
    boolean available;

    public Book(String title, int quantity, int id, String genre, String color) {
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre;
        this.available = true;
        this.color = color;
    }
    
    public void lendthebook(){
       this.available = false;
       this.quantity = quantity-1;
    }
    public void returnbook(){
        this.available =true;
        this.quantity = quantity+1;
    }

    public boolean isAvailable() {
        return available;
    }
    public int colortime(){
        int time1 = 15;
        int time2=3;
        if(this.color == "verde"){
            return time1;
        }else{
            return time1;
        }
        
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTitle() {
        return title;
    }
    
    
}
