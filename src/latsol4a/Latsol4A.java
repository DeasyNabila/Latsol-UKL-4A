/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsol4a;

/**
 *
 * @author MOKLET-1
 */
public class Latsol4A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sukupertama = 5;
        int selisih = 5;
        int sukuterakhir = 50;
        int sukusaatini = 0;
        
        for (int i = 0; i < 5; i++){
            for (int a = 0; a < i; a++){
                sukusaatini = sukupertama;
                sukupertama += selisih;
                System.out.print(sukusaatini+" ");
            }
            System.out.println(" ");
        }
    }
    
}
