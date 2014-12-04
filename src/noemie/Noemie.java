/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noemie;

/**
 *
 * @author Noëmie
 */
public class Noemie {

    /**
     * @param args the command line arguments
     */
    static int i = 0;
    public static void main(String[] args) {
        System.out.println("Hello word !");
        Lapin lap = new Lapin("Panpan", 4);
        while(i < 10){
            lap.crier();
            i = i + 1;
        }
    }
    
}
