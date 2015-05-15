/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InvertedIndex;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
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

            Scanner input = new Scanner(System.in);
            System.out.println("Please choose: \n1 - Update hash \n2 - Use Program");
            int x = input.nextInt();
            if (x == 1) {
                ReadFiles readFiles = new ReadFiles();
            }
            if (x == 2) {
                Tashih aval = new Tashih() ;
               
            }

        } catch (InputMismatchException c) {
            System.out.println("Please Enter correct number");

        } catch (Exception ex) {
            Logger.getLogger("errrrrrror").log(Level.SEVERE, null, ex);
        }

    }
}
