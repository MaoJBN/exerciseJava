
package com.mycompany.lendbook;

import books.Book;
import java.util.Scanner;

public class Lendbook {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese codigo");
        int code = cap.nextInt();
        System.out.println("Ingrese el primer nombre");
        String name = cap.nextLine();
        System.out.println("Ingrese la carrera");
        String profession = cap.nextLine();
        Person student = new Person(code, name, profession);
        student.getCode();
        
        
        Book book1 = new Book("Harry Potter",5,25,"fantasy");
        Book book2 = new Book("elnombre del viento",1,23,"fantasy");
        book1.lendthebook();
        System.out.println(book1.isAvailable());
         System.out.println(book2.isAvailable());
        
    }

}
