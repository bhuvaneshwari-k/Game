package org.example;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class Game{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        PrintStream l=new PrintStream((new FileOutputStream(FileDescriptor.out)));
        GameBoard b=new GameBoard();
        l.println("Enter the player1 name:");
        String name1=s.nextLine();
        l.println("Enter the player1 key:");
        char key1=s1.next().charAt(0);
        l.println("Enter the player2 name:");
        String name2=s.nextLine();
        l.println("Enter the player2 key:");
        char key2=s1.next().charAt(0);
        l.println("1.Player1\n2.Player2");
        l.println("Enter the choice that which player you want to play first:");
        int ch= s1.nextInt();
        int count1=0;
        if(ch==1) {
            while(count1<9) {
                b.position(name1,key1);
                b.position(name2,key2);
                count1=count1+2;
            }
        }
        else {
            while(count1<9) {
                b.position(name2,key2);
                b.position(name1,key1);
                count1=count1+2;
            }
        }
    }
}