
package com.mycompany.feria.people;

import java.util.List;

public class Participants {
    int v=0;
    public Participants() {
    }
    public void show(List<String> information){
        for (String string : information) {
//            splited [] = string.split(" ")
//            if(){
//            v++;
//            }
            System.out.println(string);  
        }
        System.out.println(v);
    }
}
