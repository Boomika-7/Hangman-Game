/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;
import static hangman.EasyFrame.noOfchoices;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.Canvas;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Boomika
 */
public class HardFrame extends javax.swing.JFrame {
    public char a,b,c,d,e,f,g;
    public String word;
    static int noOfchoices=1;
    
    /**
     * Creates new form HardFrame
     */
    public HardFrame(char c1,char c2,char c3,char c4,char c5,char c6,char c7,String W) {
        a=c1;
        b=c2;
        c =c3;
        d=c4;
        e=c5;
        f =c6;
        g=c7;
        word=W;
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void choose(char x){
        
        if(noOfchoices != 7)
        {
           if(Letter1.getText().equals("") || Letter2.getText().equals("") || Letter3.getText().equals("") || Letter4.getText().equals("") || 
                   Letter5.getText().equals("") || Letter6.getText().equals("") || Letter7.getText().equals(""))
           {
                if(a==x)
                {
                    if(x=='A')
                        Letter1.setText("A");
                    else if(x=='B')
                        Letter1.setText("B");
                    else if(x=='C')
                        Letter1.setText("C");
                    else if(x=='D')
                        Letter1.setText("D");
                    else if(x=='E')
                        Letter1.setText("E");
                    else if(x=='F')
                        Letter1.setText("F");
                    else if(x=='G')
                        Letter1.setText("G");
                    else if(x=='H')
                        Letter1.setText("H");
                    else if(x=='I')
                        Letter1.setText("I");
                    else if(x=='J')
                        Letter1.setText("J");
                    else if(x=='K')
                        Letter1.setText("K");
                    else if(x=='L')
                        Letter1.setText("L");
                    else if(x=='M')
                        Letter1.setText("M");
                    else if(x=='N')
                        Letter1.setText("N");
                    else if(x=='O')
                        Letter1.setText("O");
                    else if(x=='P')
                        Letter1.setText("P");
                    else if(x=='Q')
                        Letter1.setText("Q");
                    else if(x=='R')
                        Letter1.setText("R");
                    else if(x=='S')
                        Letter1.setText("S");
                    else if(x=='T')
                        Letter1.setText("T");
                    else if(x=='U')
                        Letter1.setText("U");
                    else if(x=='V')
                        Letter1.setText("V");
                    else if(x=='W')
                        Letter1.setText("W");
                    else if(x=='X')
                        Letter1.setText("X");
                    else if(x=='Y')
                        Letter1.setText("Y");
                    else
                        Letter1.setText("Z");
                }
                else if(b == x)
                {
                    if(x=='A')
                        Letter2.setText("A");
                    else if(x=='B')
                        Letter2.setText("B");
                    else if(x=='C')
                        Letter2.setText("C");
                    else if(x=='D')
                        Letter2.setText("D");
                    else if(x=='E')
                        Letter2.setText("E");
                    else if(x=='F')
                        Letter2.setText("F");
                    else if(x=='G')
                        Letter2.setText("G");
                    else if(x=='H')
                        Letter2.setText("H");
                    else if(x=='I')
                        Letter2.setText("I");
                    else if(x=='J')
                        Letter2.setText("J");
                    else if(x=='K')
                        Letter2.setText("K");
                    else if(x=='L')
                        Letter2.setText("L");
                    else if(x=='M')
                        Letter2.setText("M");
                    else if(x=='N')
                        Letter2.setText("N");
                    else if(x=='O')
                        Letter2.setText("O");
                    else if(x=='P')
                        Letter2.setText("P");
                    else if(x=='Q')
                        Letter2.setText("Q");
                    else if(x=='R')
                        Letter2.setText("R");
                    else if(x=='S')
                        Letter2.setText("S");
                    else if(x=='T')
                        Letter2.setText("T");
                    else if(x=='U')
                        Letter2.setText("U");
                    else if(x=='V')
                        Letter2.setText("V");
                    else if(x=='W')
                        Letter2.setText("W");
                    else if(x=='X')
                        Letter2.setText("X");
                    else if(x=='Y')
                        Letter2.setText("Y");
                    else
                        Letter2.setText("Z");
                }
                else if(c == x)
                {
                    if(x=='A')
                        Letter3.setText("A");
                    else if(x=='B')
                        Letter3.setText("B");
                    else if(x=='C')
                        Letter3.setText("C");
                    else if(x=='D')
                        Letter3.setText("D");
                    else if(x=='E')
                        Letter3.setText("E");
                    else if(x=='F')
                        Letter3.setText("F");
                    else if(x=='G')
                        Letter3.setText("G");
                    else if(x=='H')
                        Letter3.setText("H");
                    else if(x=='I')
                        Letter3.setText("I");
                    else if(x=='J')
                        Letter3.setText("J");
                    else if(x=='K')
                        Letter3.setText("K");
                    else if(x=='L')
                        Letter3.setText("L");
                    else if(x=='M')
                        Letter3.setText("M");
                    else if(x=='N')
                        Letter3.setText("N");
                    else if(x=='O')
                        Letter3.setText("O");
                    else if(x=='P')
                        Letter3.setText("P");
                    else if(x=='Q')
                        Letter3.setText("Q");
                    else if(x=='R')
                        Letter3.setText("R");
                    else if(x=='S')
                        Letter3.setText("S");
                    else if(x=='T')
                        Letter3.setText("T");
                    else if(x=='U')
                        Letter3.setText("U");
                    else if(x=='V')
                        Letter3.setText("V");
                    else if(x=='W')
                        Letter3.setText("W");
                    else if(x=='X')
                        Letter3.setText("X");
                    else if(x=='Y')
                        Letter3.setText("Y");
                    else
                        Letter3.setText("Z");
                }
                else if(d==x)
                {
                    if(x=='A')
                        Letter4.setText("A");
                    else if(x=='B')
                        Letter4.setText("B");
                    else if(x=='C')
                        Letter4.setText("C");
                    else if(x=='D')
                        Letter4.setText("D");
                    else if(x=='E')
                        Letter4.setText("E");
                    else if(x=='F')
                        Letter4.setText("F");
                    else if(x=='G')
                        Letter4.setText("G");
                    else if(x=='H')
                        Letter4.setText("H");
                    else if(x=='I')
                        Letter4.setText("I");
                    else if(x=='J')
                        Letter4.setText("J");
                    else if(x=='K')
                        Letter4.setText("K");
                    else if(x=='L')
                        Letter4.setText("L");
                    else if(x=='M')
                        Letter4.setText("M");
                    else if(x=='N')
                        Letter4.setText("N");
                    else if(x=='O')
                        Letter4.setText("O");
                    else if(x=='P')
                        Letter4.setText("P");
                    else if(x=='Q')
                        Letter4.setText("Q");
                    else if(x=='R')
                        Letter4.setText("R");
                    else if(x=='S')
                        Letter4.setText("S");
                    else if(x=='T')
                        Letter4.setText("T");
                    else if(x=='U')
                        Letter4.setText("U");
                    else if(x=='V')
                        Letter4.setText("V");
                    else if(x=='W')
                        Letter4.setText("W");
                    else if(x=='X')
                        Letter4.setText("X");
                    else if(x=='Y')
                        Letter4.setText("Y");
                    else
                        Letter4.setText("Z");
                }
                else if(e == x)
                {
                    if(x=='A')
                        Letter5.setText("A");
                    else if(x=='B')
                        Letter5.setText("B");
                    else if(x=='C')
                        Letter5.setText("C");
                    else if(x=='D')
                        Letter5.setText("D");
                    else if(x=='E')
                        Letter5.setText("E");
                    else if(x=='F')
                        Letter5.setText("F");
                    else if(x=='G')
                        Letter5.setText("G");
                    else if(x=='H')
                        Letter5.setText("H");
                    else if(x=='I')
                        Letter5.setText("I");
                    else if(x=='J')
                        Letter5.setText("J");
                    else if(x=='K')
                        Letter5.setText("K");
                    else if(x=='L')
                        Letter5.setText("L");
                    else if(x=='M')
                        Letter5.setText("M");
                    else if(x=='N')
                        Letter5.setText("N");
                    else if(x=='O')
                        Letter5.setText("O");
                    else if(x=='P')
                        Letter5.setText("P");
                    else if(x=='Q')
                        Letter5.setText("Q");
                    else if(x=='R')
                        Letter5.setText("R");
                    else if(x=='S')
                        Letter5.setText("S");
                    else if(x=='T')
                        Letter5.setText("T");
                    else if(x=='U')
                        Letter5.setText("U");
                    else if(x=='V')
                        Letter5.setText("V");
                    else if(x=='W')
                        Letter5.setText("W");
                    else if(x=='X')
                        Letter5.setText("X");
                    else if(x=='Y')
                        Letter5.setText("Y");
                    else
                        Letter5.setText("Z");
                }
                else if(f == x)
                {
                    if(x=='A')
                        Letter6.setText("A");
                    else if(x=='B')
                        Letter6.setText("B");
                    else if(x=='C')
                        Letter6.setText("C");
                    else if(x=='D')
                        Letter6.setText("D");
                    else if(x=='E')
                        Letter6.setText("E");
                    else if(x=='F')
                        Letter6.setText("F");
                    else if(x=='G')
                        Letter6.setText("G");
                    else if(x=='H')
                        Letter6.setText("H");
                    else if(x=='I')
                        Letter6.setText("I");
                    else if(x=='J')
                        Letter6.setText("J");
                    else if(x=='K')
                        Letter6.setText("K");
                    else if(x=='L')
                        Letter6.setText("L");
                    else if(x=='M')
                        Letter6.setText("M");
                    else if(x=='N')
                        Letter6.setText("N");
                    else if(x=='O')
                        Letter6.setText("O");
                    else if(x=='P')
                        Letter6.setText("P");
                    else if(x=='Q')
                        Letter6.setText("Q");
                    else if(x=='R')
                        Letter6.setText("R");
                    else if(x=='S')
                        Letter6.setText("S");
                    else if(x=='T')
                        Letter6.setText("T");
                    else if(x=='U')
                        Letter6.setText("U");
                    else if(x=='V')
                        Letter6.setText("V");
                    else if(x=='W')
                        Letter6.setText("W");
                    else if(x=='X')
                        Letter6.setText("X");
                    else if(x=='Y')
                        Letter6.setText("Y");
                    else
                        Letter6.setText("Z");
                }
                else if(g == x)
                {
                    if(x=='A')
                        Letter7.setText("A");
                    else if(x=='B')
                        Letter7.setText("B");
                    else if(x=='C')
                        Letter7.setText("C");
                    else if(x=='D')
                        Letter7.setText("D");
                    else if(x=='E')
                        Letter7.setText("E");
                    else if(x=='F')
                        Letter7.setText("F");
                    else if(x=='G')
                        Letter7.setText("G");
                    else if(x=='H')
                        Letter7.setText("H");
                    else if(x=='I')
                        Letter7.setText("I");
                    else if(x=='J')
                        Letter7.setText("J");
                    else if(x=='K')
                        Letter7.setText("K");
                    else if(x=='L')
                        Letter7.setText("L");
                    else if(x=='M')
                        Letter7.setText("M");
                    else if(x=='N')
                        Letter7.setText("N");
                    else if(x=='O')
                        Letter7.setText("O");
                    else if(x=='P')
                        Letter7.setText("P");
                    else if(x=='Q')
                        Letter7.setText("Q");
                    else if(x=='R')
                        Letter7.setText("R");
                    else if(x=='S')
                        Letter7.setText("S");
                    else if(x=='T')
                        Letter7.setText("T");
                    else if(x=='U')
                        Letter7.setText("U");
                    else if(x=='V')
                        Letter7.setText("V");
                    else if(x=='W')
                        Letter7.setText("W");
                    else if(x=='X')
                        Letter7.setText("X");
                    else if(x=='Y')
                        Letter7.setText("Y");
                    else
                        Letter7.setText("Z");
                }
                else
                {
                 if(noOfchoices == 1)
                     img.setIcon(new ImageIcon("D:\\JAVA mini project\\one.png"));
                 else if(noOfchoices == 2)
                     img.setIcon(new ImageIcon("D:\\JAVA mini project\\two.png"));
                 else if(noOfchoices == 3)
                     img.setIcon(new ImageIcon("D:\\JAVA mini project\\three.png"));
                 else if(noOfchoices == 4)
                     img.setIcon(new ImageIcon("D:\\JAVA mini project\\four.png"));
                 else if(noOfchoices == 5)
                     img.setIcon(new ImageIcon("D:\\JAVA mini project\\five.png"));
                 else if(noOfchoices == 6)
                     img.setIcon(new ImageIcon("D:\\JAVA mini project\\six.png"));
                 noOfchoices++;
                }
                if(!Letter1.getText().equals("") && !Letter2.getText().equals("") && !Letter3.getText().equals("") && !Letter4.getText().equals("") && 
                        !Letter5.getText().equals("") && !Letter6.getText().equals("") && !Letter7.getText().equals(""))
                     res1.setText("YOU WON!");
           }
        }
        else{
            img.setIcon(new ImageIcon("D:\\JAVA mini project\\seven.png"));
            res1.setText("YOU LOSE");
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        J = new javax.swing.JButton();
        K = new javax.swing.JButton();
        L = new javax.swing.JButton();
        M = new javax.swing.JButton();
        N = new javax.swing.JButton();
        O = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        R = new javax.swing.JButton();
        S = new javax.swing.JButton();
        T = new javax.swing.JButton();
        U = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Letter1 = new javax.swing.JTextField();
        Letter2 = new javax.swing.JTextField();
        Letter3 = new javax.swing.JTextField();
        hint = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        Letter4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Letter5 = new javax.swing.JTextField();
        res1 = new javax.swing.JLabel();
        Letter6 = new javax.swing.JTextField();
        Letter7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HARD FRAME");
        setPreferredSize(new java.awt.Dimension(660, 791));
        getContentPane().setLayout(null);

        A.setBackground(new java.awt.Color(204, 0, 51));
        A.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A);
        A.setBounds(120, 610, 50, 50);

        B.setBackground(new java.awt.Color(204, 0, 51));
        B.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        getContentPane().add(B);
        B.setBounds(370, 660, 50, 50);

        C.setBackground(new java.awt.Color(204, 0, 51));
        C.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        getContentPane().add(C);
        C.setBounds(270, 660, 50, 50);

        D.setBackground(new java.awt.Color(204, 0, 51));
        D.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        getContentPane().add(D);
        D.setBounds(220, 610, 50, 50);

        E.setBackground(new java.awt.Color(204, 0, 51));
        E.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        E.setText("E");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        getContentPane().add(E);
        E.setBounds(200, 560, 50, 50);

        F.setBackground(new java.awt.Color(204, 0, 51));
        F.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        getContentPane().add(F);
        F.setBounds(270, 610, 50, 50);

        G.setBackground(new java.awt.Color(204, 0, 51));
        G.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        G.setText("G");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });
        getContentPane().add(G);
        G.setBounds(320, 610, 50, 50);

        H.setBackground(new java.awt.Color(204, 0, 51));
        H.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        H.setText("H");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        getContentPane().add(H);
        H.setBounds(370, 610, 50, 50);

        I.setBackground(new java.awt.Color(204, 0, 51));
        I.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        I.setText("I");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });
        getContentPane().add(I);
        I.setBounds(450, 560, 50, 50);

        J.setBackground(new java.awt.Color(204, 0, 51));
        J.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        J.setText("J");
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });
        getContentPane().add(J);
        J.setBounds(420, 610, 50, 50);

        K.setBackground(new java.awt.Color(204, 0, 51));
        K.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        K.setText("K");
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });
        getContentPane().add(K);
        K.setBounds(470, 610, 50, 50);

        L.setBackground(new java.awt.Color(204, 0, 51));
        L.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        L.setText("L");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });
        getContentPane().add(L);
        L.setBounds(520, 610, 50, 50);

        M.setBackground(new java.awt.Color(204, 0, 51));
        M.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        M.setText("M");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });
        getContentPane().add(M);
        M.setBounds(470, 660, 50, 50);

        N.setBackground(new java.awt.Color(204, 0, 51));
        N.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        N.setText("N");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });
        getContentPane().add(N);
        N.setBounds(420, 660, 50, 50);

        O.setBackground(new java.awt.Color(204, 0, 51));
        O.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        O.setText("O");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });
        getContentPane().add(O);
        O.setBounds(500, 560, 50, 50);

        P.setBackground(new java.awt.Color(204, 0, 51));
        P.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        P.setText("P");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });
        getContentPane().add(P);
        P.setBounds(550, 560, 50, 50);

        Q.setBackground(new java.awt.Color(204, 0, 51));
        Q.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        Q.setText("Q");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });
        getContentPane().add(Q);
        Q.setBounds(100, 560, 50, 50);

        R.setBackground(new java.awt.Color(204, 0, 51));
        R.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        R.setText("R");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });
        getContentPane().add(R);
        R.setBounds(250, 560, 50, 50);

        S.setBackground(new java.awt.Color(204, 0, 51));
        S.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        S.setText("S");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });
        getContentPane().add(S);
        S.setBounds(170, 610, 50, 50);

        T.setBackground(new java.awt.Color(204, 0, 51));
        T.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        T.setText("T");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });
        getContentPane().add(T);
        T.setBounds(300, 560, 50, 50);

        U.setBackground(new java.awt.Color(204, 0, 51));
        U.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        U.setText("U");
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });
        getContentPane().add(U);
        U.setBounds(400, 560, 50, 50);

        V.setBackground(new java.awt.Color(204, 0, 51));
        V.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        V.setText("V");
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });
        getContentPane().add(V);
        V.setBounds(320, 660, 50, 50);

        W.setBackground(new java.awt.Color(204, 0, 51));
        W.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        W.setText("W");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });
        getContentPane().add(W);
        W.setBounds(150, 560, 50, 50);

        X.setBackground(new java.awt.Color(204, 0, 51));
        X.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        getContentPane().add(X);
        X.setBounds(220, 660, 50, 50);

        Y.setBackground(new java.awt.Color(204, 0, 51));
        Y.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        Y.setText("Y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });
        getContentPane().add(Y);
        Y.setBounds(350, 560, 50, 50);

        Z.setBackground(new java.awt.Color(204, 0, 51));
        Z.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        Z.setText("Z");
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });
        getContentPane().add(Z);
        Z.setBounds(170, 660, 50, 50);

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Sitka Small", 3, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 0, 51));
        jCheckBox1.setText("Use hint?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(560, 750, 130, 33);

        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("_______");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 470, 60, 16);

        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("_______");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 470, 90, 16);

        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("_______");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 470, 60, 16);
        getContentPane().add(Letter1);
        Letter1.setBounds(110, 420, 50, 50);
        getContentPane().add(Letter2);
        Letter2.setBounds(180, 420, 50, 50);
        getContentPane().add(Letter3);
        Letter3.setBounds(250, 420, 50, 50);
        getContentPane().add(hint);
        hint.setBounds(330, 130, 310, 240);
        getContentPane().add(img);
        img.setBounds(90, 150, 140, 200);

        Letter4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letter4ActionPerformed(evt);
            }
        });
        getContentPane().add(Letter4);
        Letter4.setBounds(320, 420, 50, 50);

        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("_______");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 470, 60, 16);
        getContentPane().add(Letter5);
        Letter5.setBounds(390, 420, 50, 50);

        res1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        res1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(res1);
        res1.setBounds(280, 510, 140, 30);
        getContentPane().add(Letter6);
        Letter6.setBounds(460, 420, 50, 50);
        getContentPane().add(Letter7);
        Letter7.setBounds(530, 420, 50, 50);

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("_______");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 470, 50, 16);

        jLabel6.setBackground(new java.awt.Color(204, 0, 51));
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("_______");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 470, 50, 16);

        jLabel7.setBackground(new java.awt.Color(204, 0, 51));
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("_______");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(530, 470, 60, 16);

        jLabel8.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("            GUESS THE WORD");
        jLabel8.setMaximumSize(new java.awt.Dimension(560, 56));
        jLabel8.setMinimumSize(new java.awt.Dimension(560, 56));
        jLabel8.setPreferredSize(new java.awt.Dimension(560, 56));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 20, 700, 60);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 51));
        jButton2.setText("New Game");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 730, 150, 31);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 700, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
        choose('B');
    }//GEN-LAST:event_BActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        // TODO add your handling code here:
        choose('G');                    
    }//GEN-LAST:event_GActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        // TODO add your handling code here:
        choose('K');
    }//GEN-LAST:event_KActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // TODO add your handling code here:
        choose('L');                  
    }//GEN-LAST:event_LActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
       choose('M');
    }//GEN-LAST:event_MActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        // TODO add your handling code here:
        choose('Z');
    }//GEN-LAST:event_ZActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        // TODO add your handling code here:
        choose('S');
    }//GEN-LAST:event_SActionPerformed

    private void Letter4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letter4ActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_Letter4ActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        // TODO add your handling code here:
        choose('E');                 
    }//GEN-LAST:event_EActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        // TODO add your handling code here:
        choose('I');
    }//GEN-LAST:event_IActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        // TODO add your handling code here:
        choose('U');   
    }//GEN-LAST:event_UActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
        choose('A');
    }//GEN-LAST:event_AActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        choose('C');
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
        choose('D');
    }//GEN-LAST:event_DActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        // TODO add your handling code here:
        choose('F');
    }//GEN-LAST:event_FActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        // TODO add your handling code here:
        choose('H');
    }//GEN-LAST:event_HActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        // TODO add your handling code here:
        choose('J');
    }//GEN-LAST:event_JActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        // TODO add your handling code here:
        choose('N');
    }//GEN-LAST:event_NActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        // TODO add your handling code here:
        choose('O');
    }//GEN-LAST:event_OActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        // TODO add your handling code here:
        choose('P');
    }//GEN-LAST:event_PActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        // TODO add your handling code here:
        choose('Q');
    }//GEN-LAST:event_QActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        // TODO add your handling code here:
        choose('R');
    }//GEN-LAST:event_RActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        // TODO add your handling code here:
        choose('T');
    }//GEN-LAST:event_TActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        // TODO add your handling code here:
        choose('V');
    }//GEN-LAST:event_VActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        // TODO add your handling code here:
        choose('W');
    }//GEN-LAST:event_WActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
        choose('X');
    }//GEN-LAST:event_XActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        // TODO add your handling code here:
        choose('Y');
    }//GEN-LAST:event_YActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(word.equals("BELGIUM"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\belgium.png"));
        else if(word.equals("DENMARK"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\denmark.png"));
        else if(word.equals("ICELAND"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\iceland.png"));
        else if(word.equals("GERMANY"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\germany.png"));
        else if(word.equals("IRELAND"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\ireland.png"));
        else if(word.equals("OSTRICH"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\ostrich.jfif"));
        else if(word.equals("PELICAN"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\pelican.jfif"));
        else if(word.equals("READING"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\reading.jfif"));
        else if(word.equals("BROWNIE"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\brownie.jfif"));
        else if(word.equals("SPINACH"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\spinach.jfif"));
        else if(word.equals("APRICOT"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\apricot.jfif"));
        else if(word.equals("PEANUT"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\peanut.png"));
        else if(word.equals("UNIFORM"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\uniform.png"));
        else if(word.equals("PARSLEY"))
                hint.setIcon(new ImageIcon("D:\\JAVA mini project\\ImagesProject\\parsley.jfif"));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Level wo = new Level();
        wo.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        HardWord wo = new HardWord();
        wo.generate();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JTextField Letter1;
    private javax.swing.JTextField Letter2;
    private javax.swing.JTextField Letter3;
    private javax.swing.JTextField Letter4;
    private javax.swing.JTextField Letter5;
    private javax.swing.JTextField Letter6;
    private javax.swing.JTextField Letter7;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JLabel hint;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel res1;
    // End of variables declaration//GEN-END:variables
}