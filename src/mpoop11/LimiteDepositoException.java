/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 *
 * @author alumno
 */
public class LimiteDepositoException extends Exception{

    public LimiteDepositoException() {
        super("No puedes depositar màs de 20,000");
    }
    
}
