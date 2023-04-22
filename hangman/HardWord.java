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
public class HardWord {
    String[] hard = {"BELGIUM","DENMARK","GERMANY","ICELAND","IRELAND","OSTRICH","PELICAN","READING","UNIFORM","PARSLEY",
    "BROWNIE","SPINACH","APRICOT","PEANUT"};
     Random r = new Random();
     int n = r.nextInt(hard.length);
     String word=hard[n];
     char c1=word.charAt(0);
     char c2=word.charAt(1);
     char c3=word.charAt(2);
     char c4=word.charAt(3);
     char c5=word.charAt(4);
     char c6=word.charAt(5);
     char c7=word.charAt(6);

    void generate()
    {
        System.out.println(word);
     new HardFrame(c1,c2,c3,c4,c5,c6,c7,word).setVisible(true);
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
    public char getc7()
    {
        return c7;
    }
    public char getc4()
    {
        return c4;
    }
    public char getc5()
    {
        return c5;
    }
    public char getc6()
    {
        return c6;
    }
    public static void main(String[]args){
     HardWord w = new HardWord();
     w.generate();
    }
}