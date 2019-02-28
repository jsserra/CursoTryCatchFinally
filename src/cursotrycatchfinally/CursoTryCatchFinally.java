/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursotrycatchfinally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author setinf
 */
public class CursoTryCatchFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed!"); //Observe que o block finally vai ser executado, independentemente se vai dar certo ou não o try 
        }
        
    }

}
