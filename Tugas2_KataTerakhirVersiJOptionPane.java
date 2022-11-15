
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS
 */
public class Tugas2_KataTerakhirVersiJOptionPane {
    public static void main(String[] args) {
        String word1 = " ", word2 = " ", word3 = " ";
        
        word1 = JOptionPane.showInputDialog("Enter word1 : ");
        word2 = JOptionPane.showInputDialog("Enter word2 : ");
        word3 = JOptionPane.showInputDialog("Enter word3 : ");
        
        String msg = word1 +" " +word2 +" " +word3;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(word1 +" " +word2 +" " +word3);
    }
}
