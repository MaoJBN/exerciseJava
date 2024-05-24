
package com.mycompany.feria.people;

import java.util.List;

public class Student {
    String name;
    String DNI;
    Activity activity;
    String iniciales = "";
    int numeroAleatorio;
    public Student() {
    }

    public Student(String name, String DNI, Activity activity, int numeroAleatorio) {
        this.name = name;
        this.DNI = DNI;
        this.activity = activity;
        this.numeroAleatorio = numeroAleatorio;
    }
    
    public void code(List<String> information){
        
        for (String string : information) {
            String [] splited = string.split(" ");
            iniciales= "";
            for (String str : splited) {
            if (!str.isEmpty()) {
                
                iniciales+= str.charAt(0);
            } 
        }
            numeroAleatorio = (int) (Math.random() * 900);
            System.out.println(iniciales+numeroAleatorio);
        }    
        
    }

    public String getName() {
        return name;
    }
}
