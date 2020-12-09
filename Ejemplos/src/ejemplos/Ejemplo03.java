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
public class Ejemplo03 {

    public static void main(String[] args) {
        String cadena = "Loja";
        String reporte = "";
        for (int i = 0; i < cadena.length(); i++) {
            reporte = String.format("%s%s", reporte, cadena.charAt(i));
            char v = cadena.charAt(i);
            
            for (int j = 65; j <= 122; j++) {
                if (v == (char)j) {
                    reporte = String.format("%s (%s)\n", reporte, j);
                }

            }

        }

        System.out.printf("%s\n", reporte);
    }
}
