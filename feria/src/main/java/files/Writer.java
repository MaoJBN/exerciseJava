
package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    File fr;
    FileWriter writer;
    BufferedWriter bfw;

    public Writer(File fr) throws IOException {
        this.fr = fr;
        this.writer = new FileWriter(fr,true);
        this.bfw = new BufferedWriter(writer);
    }
    
    public void addparticipan() throws IOException{
        Scanner sc = new Scanner(System.in);
        Scanner scD = new Scanner(System.in);
        System.out.println("Nombre completo por favor");
        String name = sc.nextLine();
        System.out.println("Codigo");
        String code = scD.nextLine();
        System.out.println("Escriba el nombre de la actividad");
        String activity = sc.nextLine();
        String result = name + ";" + code + ";" + activity;
        try {
            bfw.newLine();
            bfw.write(result);
        } catch (IOException e) {
            
        } finally {
            bfw.close();
        }
    }
}
