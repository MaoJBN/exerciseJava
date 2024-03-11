
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
        
      
        int b = 0;
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
            student.setIdlib(i);
            }
            
        break;
        case 23:
            if(book2.getQuantity()<=0){
            System.out.println("No se puede prestar libro");
            }else{
            book2.lendthebook();
            System.out.println("Libro prestado = "+ book2.getTitle());
             student.setIdlib(i);
            }
        break; 
        default:
        System.out.println("No se encontro el libro");
        }
            System.out.println("Si quiere otro libro dijite el 0 si no el 1");
            b = cap.nextInt();
        }
        
        System.out.println(student.getIdlib());
    }
    }

