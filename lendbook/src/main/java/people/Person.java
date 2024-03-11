
package people;

import java.util.Scanner;
import books.Book;

public class Person {
    Scanner cap = new Scanner(System.in);
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
    public int getIdlib() {
        return idlib;
    }

    public void setIdlib(int idlib) {
        this.idlib = idlib;
    }
    
}
