/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InvertedIndex;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.io.*;
import java.util.HashMap;

/**
 *
 * @author Hosein
 */
public class Tashih {

    HashMap<String, Integer> enkalamat = new HashMap<>();
    HashMap<String, Integer> fakalamat = new HashMap<>();
    

    public Tashih() throws FileNotFoundException, IOException, ClassNotFoundException {


        FileInputStream fileIn = new FileInputStream("english.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        enkalamat = (HashMap) in.readObject();
        in.close();
        fileIn.close();
        HashMap<String, Integer> eni = enkalamat;


        FileInputStream fileIn1 = new FileInputStream("persian.ser");
        ObjectInputStream in1 = new ObjectInputStream(fileIn1);
        fakalamat = (HashMap) in1.readObject();
        in1.close();
        fileIn1.close();
        Shabih b = new Shabih();
        String vorodi1 = b.readFile("voroodi.txt");
        String vorodi = vorodi1.toString();
        vorodi = vorodi.replace("\r", " ");
        vorodi = vorodi.replace("\n", " ");
        vorodi = vorodi.replace(".", " ");
        vorodi = vorodi.replace("،", " ");
        vorodi = vorodi.replace(":", " ");
        vorodi = vorodi.replace("\"", " ");
        
        
        for (String kalame : vorodi.split(" ")) {
            yaftan(kalame);
            
        }
        System.out.println(khorooji);
        PrintWriter out = new PrintWriter("khorooji.txt");
        out.println(khorooji);
        out.close() ;
    }
    String khorooji = "" ;
    public void yaftan(String kal) {
        int flag = 0 ;
        int ehtemal1en = 0;
        int ehtemal2fa = 0;
        
        String kaltoen = converten(kal) ;
        if (enkalamat.containsKey(kaltoen)) {
            ehtemal1en = enkalamat.get(kaltoen);
        }
        String kaltofa = convertfa(kal) ;
        if (fakalamat.containsKey(kaltofa)) {
            ehtemal2fa = fakalamat.get(kaltofa);
        }

        if ((ehtemal1en > ehtemal2fa)){
            khorooji.concat(kaltoen) ;
            khorooji += kaltoen ;
            khorooji += " " ;
            flag = 1 ;
        }
        if ((ehtemal2fa > ehtemal1en)){
            khorooji += kaltofa ;
            khorooji += " " ;
            flag = 1 ;
        }
        if (flag == 0){
            khorooji += kal ;
        }
    }
    public static String convertfa(String enkal){
        String enkal1 = enkal.replaceAll("q", "ض")
                .replaceAll("w", "ص").replaceAll("e", "ث")
                .replaceAll("r", "ق").replaceAll("t", "ف")
                .replaceAll("y", "غ").replaceAll("u", "ع")
                .replaceAll("i", "ه").replaceAll("o", "خ")
                .replaceAll("p", "ح").replaceAll("\\[", "چ")
                .replaceAll("\\]", "چ")
                .replaceAll("\\\\","پ")
                .replaceAll("a", "ش").replaceAll("s", "س")
                .replaceAll("d", "ی").replaceAll("f", "ب")
                .replaceAll("g", "ل").replaceAll("h", "ا")
                .replaceAll("j", "ت").replaceAll("k", "ن")
                .replaceAll("l", "م").replaceAll(";", "ک")
                .replaceAll("'", "گ").replaceAll("z", "ظ")
                .replaceAll("x", "ط").replaceAll("c", "ز")
                .replaceAll("v", "ر").replaceAll("b", "ذ")
                .replaceAll("n", "د").replaceAll("m", "ئ")
                .replaceAll(",", "و").replaceAll("`", "پ")
                .replaceAll("C", "ژ");
        return enkal1 ;
    }
    public static  String converten(String fakal){
        String fakal1 = fakal.replaceAll("د", "n")
                .replaceAll("ش", "a").replaceAll("خ", "o")
                .replaceAll("ذ", "b").replaceAll("ح", "p")
                .replaceAll("ز", "c").replaceAll("ض", "q")
                .replaceAll("ی", "d").replaceAll("ق", "r")
                .replaceAll("ث", "e").replaceAll("س", "s")
                .replaceAll("ب", "f").replaceAll("ف", "t")
                .replaceAll("ل", "g").replaceAll("ع", "u")
                .replaceAll("ا", "h").replaceAll("ر", "v")
                .replaceAll("ه", "i").replaceAll("ص", "w")
                .replaceAll("ت", "j").replaceAll("ط", "x")
                .replaceAll("ن", "k").replaceAll("غ", "y")
                .replaceAll("م", "l").replaceAll("ظ", "z")
                .replaceAll("ئ", "m").replaceAll("گ", "'") ;
        return fakal1 ;
    }
}
