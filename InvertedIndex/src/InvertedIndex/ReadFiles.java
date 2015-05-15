/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InvertedIndex;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author hosein
 */
public class ReadFiles {

    HashMap<String, Integer> map = new HashMap<>();
    HashMap<String, Integer> mapfa = new HashMap<>();

    public ReadFiles() throws IOException {

        Shabih a = new Shabih();
        String en = a.readFile("big.txt");
        String fa = a.readFile("bigfa.txt");
        String everything = en.toString();
        everything = everything.replace("\r", " ");
        everything = everything.replace("\n", " ");
        everything = everything.replace(";", " ");
        everything = everything.replace(":", " ");
        everything = everything.replace("-", " ");
        everything = everything.replace(".", " ");
        everything = everything.replace(",", " ");
        everything = everything.replace("=", " ");
        everything = everything.replace("?", " ");
        everything = everything.replace("!", " ");
        everything = everything.replace("+", " ");
        everything = everything.replace("(", " ");
        everything = everything.replace(")", " ");
        everything = everything.replace("*", " ");
        everything = everything.replace("[", " ");
        everything = everything.replace("]", " ");
        everything = everything.replace("_", " ");
        everything = everything.replace("'", " ");
        everything = everything.replace("\"", " ");
        everything = everything.toLowerCase();
        for (String word : everything.split(" ")) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        /*
         * for (String k : map.keySet()) {
         *
         * System.out.println(k + " : " + map.get(k));
         *
         * }
         */
        String everythingfa = fa.toString();
        everythingfa = everythingfa.replace("\r", " ");
        everythingfa = everythingfa.replace("\n", " ");
        everythingfa = everythingfa.replace(";", " ");
        everythingfa = everythingfa.replace(":", " ");
        everythingfa = everythingfa.replace("-", " ");
        everythingfa = everythingfa.replace(".", " ");
        everythingfa = everythingfa.replace(",", " ");
        everythingfa = everythingfa.replace("=", " ");
        everythingfa = everythingfa.replace("?", " ");
        everythingfa = everythingfa.replace("!", " ");
        everythingfa = everythingfa.replace("+", " ");
        everythingfa = everythingfa.replace("(", " ");
        everythingfa = everythingfa.replace(")", " ");
        everythingfa = everythingfa.replace("*", " ");
        everythingfa = everythingfa.replace("[", " ");
        everythingfa = everythingfa.replace("]", " ");
        everythingfa = everythingfa.replace("_", " ");
        everythingfa = everythingfa.replace("'", " ");
        everythingfa = everythingfa.replace("\"", " ");
        everythingfa = everythingfa.replace("ي", "ی");
        everythingfa = everythingfa.replace("ك", "ک");

        for (String wordfa : everythingfa.split(" ")) {
            if (mapfa.containsKey(wordfa)) {
                mapfa.put(wordfa, mapfa.get(wordfa) + 1);
            } else {
                mapfa.put(wordfa, 1);
            }
        }
        saveen(map);
        savepers(mapfa);
    }

    public static void savepers(Object a) throws FileNotFoundException, IOException {

        FileOutputStream fileOut = new FileOutputStream("persian.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(a);
        out.close();
        fileOut.close();
        System.out.println("Persian hashmap is saved in persian.ser");

    }

    public static void saveen(Object a) throws FileNotFoundException, IOException {

        FileOutputStream fileOut = new FileOutputStream("english.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(a);
        out.close();
        fileOut.close();
        System.out.println("English hashmap is saved in english.ser");

    }
}