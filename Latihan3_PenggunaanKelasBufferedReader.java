
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
public class Latihan3_PenggunaanKelasBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hoby = "";
        
        try {
            System.out.print("Nama Anda :");
            name = dataIn.readLine();
            System.out.print("Hobi Anda :");
            hoby = dataIn.readLine();
        }       
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        } 
        
        System.out.println("Jadi Hobi Anda "+hoby+". Hobi yang bagus " + name);
    }
}
