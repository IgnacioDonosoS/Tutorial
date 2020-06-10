
package tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Tutorial {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("nombres.txt"));
        ArrayList<String> estudiantes = new ArrayList<>();
        
        while (sc.hasNextLine()) {
        estudiantes.add(sc.nextLine());
        }
        
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i)); 
        }
        Iterator<String> iter = estudiantes.iterator();
        while (iter.hasNext()) {            
            System.out.println(iter.next());
        }
        }
    
}
