/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // char caracter = 'A';
        // int c = caracter;
        // System.out.println((int)caracter);
        
        for (int i = 97; i <= 122; i++) {
                                          //    V     || F    >>> V
            if ( (i==101) || (i==105) ) { // 101==101 || 101==105 
                System.out.printf("%s |%d|\n", (char)i, i);
            }
            
            // if ((char)i=='e') {
            //    System.out.printf("%s |%d|\n", (char)i, i);
            // }
            
        }
        
        /*
        for (int i = 65; i <= 90; i++) {
             System.out.printf("%s |%d|\n", (char)i, i);
        }*/
        
        
        
    }
    
}
