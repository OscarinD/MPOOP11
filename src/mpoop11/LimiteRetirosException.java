/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 *
 * @author alumno
 */
public class LimiteRetirosException extends Exception{

    public LimiteRetirosException() {
        super("Solo se puede retirar 3 veces");
    }
    
}
