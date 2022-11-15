
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS
 */
public class Tugas1_KataTerakhirVersiBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String word1 = " ", word2 = " ", word3 = " ";
        
        try{
            System.out.print("Enter Word1 : ");
            word1 = dataIn.readLine();
            System.out.print("Enter Word2 : ");
            word2 = dataIn.readLine();
            System.out.print("Enter Word3 : ");
            word3 = dataIn.readLine();
        }
        
        catch (IOException e){
            System.out.println("gagal membaca keyboard");     
        }
        System.out.println(word1 +" " +word2 +" " +word3);
    }
}
