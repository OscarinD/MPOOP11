/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop11;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class MPOOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Crearemos errores de tipo excepciòn
        // TODO code application logic here
        try{
            String [] mensajes = {"mensaje 1","mensaje 2","mensaje 3"};
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]);//Imprimirà 3 elementos y despuès arrojarà una excepciòn
                //ocurriò en el main, marca que el ìndica està incorrecto en la lìnea 29
            }
        }catch(ArrayIndexOutOfBoundsException ex){//copio la variable de la terminal que atraparà la excepciòn, es decir el tipo de excepciòn, ex es variable
            System.out.println(ex.getMessage());
            }
        System.out.println("Sigue el còdigo");
        System.out.println("####### Divisòn entre cero ######");
        try{
            float x = 10/0;//si en vez de cero pongo un 2, ¡què pasa?
            System.out.println("x = "+x);
        }catch(ArithmeticException ex){
            System.out.println("Error "+ex.getMessage());
        }finally{
            System.out.println("A pesar de todo se ejecuta el finally");//Se ejecuta, haya o no excepciòn
            //Comentar los dos try
        }
        System.out.println("####### Catch anidados ######");
        try{
            float x = 10/0;//si en vez de cero pongo un 2, ¡què pasa?
            System.out.println("x = "+x);
        }catch(ArrayIndexOutOfBoundsException ex){//copio la variable de la terminal que atraparà la excepciòn, es decir el tipo de excepciòn, ex es variable
            System.out.println(ex.getMessage());
        }catch(ArithmeticException ex){
            System.out.println("Error "+ex.getMessage());
        }finally{
            System.out.println("A pesar de todo se ejecuta el finally");//Se ejecuta, haya o no excepciòn
            //Comentar los dos try
        }
        System.out.println("######## Propagaciòn de excepciones ###############");
        try{//aquì se lanza el metodo donde se puede lanzar una excepcioòn
            double division = miMetodoDivision(20.0f, 0);//Lanza excepciòn, hay soporte con divisòn entre 0
            System.out.println(division);//dentro del mètodo o dondela llamamos podemos contorlar la excpciòn
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("####### Mi cuenta ###########");
        Cuenta cuenta = new Cuenta();
        try {
            System.out.println(cuenta.getSaldo());
            cuenta.depositar(1000);
            System.out.println(cuenta.getSaldo());
            cuenta.retirar(1500);
            System.out.println(cuenta.getSaldo());
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
        //System.out.println(cuenta.getSaldo());//No puedo tener nùmero negativo en una cuenta
        System.out.println("Saldo final = "+cuenta.getSaldo());
        //No puede depositar màs de 20000
        //No puede hacer màs de 3 retiros
        
        System.out.println("######### Actividad extra ################");
        Cuenta cuenta1 = new Cuenta();
        try{
            System.out.println(cuenta1.getSaldo());
            cuenta1.depositar(20000);
            System.out.println(cuenta1.getSaldo());
            cuenta1.depositar(20000);
            System.out.println(cuenta1.getSaldo());
            cuenta1.retirar(1000);
            System.out.println(cuenta1.getSaldo());
            cuenta1.retirar(2000);
            System.out.println(cuenta1.getSaldo());
            cuenta1.retirar(3000);
            System.out.println(cuenta1.getSaldo());
            cuenta1.retirar(4000);
        }catch(LimiteDepositoException ex){
            System.out.println(ex.getMessage());
        }catch(LimiteRetirosException ex){
            System.out.println(ex.getMessage());
        }catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    /*private static float miMetodoDivision(double d, double d0) {//Se creo con el foquito, estpatico siempre va a estar ahì, todo lo que esta al lado de main tiene que ser estàtico
        throw new UnsupportedOperationException("No se soporta todavìa."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }//privado, excepciòn que no soporta la operaciòn, constructor: UnsupportedOperation..., cuando hay una excepciòn, se crea con new la excepciòn
    //Throw lanza la excepciòn
    */

    private static double miMetodoDivision(float f, double d) throws ArithmeticException{
        return f/d;
    }
    
}
