/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InvertedIndex;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hosein
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            new ReadFiles();
            Scanner input = new Scanner(System.in);
            System.out.println("Please Type !");
            
        } catch (Exception ex) {
            Logger.getLogger("errrrrrror").log(Level.SEVERE, null, ex);
        }
    }
}
