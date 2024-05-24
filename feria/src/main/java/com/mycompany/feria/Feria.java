
package com.mycompany.feria;

import com.mycompany.feria.people.Participants;
import com.mycompany.feria.people.Student;
import files.Reader;
import java.io.File;
import java.io.FileNotFoundException;
import files.Writer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Feria {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f1 = new File("./base.txt");
        Reader rd = new Reader(f1);
        Writer wr = new Writer(f1);
        Student st = new Student();
        Participants pt = new Participants();
        List<String> base = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        int sel = sc.nextInt();
        switch (sel) {
            case 1:
                wr.addparticipan();
            case 2:
                base = rd.readFil();
                st.code(base);
            case 3:
                base = rd.readFil();
                pt.show(base);
            default:
        }
        
        
        
    }
}
