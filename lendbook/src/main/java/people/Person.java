
package people;

import java.util.Scanner;
import books.Book;

public class Person {
    Scanner cap = new Scanner(System.in);
    int b =0;
    int code;
    String name;
    int idlib;
    public Person(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void askthebook(){
        this.b = b;
        while(b==0){
             System.out.println("Ingrese el cod del libro");
        int i = cap.nextInt();
        switch (i) { 
        case 25:
            if(book1.getQuantity()<=0){
                System.out.println("No se puede prestar libro");
            }else{
            book1.lendthebook();
            System.out.println("Libro prestado = " + book1.getTitle());
            this.idlib=i;
            }
            
        break;
        case 23:
            if(book2.getQuantity()<=0){
            System.out.println("No se puede prestar libro");
            }else{
            book2.lendthebook();
            System.out.println("Libro prestado = "+ book2.getTitle());
            this.idlib=i;
            }
        break; 
        default:
        System.out.println("No se encontro el libro");
        }
            System.out.println("Si quiere otro libro dijite el 0 si no el 1");
            b = cap.nextInt();
        }
        
    }

    public int getIdlib() {
        return idlib;
    }

    public void setIdlib(int idlib) {
        this.idlib = idlib;
    }
    
}
