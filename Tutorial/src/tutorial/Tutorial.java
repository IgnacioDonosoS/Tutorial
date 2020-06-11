
package tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Tutorial {

    public static void main(String[] args) throws FileNotFoundException {
      
        LinkedList<String> people = new LinkedList<>();
        people.add("Perro");
        people.push("casa");
        people.add(0, "porton");
        
        System.out.println(people.remove());
        System.out.println(people.remove());
        System.out.println(people.remove());
        
                
        }
    
}
