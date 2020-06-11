package tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Tutorial {


    public static void main(String[] args) throws FileNotFoundException {
            int o = 0;

        LinkedList<String> people = new LinkedList<>();
        people.add("Perro");
        people.push("casa");
        people.add(0, "porton");

//        Iterator<String> iter = people.iterator();
//        {
//            while (iter.hasNext()) {
//                System.out.println(iter.next());
//                
//            }
//        }
//        for (int i = 0; i < people.size(); i++) {
//            String get = people.get(i);
//            System.out.println(people.get(i));
//        }
//        
//        for (Iterator<String> iterator = people.iterator(); iterator.hasNext();) {
//            System.out.println(iterator.next());
//            
//        }
        for (String string : people) {
            System.out.println(people.get(o++));
            
        }
    }

}
