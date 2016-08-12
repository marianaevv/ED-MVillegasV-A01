/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.mvillegas.a01;

/**3 -1
 *
 * @author Mariana Villegas
 */
public class NotacionBinaria {
    
    
    public static int convertir(int n, int resultado){//Metodo para reducir imprimir el numero de escalones que se van bajando.
        resultado = n/2;
        if (resultado mod 0){//Caso base, condicion en la que cuando se cumpla, el metodo dejara de llamarse.
           return 0;
        } else {
            System.out.println();//Dominio, mientras el caso base no se cumpla vamos a imprimir n.
            return convertir(n-1); // Se va a seguir llamando al metodo para reducir el numero de escalones y poder imprimirlos cuando se vuelva llamar.
            
        }
      
    }
}
