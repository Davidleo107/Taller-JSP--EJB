/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author David Reinoso
 */
@Local
public interface calcbeanLocal {

    Integer suma(int num1, int num2);

    Integer resta(int num1, int num2);
    
    Integer multiplicacion(int num1, int num2);

    Integer division(int num1, int num2);
    
    Integer modulo(int num1, int num2);

    Integer potencia(int num1);
    
}
