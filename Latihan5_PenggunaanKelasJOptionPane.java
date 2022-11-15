
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
public class Latihan5_PenggunaanKelasJOptionPane {
    public static void main(String[] args) {
        String name ="", hoby ="";
        
        name = JOptionPane.showInputDialog("Nama Anda : ");
        hoby = JOptionPane.showInputDialog("Hobi Anda : ");
        
        String msg = "Jadi Hobi Anda "+hoby+". "+ "Hobi yang bagus "+name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi Hobi Anda "+hoby+". Hobi yang bagus" + name);
    }
    
}
