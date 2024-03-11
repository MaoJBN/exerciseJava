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
            return time2;
        }
        
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLoandate() {
        return loandate;
    }

    public void setLoandate(int loandate) {
        this.loandate = loandate;
    }

    public int getReturndate() {
        return returndate;
    }

    public void setReturndate(int returndate) {
        this.returndate = returndate;
    }
    
    
}
