/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author USUARIO PC
 */
public class Problema02 {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        double sumaM = 0;
        double sumaMin= 0;
        char valor;
        String cadenaF ="";
        String cadenam = "";
         for (int i = 0; i < cadena.length(); i++) {
             valor = cadena.charAt(i);
              if (((char)valor >= 65) && ((char)valor<=90)){
                  sumaM = sumaM + 1;
                  cadenam= String.format("%.2f\n",(sumaM));
                }else{
                  if (((char)valor >= 97) && ((char)valor<=122)){
                  sumaMin = sumaMin + 1;
                  cadenaF = String.format("%.2f\n",(sumaMin));     
              }
            }
        
        }
        System.out.printf("Suma mayúscula:\n%sSuma minúscula:\n%s",cadenam,
                cadenaF);  
    }
}    
