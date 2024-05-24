
package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Reader {
    File fr;
    FileReader reader;
    BufferedReader bfr;

    public Reader(File fr) throws FileNotFoundException {
        this.fr = fr;
        this.reader = new FileReader(fr);
        this.bfr = new BufferedReader(reader);
    }
    
    public List<String> readFil(){
        String line = null;
        List<String> dta = new ArrayList<>();
            try {
                 while((line = bfr.readLine()) != null){
                dta.add(line);
                 }
            } catch (IOException e) {
                
            }finally{
                try {
                    if(reader == null){
                        reader.close();
                    }
                } catch (IOException e2) {
                    
                }
            }
        return dta;
    }
}
