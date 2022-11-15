
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS
 */
public class Tugas1_KataTerakhirVersiScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter word1 : ");
        String word1 = in.nextLine();
        
        System.out.print("Enter word2 : ");
        String word2 = in.nextLine();
        
        System.out.print("Enter word3 : ");
        String word3 = in.nextLine();
        
        System.out.println(word1 +" " +word2 +" " +word3 );
    }
}
