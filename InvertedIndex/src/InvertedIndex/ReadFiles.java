/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InvertedIndex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
   /*     for (String k : map.keySet()) {

            System.out.println(k + " : " + map.get(k));
           
        }
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

        for (String wordfa : everythingfa.split(" ")) {
            if (mapfa.containsKey(wordfa)) {
                mapfa.put(wordfa, mapfa.get(wordfa) + 1);
            } else {
                mapfa.put(wordfa, 1);
            }
        }
        for (String h : mapfa.keySet()) {

            System.out.println(h + " : " + mapfa.get(h));
           
        }
    }
}