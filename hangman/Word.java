/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Boomika
 */
public class Word {
    String[] easy = {"CAT","DOG","PIG","RAT","COW","FOX","APE","YAK","ANT","BUG","FLY","BAT","OWL","EMU","HEN","EAR","ARM","LIP","CAP","MAP","PEN","BED",
        "PAN","LEG"};
    
     Random r = new Random();
     int n = r.nextInt(easy.length);
     String word=easy[n];
     char c1=word.charAt(0);
     char c2=word.charAt(1);
     char c3=word.charAt(2);
     
    void generate()
    {
        System.out.println(word);
        new EasyFrame(c1,c2,c3,word).setVisible(true);
    }
    public char getc1()
    {
        return c1;
    }
    public char getc2()
    {
        return c2;
    }
    public char getc3()
    {
        return c3;
    }
    public static void main(String[]args){
     Word w = new Word();
     w.generate();
    }
}
