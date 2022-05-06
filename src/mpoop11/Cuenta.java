/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 *
 * @author alumno
 */
public class Cuenta {
    private float saldo;//todas las variable primitiva se iniciailzan en cero, por lo tanto, el saldo està en cero
    public int i=0;

    public Cuenta() {//Cuenta cero pesos, contructor vacìo, no es necesario tener paràmetros
    }

    public float getSaldo() {
        return saldo;
    }
    
    public void depositar(float monto) throws LimiteDepositoException{
        System.out.println("Depositando...");
        if(monto>20000){
            throw new LimiteDepositoException();
        }else{
            saldo+=monto;
        }
    }
       
    public void retirar(float monto) throws SaldoInsuficienteException, LimiteRetirosException{//Indica que se puede lanzar una excepciòn
        System.out.println("Retirando..."+monto);
    i++;
    if(i>3){
        throw new LimiteRetirosException();
    }else if(saldo<monto){
                throw new SaldoInsuficienteException();
            }else{
                saldo-=monto;
            }
    }
}
