package tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Tutorial {

    public static void main(String[] args) throws FileNotFoundException {
       
        int[][] data =  {
         {1, 1, 1, 0, 0 },
         {1, 0, 0, 0, 1 },
         {1, 2, 1, 1, 1 },
        };
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
            
        }
    
    }
}
