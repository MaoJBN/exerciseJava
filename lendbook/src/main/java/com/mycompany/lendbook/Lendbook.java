
package com.mycompany.lendbook;

import books.Book;
import java.util.Scanner;
import people.Person;

public class Lendbook {

    public static void main(String[] args) {
        String info="Usuario el sistema de prestamo es por tiempo segun el color que tenga el libro\n 1.El libro verde dura un total de 15 dias\n 2.El libro azul dura un total de 3 dias";
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Ingrese el primer nombre");
        String name = cap.nextLine();
        
        System.out.println("Ingrese codigo");
        int code = cap.nextInt();
        
        Person student = new Person(code, name);
        
        
        System.out.println(info);
        
        Book book1 = new Book("Harry Potter",5,25,"fantasy","verde");
        Book book2 = new Book("elnombre del viento",1,23,"fantasy","azul");
        
        student.askthebook();
    }


}
